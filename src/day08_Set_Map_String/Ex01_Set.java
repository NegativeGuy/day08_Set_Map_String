package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01_Set {
	public static void main(String[] args) {
		/*
			[Set]
			- HashSet
			- TreeSet
			.
			.
			.
				HashSet
				- 순서유지가 안됨
					(특정 번지가 없으므로 인덱스로 가지고 올 수 없음)
				- 데이터의 중복을 허용하지 않음
		*/
		HashSet hs = new HashSet();
		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥");	
		System.out.println("hs : "+hs);
		// 중복 허용 안되기 때문에 김밥 하나만 출력
		// 순서도 무작위로 출력
		hs.remove("김밥");	// 삭제 가능
		System.out.println("hs : "+hs);
		
		ArrayList arr = new ArrayList();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("김밥");
		System.out.println("arr : "+arr);
		// 중복 허용 되기 때문에 김밥 두개 출력
		// 순서도 입력한 순으로 출력
		
	}
}
