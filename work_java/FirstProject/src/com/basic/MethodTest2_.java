package com.basic;

public class MethodTest2_ {
	//
	static double average(int a, int b, int c) {
		double average = (a + b + c) / 3; //3�� �ƴ� 3.0���� ���������!!!!!
		return average;
	}
	static String concat(String a, String b) {
		String concat = a + b;
		return concat;
	}
	//reverse() : boolean�� �Ű����� �� ���� �Է� �޾� �� �ݴ��� ���� ����
	//(true => false, false =>true)
	static boolean reverse(boolean X) {
		boolean X_toggle = !X;
		return X_toggle;
	}
	static String result(boolean a, boolean b) {
		//if�� ����� �� if�� else���ʿ� return�� ���־���Ѵ�!!!!!!!!!!!!!!!!!!!!!!!
		if (a && b) {
			String result = "ok";
			return result;
		}
		else {
			String result = "cancel";
			return result;
		}
		
		//3�׿����� ����ϸ� �� ����
		//String result = (a && b) ? "ok" : "cancel";
		//return result;
	}
	static void loopString(int count, String msg) {
		for(int i=0; i<count; i++) {
			System.out.println(msg);
		}
	}
	static double getArea(int r) {
		return 3.14 * r * r;
	}
	static void printCircum(int r) {
		System.out.println(2*3.14*r);
	}
	static int[] makeArray(int len) {
		int[] array;
		array = new int[len];
		//int[] array = new int[len]; //����ǥ��
		return array;
	}
	static int total(int[] data) {
		int total = 0;
		for(int x: data) {
			total = total + x;
		}
//		for(int i=0; i<a.length ; i++)
//			total = total + a[i];
		return total;
	}

	
	public static void main(String[] args) { //public static�� �޼����� ���ľ�
		// main�޼��� ���ο��� ����� ���� �޼ҵ���� ����ϴ� �κ�
		System.out.println(average(1514,147,8473));
		System.out.println(concat("������","���ķ�"));
		System.out.println(result(true, true));
		System.out.println(reverse(false));
		loopString(4,"message");
		System.out.println(getArea(7));
		printCircum(3);
		System.out.println(makeArray(8));
		int[] data = {10, 28, 30, 50, 90, 123, 450, 66, 67};
		total(data);
	}
	//main�ٱ�
	
}