package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04_Map {
	public static void main(String[] args) {
		/*
		 Map
		 - HashMap
		 - TreeMap
		 - HashTable
		 .
		 .
		 .
		 	HashMap
		 	- Ű�� ���� �� ������ �̷���
		 	- ������ �������� ����
		 	- Ű�� ���� �ߺ� ������� ����
		 */
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();	
		// ���������ҷ��� LinkedHashMap ���
		// HashMap map�� �������� �ȵ�
		
		map.put("��ǳ��", "1000����");
		map.put("�ڵ���", "10����");
		map.put("������", "30����");
		//  ������ key ������ value
		
		System.out.println(map);
		// ��� -> {������=30����, ��ǳ��=1000����, �ڵ���=10����}

												// ��� ��
		System.out.println(map.get("��ǳ��"));	// 1000����
		System.out.println(map.get("�ڵ���"));	// 10����
		System.out.println(map.get("������"));	// 30����
		System.out.println(map.get("���°�"));	// null

		System.out.println(map.containsKey("������"));	// true
		System.out.println(map.containsKey("������1"));	// false
		
		System.out.println(map.containsValue("30����"));	// true
		System.out.println(map.containsValue("3���"));	// false
		
		System.out.println(map.remove("������"));		// "������" ������
		System.out.println(map.containsKey("������"));	// false
		System.out.println(map);	
		// ��� -> {��ǳ��=1000����, �ڵ���=10����}
		
		
		
		System.out.println(map.keySet()); 
		// ��� -> [��ǳ��, �ڵ���]
		
//		Set s = map.keySet();
//		Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();	// ���� ���� �ѹ���
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
			// ��� -> ��ǳ�� : 1000����
			//		  �ڵ��� : 10����
		}
	}
}
