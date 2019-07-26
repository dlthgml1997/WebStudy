package com.ssafy;

import java.util.Scanner;

public class MovieTest {
	//MovieMgr�� �׽�Ʈ �Ѵ�.
	
	///�ʿ信 ���ؼ� �߰��� �޼���
	public static void ToString(Movie c) {
		System.out.println(c.toString());
	}
	public static void ToString(Movie[] c) {
		for(Movie x :c) {
			if(x!=null)
				System.out.println(x.toString());
		}
	}
		
	public static void main(String[] args) {
		MovieMgr c = MovieMgr.getInstance(); //
		
/*		Movie c1 = new Movie("1����","1����",5,"1�帣");
		Movie c2 = new Movie("2����","2����",4,"2�帣");
		Movie c3 = new Movie("3����","3����",3,"3�帣");
		Movie c4 = new Movie("4����","4����",2,"4�帣");
		Movie c5 = new Movie("5����","5����",1,"7�帣");
		Movie c6 = new Movie("6����","4����",2,"6�帣");
		Movie c7 = new Movie("7����","3����",3,"7�帣");
		Movie c8 = new Movie("8����","2����",4,"8�帣");
		Movie c9 = new Movie("9����","1����",5,"9�帣");
		
		c9.toString();
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		System.out.println(c.getSize());
		c.delete("6����");
		ToString(c.search());
		ToString(c.search("4����"));
		ToString(c.searchGenre("7�帣")); //2�� 
		ToString(c.searchDirector("2����")); //2��
		//ToString(c.search("6����"));
		
		System.out.println(c.getSize());*/
		
		//////// Command Line Menu �ۼ�////////
		String title=null;
		String director=null;
		int grade=0;
		String genre=null;
		String summary=null;

		System.out.println("<<< ��ȭ ���� ���α׷� >>>\n1. ��ȭ ���� �Է�\n2. ��ȭ ���� ��ü �˻�  \n3. ��ȭ�� �˻�\n4. ��ȭ �帣�� �˻�\n5. ��ȭ ���� ����\n0. ����\n���ϴ� ��ȣ�� �����ϼ���. ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int Do = sc.nextInt();
		while(Do!=0) {
			switch (Do) {
			case 1:
				sc.nextLine();
//				System.out.println("title:");
				title = sc.nextLine();
//				System.out.println("director:");
				director = sc.nextLine();
//				System.out.println("grade:");
				grade = Integer.parseInt(sc.nextLine());
//				System.out.println("genre:");
				genre = sc.nextLine();
//				System.out.println("summary:");
				summary = sc.nextLine();
				Movie mov = new Movie(title,director,grade,genre,summary);
				c.add(mov);
				ToString(mov);
				System.out.println("�Էµ�");
				break;
			case 2:
				ToString(c.search());
				break;
			case 3:
				sc.nextLine();
				title = sc.nextLine();
				ToString(c.search(title));
				break;
			case 4:
				sc.nextLine();
				genre = sc.nextLine();
				ToString(c.searchGenre(genre));
				break;
			case 5:
				sc.nextLine();
				title = sc.nextLine();
				c.delete(title);
				System.out.println("������");
				break;
			default:
				break;
			}
			System.out.println("<<< ��ȭ ���� ���α׷� >>>\n1. ��ȭ ���� �Է�\n2. ��ȭ ���� ��ü �˻�  \n3. ��ȭ�� �˻�\n4. ��ȭ �帣�� �˻�\n5. ��ȭ ���� ����\n0. ����\n���ϴ� ��ȣ�� �����ϼ���. ");
			System.out.println();
			Do = sc.nextInt();
		}
		System.out.println("�����");
	}

}