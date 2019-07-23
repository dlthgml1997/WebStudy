package com.object;

public class Car { //Ŭ���� ����
	//1. data(field, member field) = �������� (Ŭ���� ���ο��� ����Ҽ� �ִ�.)
	//�ʱ�ȭ �ȵ� �κ��� �⺻������ ���´�. = Ŭ�������� �ʵ�(��������)��" default��"�� �����ϰ� �Ʒ��� ����
	int num; //0 
	String owner; //�������� null
	String model; //null
	boolean flag; //false
	double d; //0.0

	//constructor : ��ü �����ÿ� �ڵ� ����Ǵ� �޼ҵ�
	//Ŭ���� �̸��� �޼ҵ� ���� �����ؾ� �ϰ� ����Ÿ���� ��������
	
	//"default ������!" : "�Ķ���Ͱ� ����" ������
	Car(){ //Car c = new Car();�� ��ü ������ ����Ǵ� ������
		//this.num = 0;
		this(0); //int�� �ϳ� �޴� �����ڸ� ȣ���ؼ� ��� �Ķ���͸� �����ϰ� ��Ų��.
	}
	
	Car(int num){
		//�Ķ���Ϳ� Ŭ������ �ʵ尡 �̸��� ���� ���, �Ķ���Ͱ� �켱�̹Ƿ�, �ʵ��̸� �տ��� this�� �ٿ����Ѵ�!
		//this.num = num;
		this(num, "xyz"); //���� �Ҷ� ���� �κ��� ���� ���� ���ؼ� �־��ش�. 
	}
	
	Car (int num, String owner){
		//this.num = num;
		//this.owner = owner;
		this(num, owner, "abc");
		
	}
	
/*	Car(int num, String model){
		this.num = num;
		this.model =model;
	}
	
	Car(String model, int num){ // �Ķ���� ������ �Ķ���� Ÿ������ �ٷ� ���� �����ڿ� ���еȴ�~
		this.num = num;
		this.model =model;
	}*/
	
	
	Car(int num, String model, String owner){ //�굵 �������̴�~ �̰� �Ķ���Ͱ� �ִ� ������. Car()�� �Ķ���� ������ �����Ѵ�.
		this.num = num; //this��� Ű���� = ���� �� "new�� ������ ��ü"�� ����!!!!
		this.model = model; 
		this.owner = owner;
	}
	
	//�����ڰ� ������ ->"��ü�� ����� �ִ� ���"�� ��������� ��
	
	//2. method
	void run() {
		String color = "red"; //�޼ҵ� �ȿ��� ����Ǿ��� ������ �� �޼ҵ� �ȿ����� ����� �� �ִ�.
		System.out.println("running car!");
	}
	
	void stop() {
		int year= 1994; 
		//year�� Ŭ������ �ʵ�� �ƴϰ� "�޼ҵ� ���� ����(local)����" -> "default���� ��� �ʱ�ȭ(�� setting)�� �ʿ�"��!!!
		System.out.println("stopping car!" + year);
	}
	void info() {
		System.out.println("num:"+num);
		System.out.println("model:"+model);
		System.out.println("num:"+owner);
		System.out.println("----------------------------");
	}
}
