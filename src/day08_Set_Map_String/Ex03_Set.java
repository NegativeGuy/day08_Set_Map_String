package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : "+set); 
		//출력 결과 - set : [이, 일, 삼]
		// 입력순서와 관계없이 출력
		
		Iterator it = set.iterator();
		// set이 무작위로 데이터를 저장하기 때문에
		// 반복자인 Iterator를 생성하고 반복문으로 출력
		
		while(it.hasNext()) {
			//Object obj = it.next();	// Object 형으로 변수 생성
			//String s = (String)obj;	// String으로 형변환
			String s =(String)it.next(); // 위의 두줄을 하나로 만든 코드
			System.out.println(s);
		}
	}
}
