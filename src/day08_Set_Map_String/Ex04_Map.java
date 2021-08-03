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
		 	- 키와 값이 한 쌍으로 이뤄짐
		 	- 순서는 유지되지 않음
		 	- 키에 대한 중복 허용하지 않음
		 */
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();	
		// 순서유지할려면 LinkedHashMap 사용
		// HashMap map은 순서유지 안됨
		
		map.put("선풍기", "1000만원");
		map.put("자동차", "10만원");
		map.put("에어컨", "30만원");
		//  앞쪽이 key 뒤쪽이 value
		
		System.out.println(map);
		// 출력 -> {에어컨=30만원, 선풍기=1000만원, 자동차=10만원}

												// 출력 ↓
		System.out.println(map.get("선풍기"));	// 1000만원
		System.out.println(map.get("자동차"));	// 10만원
		System.out.println(map.get("에어컨"));	// 30만원
		System.out.println(map.get("없는값"));	// null

		System.out.println(map.containsKey("에어컨"));	// true
		System.out.println(map.containsKey("에어컨1"));	// false
		
		System.out.println(map.containsValue("30만원"));	// true
		System.out.println(map.containsValue("3억원"));	// false
		
		System.out.println(map.remove("에어컨"));		// "에어컨" 삭제됨
		System.out.println(map.containsKey("에어컨"));	// false
		System.out.println(map);	
		// 출력 -> {선풍기=1000만원, 자동차=10만원}
		
		
		
		System.out.println(map.keySet()); 
		// 출력 -> [선풍기, 자동차]
		
//		Set s = map.keySet();
//		Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();	// 위의 두줄 한번에
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
			// 출력 -> 선풍기 : 1000만원
			//		  자동차 : 10만원
		}
	}
}
