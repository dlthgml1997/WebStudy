package com.inter;

class Tom{
	int age = 55;
}
class Bill{}
interface Hillary{
	//�������̽� ���� �ʵ�� �⺻���� static���� final�̴�!!!!
	int age = 50; //������ ���������� static�� ���� �� �� �ִ�.
}

public class LittleTom extends Tom implements Hillary {
	int age = 25; //��Ʋ���� 3���� age������ ����
	
	void test() {
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age); //���� Ŭ������ �ʵ尪
		//Hillary.age = 52;
		System.out.println(Hillary.age); //���� �������̽��� �ʵ尪 (�������̽��� �������� �ʰ� �̸����� �ʵ尪�� ������ �� �ִ�!!!!!)
	}
	
	public void main(String[] args) {
		LittleTom little = new LittleTom();
		
		if(little instanceof Tom) {
			System.out.println("instanceof Tom");
		}
		if(little instanceof Hillary) {
			System.out.println("instanceof Hillary");
		}
		if(little instanceof LittleTom) {
			System.out.println("instanceof LittleTom");
		}
		if(little instanceof Object) {
			System.out.println("instanceof Object");
		}
//		if(little instanceof Bill) {
//			System.out.println("instanceof Bill");
//		} //��Ӱ��谡 �ƴϱ� ������ �񱳺Ұ�
		
	}
}
