package com.object;
//<����>�� �ǹ̸� �˾ƺ��� (generic)
//Ŭ���� ���� �ʵ� Ÿ���� ������ Ÿ���� �ƴ� ��Ÿ�ӿ� �����ϴ� ���
public class MyTest<X> { //X��� Ÿ���� ����� �ɰ��̴�.(�����Ͻ��ѵ� � Ÿ�������� �� ������������) but �̿ϼ� Ŭ������ �ƴϴ�!
	//field ����
	int a; 
	String b;
	X what;
	
	public X getWhat() {
		return what;
	}

	public void setWhat(X what) {
		this.what = what;
	}

	public static void main(String[] args) { //�ٸ�Ŭ������ ������
		MyTest<String> t = new MyTest<>(); //"��ü ������=�����"!!! �� �� X�� Ÿ���� �����ȴ�! 
		MyTest<Integer> t2 = new MyTest<>(); //���� Heap�� ���� Ŭ����Ÿ�� ��ü�� ������ ���� XŸ���� �ٸ���!!!!
		
		t.setWhat("hello, generic...");
		t2.setWhat(123);
		
		System.out.println(t.getWhat());
		System.out.println(t2.getWhat());
		
	}

}
