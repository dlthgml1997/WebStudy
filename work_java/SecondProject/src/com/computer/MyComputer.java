package com.computer;

public class MyComputer {
	//field:data Ŭ�������� �����͸� �Ǵٸ� Ŭ������ ����
	Monitor mon;
	Mouse mouse;
	KeyBoard key;
	MainFrame frame;
	
	//������
	public MyComputer() {
		mon = new Monitor(12.5 , "samsung", 3500000);
		//Monitor mon = new Monitor(12.5 , "samsung", 3500000); //������ �ȿ� ����� ���������� mon, ���� �ʵ��� mon�� ������������
		mouse = new Mouse("logitec", true , 55000);
		key = new KeyBoard("abc" , "sun-mouse", 100000);
		frame = new MainFrame("intel" , "xyz", 5000000);
	}
	
	public void info() {
		mon.info();
		mouse.info();
		key.info();
		frame.info();
	}
	
	public void powerOn(){
		//monitor, frame�� ���� �ѱ�
		mon.powerOn();
		frame.powerOn();
	}
	public void powerOff() {
		//monitor, frame�� ���� �ѱ�
		mon.powerOff();
		frame.powerOff();
	}
	public void doJob() {
		//���콺 ��/������ Ŭ��, �ٸ� �޼ҵ� ȣ��
		mouse.leftClick();
		mouse.rightClick();
		mouse.wheeling();
		//Ű���� Ÿ���� �޼ҵ� ȣ��
		key.keyType();
	}
	
	public static void main(String[] args) {
		MyComputer computer = new MyComputer();
		computer.powerOn();
		computer.doJob();
		computer.powerOff();
		computer.info();
	}

}
