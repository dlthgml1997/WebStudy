package com.util;

import java.util.TreeSet;
//�����Ͱ� ������������ ���ĵǾ� �����
//�ߺ�X, �Է¼����ʹ� ��� ����
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(90); 
		set.add(35);
		set.add(75);
		set.add(100);
		set.add(90);
		set.add(88); //���� ��Ȯ�ϰ� �Ϸ��� boxing�ؼ� �־�� ������ �ڵ����� ����
		
		System.out.println(set); //�ߺ��� ����� �������� ����
		System.out.println(set.first()); 
		System.out.println(set.last());
		System.out.println(set.lower(90)); //�ش� ��ü �ٷ� �Ʒ��� �ִ� �� ã�� 
		System.out.println(set.higher(80)); //�ش� ��ü �ٷ� ���� �ִ� �� ã�� 
		
		set.pollFirst(); //ù��° ��ü�� 1.������(�����ϰ�) 2.�÷��ǿ��� ����
		System.out.println(set); 
		
		set.pollLast(); //������ ��ü�� ������ �÷��ǿ��� ����
		System.out.println(set);
		///////
		TreeSet<String> set2 = new TreeSet<>();
		
		set2.add("123");
		set2.add("ȫ�浿");
		set2.add("ABC");
		set2.add("alien");
		set2.add("banana");
		set2.add("airplane");
		set2.add("apple");
		set2.add("camera");
		set2.add("c");
		set2.add("b");
		set2.add("dance");
		set2.add("apple");
		set2.add("disc");
		
		System.out.println(set2); //��Ʈ���� �������� //���� -> ���빮�� -> ���ҹ��� -> �ѱ� ����
		System.out.println(set2.headSet("banana", true)); //��ü ��-�̸�, true���̸� ������ ��Ʈ
		System.out.println(set2.subSet("a", "al")); //a, al�� ���۵Ǵ� �� ������ ��Ʈ
		System.out.println(set2.tailSet("c")); //��ü ��-������ ��Ʈ
	}

}
