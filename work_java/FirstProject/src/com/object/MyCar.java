package com.object;

public class MyCar {
	int num =1234;
	String color ="red";
	int year = 2019;
	String model = "x5";
	
	
	
	public static void main(String[] args) {
		MyCar m = new MyCar();
		System.out.println(m); //���۷����� �� toString�� ȣ��ǹǷ� �Ʒ��ٰ� ���� ����� ���´�.
		System.out.println(m.toString()); //�θ��� Object���� �����پ��� �ִ� to String, ��Ű��.Ŭ����@Hex Hash code �ּҰ�.
		
	}



	@Override //Generate toString ���� Ŭ������ �ʵ带 ��� ����ϴ� �޼��带 �������!
	public String toString() {
		return "MyCar [num=" + num + ", color=" + color + ", year=" + year + ", model=" + model + "]";
	}

//	//toString() Overriding
//	@Override
//	public String toString() {
//		return "MyClass -> 2019�� 7�� 23��. �ۼ���: ȫ�浿.  ���� ������ ������ �ִ� Ŭ����.";
//	}
	

}
