package com.object;

public class MovieTest {

	public static void main(String[] args) {
		//��ȭ ��ü�� �����Ѵ�.
		Movie m = new Movie();

		//��ȭ ��ü�� �˸��� ���� �����Ѵ�.
		m.title = "Batman";
		m.director = "Nolan";
		m.grade = 10;
		m.genre = "Action";
		m.summary = "�����ΰ�";
		
		//��ȭ ��ü�� ������ ����Ѵ�. 
		m.movieInfo();
		
	}

}
