package com.exception;
//ArrayIndexOutOfBoundsException : Runtime Exception�� �ϳ�
public class ArrayTest {

	public static void main(String[] args) {
		String[] color = {"yellow", "red", "blue", "white", "pink"};
		
		for(int i=0; i<= color.length; i++) { 	//java.lang.ArrayIndexOutOfBoundsException : 5 
												//�ε���5�� ������ �����! -  Runtime Exception
			//try~catch : ���ܰ� �߻��� ��ġ���� �ٷ� ���μ� ó���ϴ� ���
			try { 
				System.out.println(color[i]); //���ܰ� �߻�(�Ұ��ɼ��� �ִ�)�ϴ� ���� -> try���ο� �ۼ�
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {	//VM�� ���� ���ܸ� ��� catch("�ͼ��ǰ�ü"Ÿ�� ������)
				System.out.println("oops, sorry...");
				System.out.println(e);
				System.out.println(e.getMessage()); //5 : �߻��� ���� ������ ���� �ٸ� �޽����� ����
			}finally { 	//���� �߻� ���ο� ������� �Ź� �����ؾ� �ϴ� ������ �����. ���� ����
						//���� try�� ������� , catch�� ������� �Ź� ����
				System.out.println("finally...");
			}
		}
		
		System.out.println("finished...");

	}

}
