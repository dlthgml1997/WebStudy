package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamTest {
	public static void main(String[] args) throws Exception {
		File f = File.createTempFile("sample", ".tmp"); //Ŭ�����̸�.����ƽ�޼��� - �ӽ� ������ ����
		System.out.println(f); //�������� �ӽ����� �����ΰ� ����, �����̸��ڿ��� ������ ���ڵ��� ����
		
		FileWriter fw = new FileWriter(f); //��¿� node stream(FileOutputStream�� ����) 
		BufferedWriter bw = new BufferedWriter(fw); //filter stream : fw�������� ������ ����. buffer�� �ְ� Ư���� �޼ҵ尡 ����
		
		//�� �Ŀ��� bw���ͷ� �̿�
		bw.write("hello~");
		bw.newLine();
		bw.write("�ֵ��");
		bw.newLine();
		bw.write("������ġ �� �Ծ���?");
		bw.newLine();
		bw.write("���� ���ƶ�");
		bw.newLine();
		
		bw.close();
		fw.close();
		
		//�о��
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		for(String str; (str = br.readLine()) != null; ) { //readLine()���� �����͸� ���پ� �о����
			System.out.println(str);
		}
		//�о��
		
	}// <--br<--fr<-- file <--bw<--fw<-- �ε�?
}
