package com.ssafy;

import java.util.ArrayList;

public class BookTest { //toString, Thows �ۼ� �� trycatch ó��, getInstace, close();  4���� üũ

	public static void ToString(Book c) {
		System.out.println(c.toString());
	}
	public static void ToString(ArrayList<Book> c) {
		for(Book x :c) {
			System.out.println(x.toString());
		}
	}

	public static void main(String[] args) throws Exception { //Ȥ�� Ŀ�ǵ� �������� ��ǲ�� �޴´ٸ� while�� �ȿ� switch�� 
		BookMgrImpl bm = BookMgrImpl.getInstance(); //�ϸŴ��� Ŭ���� ����
		//String isbn9~0, String title, String author, String publisher0~9, int price, String desc
		Book b0 = new Novel("9", "Harry", 000, 43, "��Ÿ��");
		Book b1 = new Magazine("8", "Potter", 100, 1626, 12);
		Book b2 = new Novel("7", "And", 200, 15, "��Ÿ��");
		Book b3 = new Magazine("6", "The",300, 136, 06);
		Book b4 = new Novel("5", "Sorcerer's" ,400, 16, "��Ÿ��");
		Book b5 = new Magazine("4", "Stone",500, 264,  05);
		Book b6 = new Novel("3", "By", 600, 589, "��Ÿ��");
		Book b7 = new Magazine("2", "J", 700, 5,  01);
		Book b8 = new Novel("1", "K", 800, 74, "��Ÿ��");
		Book b9 = new Magazine("0", "Rowling", 900, 966,  03);
		
/*		bm.add(b0);
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		bm.add(b4);
		bm.add(b5);
		bm.add(b6);
		bm.add(b7);
		bm.add(b8); 
		bm.add(b9);  
		*/
		bm.delete("3");
		ToString(bm.search());
		bm.sort();
		System.out.println("------------------");
		ToString(bm.search());
		System.out.println("------------------");
		//bm.sell("8", 50);
		System.out.println("------------------");
		//bm.sell("8", 40);
		System.out.println("------------------");
		//bm.buy("0",34);
		System.out.println("------------------");
		//ToString(bm.search());
		System.out.println("------------------");
		System.out.println(bm.getTotalAmount());
		
		
		ArrayList<Book> find = bm.novelbygenre("��Ÿd");
		if(find.isEmpty()) {
			System.out.println("ã�� �Ҽ��� �����ϴ�.");
		}else {
			for(Book bk : find) {
				System.out.println(bk.toString());
			}
		}
		
		try {
			bm.sell("99", 9999);
		} catch (QuantityException e) {
			System.out.println(e);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}
		System.out.printf("�⺻ ����:  %s\n", bm.findbyisbn("5"));
		try {
			bm.sell("5", 100);
		} catch (QuantityException e) {
			System.out.println(e);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}
		System.out.printf("�Ǹ� �� ����:  %s\n", bm.findbyisbn("5"));
		try {
			bm.sell("5", 3);
		} catch (QuantityException e) {
			System.out.println(e);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}
		System.out.printf("�Ǹ� �� ����:  %s\n", bm.findbyisbn("5"));

		try {
			bm.buy("5", 100);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}
		System.out.printf("���� �� ����:  %s\n", bm.findbyisbn("5")); 

		
		
				
		bm.close(); //���߰�!!!!!
	}

}
