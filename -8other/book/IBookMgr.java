package com.book;

import java.util.List;

public interface IBookMgr {

	public boolean addBook(Book book);

	public List<Book> getBookAll();
	// ������ ISBN�� å�� ��ϵ� �� ����.
	public Book getBookByIsbn(String isbn);

	public List<Book> getBookByTitle(String title);

	public List<Book> getNovelOnly();

	public List<Book> getMagazine();

	public List<Book> getMagazinePublishedThisYear();

	public List<Book> getBookByPublisher(String publisher);

	public List<Book> getBookLowerPrice(int price);

	public int getSumPrice();

	public double getAvgPrice();

	//���� �߰��� �޼ҵ�
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;

	public void buy(String isbn, int quantity) throws ISBNNotFoundException;

	public int getTotalAmount();

	public void open();

	public void close();
}
