package com.computer;

public class KeyBoard extends Parts {
	String type;
	
	public KeyBoard(String type, String maker, int price) {
		super(maker, price); //�θ�������� ����Ʈ����� �ڵ����� �������� �ʰ� �Ķ���� 2���� �� �����Ƿ� �� �κ��� �����־����!!!!
		this.type = type;
	}

	public void keyType(){
		System.out.println("KeyBoard typing...");
	}
	
	public void info() {
		super.info();
		System.out.println("type:" + type);
	}	
}
