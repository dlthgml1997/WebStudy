package com.basic;

import java.util.Scanner; //Scanner�޼��带 ����ϱ� ���� import

public class Test {

	public static void main(String[] args) {
		//System.in : ǥ���Է�(Ű�����Է�) -- ���ڰ� �ƴ� "�ڵ�"�� �ν�
		//Scanner : ǥ���Է°��� �޾ƿͼ� ó�����ִ� ��ƿ��Ƽ Ŭ���� -- �ڵ尡 � ������ �Է��̾�����
		Scanner s = new Scanner(System.in);
		System.out.println("�Է��ϼ���:");
		int a = s.nextInt(); //scanner�� �νĵ� ���ڸ� int������ �޾ƿ� ex)nextLine�� �ٴ����� ��Ʈ���� �޾ƿ�
		
		System.out.println("�Է��ϼ���:");
		int b = s.nextInt();
		
		System.out.println(a);
		System.out.println(b);
	}

}