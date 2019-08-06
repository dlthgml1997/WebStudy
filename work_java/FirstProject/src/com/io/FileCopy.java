package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
/*		System.out.println(s); //systemŬ������ ����ƽ data
		System.err.println("hello..."); //������ ���ڷ� ��µ�
		try{
			int i = System.in.read(); //������ ���ڷ� ��µ�
			System.out.println(i);
		}catch(IOExcepion i) {
		}*/
		
		////////
		
		String origin = "src\\com\\io\\FileCopy.java"; //��������
		String copy = "src\\com\\abst\\FileCopy.java"; //���纻
		
		FileInputStream fis; //���Ͽ��� ������ �о�� ��Ʈ��
		FileOutputStream fos; //���Ͽ� ������ ���� ��Ʈ��(������ ����� ������ �����)
		
		fis = new FileInputStream(origin);
		fos = new FileOutputStream(copy);
		
		for(int i=0; (i=fis.read()) != -1; ) { //fis.read() �ѱ��ڸ� �о��. file�� ���� ������ -1�̵ȴ�. ���������� ��� for���� ����.
			System.out.println(i); //�ڵ尪(int ����)�� ���´�.
			fos.write(i); // ���� �ڵ忡 �ش��ϴ� ���ڸ� ���ִ� ����.
		}
		//�������� �� ���� close���־�� �Ѵ�. Ư�� ��¿� �������� ���������� ���Ͽ� �ƹ����뵵 ������ �ȵǾ� ���� ���� �ִ�.
		fis.close();
		fos.close();
		//fis, fos�� node��Ʈ��
		System.out.println();
	}
}
