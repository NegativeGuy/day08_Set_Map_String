package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		// ����ڷκ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		// HashMap<K, V> map = new HashMap<K, V>();
		// <>(�߰�ȣ) �ȿ��� Ÿ��(int, String ��)�� �־���
		// <>(�߰�ȣ) �� �Ⱦ��� ��� Ÿ�� ��� ����
		HashMap map = new HashMap();
		String key = null, value = null;
		System.out.println("������ Ű �Է�");
		key = sc.next();
		System.out.println("������ �� �Է�");
		value = sc.next();
		map.put(key, value);
		System.out.println(map);
		
	}
}
