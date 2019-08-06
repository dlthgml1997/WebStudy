package com.ssafy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class QuantityException extends Exception {
	@Override
	public String toString() { 
		return "QuantityException �߻�";
	} //��ü�� �����Ѵ� == ���ܰ� �߻��Ѵ�!!
	
}

class ISBNNotFoundException extends Exception {
	@Override
	public String toString() { 
		return "ISBNNotFoundException �߻�";
	} //��ü�� �����Ѵ� == ���ܰ� �߻��Ѵ�!!
	
}

public class BookMgrImpl implements IBookMgr {
	private static BookMgrImpl instance; //"��ü�����޼����"
	
	private ArrayList<Book> books;// = new ArrayList<>(); //�迭 ��� ArrayList ���
	
	//"private������"
	private BookMgrImpl() { //!!!!
		
		if(books == null) { //books �ȸ�������� ����
			books = new ArrayList<>(); //
		}
		
		open(); //���Ͽ� ����Ǿ� �ִ� ArrayList ��������
	}
	
	//"��ü �����ؼ� ������ �ִ� �޼���"
	public static BookMgrImpl getInstance() {
		if(instance == null) {
			instance = new BookMgrImpl();
		}
		return instance;
	}
	
	////
	@Override
	public void add(Book b) {
		boolean flag = false;
		//�ߺ������� ó��
		for(Book b2 : books) {
			if(b2.getIsbn() == b.getIsbn()) {
				//�ߺ��Ǵ� ��� ���� �߻����Ѿߵ�.
				flag = true; //�ߺ� ǥ��
				break;
				//return; �׳� �̷��� �صε� �÷��� �ʿ� X
			}
		}
/*		if(books.contains(b)) {
			return;
		}
		books.add(b);*/ //�̰� �ȵ�.. b2.equals(b)�� �ȵ�
		books.add(b);
	}
	public void sort() {
		Collections.sort(books);
	}
	
	@Override
	public ArrayList<Book> search() {
		return books;
	}
	@Override
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException { //�߿�!
		boolean find = false; 
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				find =true; 
				if(b.getQuantity()>=quantity) {
					b.setQuantity(b.getQuantity()-quantity);
				}else {
					throw new QuantityException();
				}
				return;
			}
		}
		if(!find) {
			throw new ISBNNotFoundException();
		}
		
	}
	
	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException {
		boolean find = false; 
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				find =true; 
				b.setQuantity(b.getQuantity()+quantity);
				return;
			}
		}
		
		if(!find) {
			throw new ISBNNotFoundException();
		}
	}
	
	@Override
	public int getTotalAmount() {
		int sum=0;
		for(Book b : books) {
			sum += b.getPrice() * b.getQuantity();
 		}
		return sum;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void open() {
		try {
			FileInputStream fis = new FileInputStream("book.dat");
			ObjectInputStream ois  = new ObjectInputStream(fis);
			
			Object oldbook =  ois.readObject(); //"��ü ������ �ϳ���" �о�� -> "����ȯ"�� �� ���־�� �Ѵ�!!
			
			if(oldbook != null) { //�õ������ ��� ����ȯ���Ѽ� books�� �ֱ�
				books = (ArrayList<Book>)oldbook;
				System.out.println("�ε�����");
			}
			
			ois.close();
			fis.close();
			System.out.println("���³�");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("open()���� �ȉ��.");
		}
	}
	@Override
	public void close() {
		try {
		FileOutputStream fos = new FileOutputStream("book.dat"); //node stream
		ObjectOutputStream oos = new ObjectOutputStream(fos); //filter stream
		oos.writeObject(books); //����ȭ�� ��ü�� byte��Ʈ������ "��ü ������ �ϳ���" ������
		
		oos.close();
		fos.close();
		System.out.println("Ŭ���");
		}catch(Exception e) {
			//System.out.println(e);
			System.out.println("close()���� �ȉ��.");
		}
	}

	@Override
	public void delete(String isbn) {
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				books.remove(b); 
				break;
			}
		}
	}
	
	@Override
	public Book findbyisbn(String isbn) {
		Book a = null;
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				a = b; 
				break;
			}
		}
		//null�� ��� isbnnotfoundexc
		//��̸���Ʈ �� ��� isEmpty �Ǵ� size�� 0���� Ȯ�� -> ���ο���!!
		return a; //������ null�� ������ �ȴ�.
	}

	@Override
	public ArrayList<Book> novelbygenre(String genre) {
		ArrayList<Book> find = new ArrayList<>();
		for(Book b : books) {
			if(b instanceof Novel) {
				Novel n = (Novel)b; 
				if(n.getGenre().equals(genre)) {
					find.add(n);
				}
			}
		}
		return find; //isempty ������ �׽�Ʈ���� üũ�ؼ� ���� ��� ó�����־����!!!!
	}
	
	
	
}
