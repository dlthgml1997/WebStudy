package com.util;
//Set:�����Ͱ� ����X, �ߺ�X

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("spring");
		set.add("summer");
		set.add("spring");
		set.add("winter");
		set.add("fall");
		set.add("spring");
		
		set.remove("spring"); //������ ���� ������ ����Ʈ�� �ٸ��� �ε����� ����� ���� -> ��ü �����ؼ� ����
		
		for(String season : set) {
			System.out.println(season); //������ �ٲ���ִ°��� Ȯ���� �� �ִ�.
		}
		
		set.clear(); //��� ���빰 ����
		System.out.println(set.size()); //0 ���빰 ����
	}

}
