package com.inter;
//interface�� implements�ص� ��Ӱ� ����
class Truck{}
interface Other{
	//�߻�޼ҵ�...
}

public class ICircle extends Truck implements IShape, Other { //�������̽��� ���� ����� �����ϴ�. �� ��� �θ�
	int r;
	
	public ICircle(int r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return 3.14 * r * r;
	}

	@Override
	public double getCircum() {
		return 2 * 3.14 * r;
	}

}
