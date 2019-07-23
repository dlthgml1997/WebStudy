package com.ssafy;
//BookManager Ŭ������ �ϼ��ؾ� �Ǵ� �޼ҵ� ����� ������ �ִ� �������̽�
public interface IBookManager {
	//������ �߰�
	void add(Book book);
	Book[] total(); //��ü ������ �˻�
	Book findByIsbn(String isbn);
	Book[] findByTitle(String title);
	Book[] findByPrice(int price);
	Book[] findMagazine();
	Book[] findNovel();
	int sum();
	double average();
}
