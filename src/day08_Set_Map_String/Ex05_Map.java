package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		// 사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);
		// HashMap<K, V> map = new HashMap<K, V>();
		// <>(중괄호) 안에는 타입(int, String 등)을 넣어줌
		// <>(중괄호) 를 안쓰면 모든 타입 사용 가능
		HashMap map = new HashMap();
		String key = null, value = null;
		System.out.println("저장할 키 입력");
		key = sc.next();
		System.out.println("저장할 값 입력");
		value = sc.next();
		map.put(key, value);
		System.out.println(map);
		
	}
}
