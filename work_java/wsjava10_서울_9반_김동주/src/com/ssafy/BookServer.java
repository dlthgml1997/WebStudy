package com.ssafy;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class BookServer {
	static ArrayList<Book> books;
	
	public static void main(String[] args) {
		ServerSocket s = null;
		Socket s1;
		
		InputStream s1in;
		ObjectInputStream dis;
		
		try {
			s = new ServerSocket(9898);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) { //��� ���� Ŭ���̾�Ʈ�� ����
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ��� ��...");
			try {
				s1 = s.accept();
			System.out.println("Ŭ���̾�Ʈ ����!");
			
			s1in = s1.getInputStream();
			dis = new ObjectInputStream(s1in);
			
			books = (ArrayList<Book>) dis.readObject();
			for(Book b : books) {
				System.out.println(b);
			}
			
			dis.close();
			s1in.close();
			
			s1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}


}
