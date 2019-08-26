package com.book;

public class BookTest {

	public static void main(String[] args) {		
		IBookMgr bm = BookManagerList.getInstance();

		Book book0 = new Book("21424", "Java Basic", "���ϳ�", "Jaen.kr", 15000, "Java �⺻ ����", 10);
		Book book1 = new Book("21424", "JDBC Pro", "��ö��", "Jaen.kr", 23000, 10);
		Book book2 = new Book("55355", "Servlet/JSP", "���ڹ�", "Jaen.kr", 41000, "Model2 ���", 10);
		Book book3 = new Book("35332", "Android App", "ȫ�浿", "Jaen.kr", 25000, "Lightweight Framework", 10);
		Book book4 = new Book("35355", "OOAD �м�, ����", "�ҳ���", "Jaen.kr", 30000, 10);

		Magazine m0 = new Magazine("35535", "Java World", "������", "Java.com", 7000, "", 2013, 2, 10);
		Magazine m1 = new Magazine("33434", "Mobile World", "������", "Java.com", 8000, "", 2013, 8, 10);
		Magazine m2 = new Magazine("75342", "Next Web", "������", "Java.com", 10000, "AJAX �Ұ�", 2012, 10, 10);
		Magazine m3 = new Magazine("76543", "Architecture", "������", "Java.com", 5000, "java �ý���", 2010, 3, 10);
		Magazine m4 = new Magazine("76534", "Data Modeling", "������", "Java.com", 14000, "", 2012, 12, 10);

		Magazine m5 = new Magazine("76544", "������.", "������", "Java.com", 14000, "", 2012, 12, 10);

		Book[] books = { book0, book1, book2, book3, book4, m0, m1, m2, m3, m4, m5 };

		// Book ����
		System.out.println("���� ����");
		for (Book book : books) {
			bm.addBook(book);
			System.out.println(book);
		}

		// �Ǹ� ó��
		try {
			bm.sell("00000", 1);
		} catch (QuantityException e) {
			System.out.println(e);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}
		System.out.printf("�⺻ ����:  %s", bm.getBookByIsbn("55355"));
		try {
			bm.sell("55355", 100);
		} catch (QuantityException e) {
			System.out.println(e);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}

		try {
			bm.sell("55355", 5);
		} catch (QuantityException e) {
			System.out.println(e);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}
		System.out.printf("�Ǹ� �� ����:  %s\n", bm.getBookByIsbn("55355"));

		try {
			bm.buy("55355", 3);
		} catch (ISBNNotFoundException e) {
			System.out.println(e);
		}
		System.out.printf("���� �� ����:  %s\n", bm.getBookByIsbn("55355"));
		bm.close();
	}
}
