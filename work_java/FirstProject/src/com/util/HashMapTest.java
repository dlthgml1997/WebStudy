package com.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//Map : key-value ��(=entry!!)�� �̷���� �ڷᱸ��. �ߺ�X, ����X
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "123");
		map.put("name", "tommy");
		map.put("address", "seoul");
		map.put("address", "london"); //put
		
		System.out.println(map);//{��Ʈ����}
		
		String num = map.get("num"); //get (key) 
		String address = map.get("address");
		System.out.println(num + ":"+ address);
		
		Set<String> keys = map.keySet(); //keySet�� map�ȿ� ��� �ִ� Ű�� �����ؼ� Set�� ����ش�!! �� ������ for��
		for(String key: keys) {
			String val = map.get(key);
			System.out.println(key + ":" + val);
		}
		System.out.println("---------");
		
		//TreeMap
		TreeMap<String, String> tmap = new TreeMap<>();
		tmap.put("111", "tommy");
		tmap.put("abc", "billy");
		tmap.put("ABC", "julie");
		tmap.put("������", "kim");
		
		System.out.println(tmap);
		System.out.println(tmap.firstKey());
		
		Set<Map.Entry<String, String>> entries = tmap.entrySet(); //Set�� <�ʿ��� ����ϴ� ��Ʈ�� Ÿ���� ������(Ű�����)>���� ����ִ�.
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		System.out.println("������ �ȳ�");
	}

}
