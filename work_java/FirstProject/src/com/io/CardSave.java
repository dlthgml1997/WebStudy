package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CardSave {

	public static void main(String[] args) throws Exception {
		Card mycard = new Card(12345, "harry potter", "master");
		
		//��Ʈ���� �̿��ؼ� ���Ͽ� ��ü ����
		FileOutputStream fos = new FileOutputStream("save.ser"); //node stream
		ObjectOutputStream oos = new ObjectOutputStream(fos); //filter stream
		oos.writeObject(mycard); //����ȭ�� ��ü�� byte��Ʈ������ ��ü ������ �ϳ��� ������
		
		oos.close();
		fos.close();
		
		//��Ʈ���� �̿��ؼ� ��ü �о����
		FileInputStream fis = new FileInputStream("save.ser");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		Card cc = (Card) ois.readObject(); //"��ü ������ �ϳ���" �о�� -> "����ȯ"�� �� ���־�� �Ѵ�!!
		
		System.out.println(cc.getNum());
		System.out.println(cc.getName());
		System.out.println(cc.getCompany());
		
		ois.close();
		fis.close();
	} //  ois<--fis<-- file <--oos<--fos
}
