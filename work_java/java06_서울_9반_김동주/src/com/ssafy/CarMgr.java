package com.ssafy;

public class CarMgr {
	private static CarMgr instance;
	private Car[] cars = new Car[100];
	private int index;
	//������
	private CarMgr() {}
	//
	public static CarMgr getInstance() {
		if (instance == null) {
			instance = new CarMgr(); 
		}
		return instance;
	}
	//�ۼ��ϴ� �޼���
	public void add(Car c) {
		cars[index]=c;
		index++; //������ 100���Ѱ� ������ ��� �ϴ°�?
	}
	public Car[] search() {
		return cars;}
	public Car search(String num) {
		for(Car x: cars) {
			if (x!=null) {
				if (x.getNum().equals(num))//Integer.parseInt()
					return x;
			}
		}
		return null;//������ȣ����
	}
	public Car[] search(int price) {
		int count =0;
		for(Car x: cars) {
			if (x!=null) {
				if (x.getPrice() < price)//Integer.parseInt()
					count++;
			}
		}
		Car[] cheaps = new Car[count+1];
		count = 0;
		for(Car y: cars) {
			if (y!= null) {
				if (y.getPrice() < price)
					cheaps[count] = y;
					count++;
			}
		}
		return cheaps;
	} //�� ������ ������
	public void update(String num, int price) {
		for(Car x: cars) {
			if (x!=null) {
				if ((x.getNum()).equals(num)) {
					x.setPrice(price);
				}
			}
		}
	}
	public void delete(String num) {
		//int size = size();
		for(int i=0; i<100; i++) {
			if (cars[i] != null) {
				if ((cars[i].getNum()).equals(num)) {
					cars[i] = null;// x = null�δ� �Ⱦ�����!! ������ �׷���!(���ֱ��ε� �̷��� �������� ;;;)
/*					x.setNum(null);
					x.setModel(null);
					x.setPrice(0);
					if( x instanceof Truck) {
						((Truck) x).setTon(0);
					}else if( x instanceof Bus) {
						((Bus) x).setSeat(0);
					}*/
					
				}
			}
		}
	}
	public int size() {
		int count=0;
		for(Car x: cars) {
			if(x!=null) count++; //100ĭ�� ���� �ƴѰ��� ���� ����
		}
		return count;
	}
	public int totalPrice() {
		int price =0;
		for(Car x:cars) {
			if(x!=null)
				price += x.getPrice();
		}
		return price;
	}

	
	
	
	
}
