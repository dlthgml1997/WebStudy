package com.basic;

public class LoopTest {

	public static void main(String[] args) {
		// for
		for(int i = 0; i < 5; ++i) { //���ǽĿ��� i++ �� ++i�� �����ϰ� �۵�, �ʱⰪ���� Ÿ�� ǥ���������
			if(i ==3) 
				//continue; //������ ���� �� ��Ƽ���� �ݺ��۾��� skip�ϰ� "���� i"�� ���� �ݺ��۾� ����
				break; //������ ���� �� �극��ũ�� �ݺ��۾��� ��� "stop"
				//���ʿ��� �ݺ��۾��� ���Ӥ�
			System.out.println(i + ". hello");
		}
		System.out.println("-----------------------------");
		
		//while
		int j = 0; //�ʱⰪ
		while(j < 5) { //���ǽ� (j++ <5�� ���ǽİ� �������� ���ٷ� ���� �� ����)
			System.out.println(j + ". hello");
			j++; //������ : �̺κ��� ������ ���ѷ����� ��(���� ��� Ȱ��)
		}
		System.out.println("-----------------------------");
		//do~while
		int k = 10; //�ʱⰪ
		do { //������ �ȸ¾Ƶ� �ϴ� �ѹ� �����ϱ�
			System.out.println(k + ". hello");
			k++; //������
		}while(k < 5); //���ǽ�
	}

}