package com.object;
//�θ� Ŭ����
class Parent{
	String name = "tom";
	String address = "seoul";
	//������
	Parent(){
		System.out.println("Parent ������");
	}
	
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
}
//�ڽ� Ŭ����
public class Child extends Parent { //��ӹ޾Ƽ� �پ� �� �ְԵ� .//�����ϳ��� Ŭ������ ������ ���� ���� �ִ�. 
	String email = "me@me.com";
	//������
	Child(){
		System.out.println("Child ������");
	}
	
	//method overriding : �θ𿡰� �������� �޼��带 �ڽ�Ŭ������ �°� �����ϴ� �� - ���� ���ʹ� �������̵� ��(������ ��) �޼ҵ�� ������ �ȴ�~
	//1.�޼ҵ��̸�, 2.����Ÿ��, 3.�Ķ���͸� �����ϸ� �ȵǰ� ���ƾ���(���ľ ���븸 ��ĥ �� ����!)
	////���������ڴ� ������ �� ����! �θ��� �������� �ڽ��� ���������ڰ� ���ų� �о����� ������.
	@Override ////annotation(���α׷��� ���� ������ ���� ����, �ܼ��� ���������� ������ ��� - ������ ��)
	protected String getName() {
		return "tomson";
	}
	
	void go() {
		System.out.println(super.name); //"�������̵��� �Ŀ�" "�θ��� �޼���"�� ȣ���ϰ� ���� ��� "super."���(���۸� ���� �ȳ�����)!!!! - 2����ø�ؼ� ���X, �Ѱ��Ѱ� �ö󰡾���
	}
	
	public static void main(String[] args) { 
		//��Ӱ��谡 �����ϴ� �ڽ� ��ü�� �����ϸ� �޸𸮿� �θ� ��ü�� ���� �����ȴ�.
		//Child c = new Child(); //��������� �ڽ� ��ü�� ������ ��, �θ� ���������Ǹ鼭 �θ��� �����ڰ��켱 ȣ��ǰ�, �ڽ� ��ü�� �����ȴ�!!
		Parent c = new Child(); //��Ӱ��迡�� �θ� �ڽĺ��� Ÿ���� �� ŭ //������
		
		System.out.println(c.getAddress()); //�θ𿡰� ��ӹ��� �޼��� ��� ����
		System.out.println(c.getName()); //"c�� �θ�Ÿ��"�̹Ƿ� ������ "tom"�� ���;� ������, �޼��尡 "�������̵�(������)"�Ǿ������� "������" �ڽĲ��� ȣ��!!(�Ʒ��� �� �귯����!!!!) -> "tomson" 
		//System.out.println(c.go); //go�� �ڽ�Ÿ�Կ��� ���ǵ� �޼��� �̹Ƿ� c���۷��������� ���Ұ�
		//System.out.println(super.getName()); 
			//static�� �پ��ִ� �޼��忡�� super�� this ���ȵ�!!!! -> go()���� ��������
		Child d = (Child)c; //��ü�� type casting : ���� ��ü c�� ���������� Child(���� Ÿ��)�� ����־��� ������ ����
							//�ݴ��� �������� ������ ������ �ȵ� �� �ִ�.
		
		d.go();
		
	}

}
