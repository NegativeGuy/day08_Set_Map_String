package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		/*
		 	bof -> [일 -> 이 -> 삼] -> eof
		   (시작)					 (끝)
		*/
		
		Iterator it = arr.iterator(); // 반복자
//		System.out.println(it.hasNext()); 	// true 출력
//		// hasNext : 다음 값이 있는지 물음
//		
//		System.out.println(it.next()); 	// "일" 출력
//		// next : 다음 값을 가지고 옴
//
//		System.out.println(it.hasNext()); 	// true 출력
//		System.out.println(it.next()); 	// "이" 출력
//
//		System.out.println(it.hasNext()); 	// true 출력
//		System.out.println(it.next()); 	// "삼" 출력
//
//		System.out.println(it.hasNext()); 	// false 출력
//		System.out.println(it.next()); 	// 에러 뜸
		
//		반복문으로 출력하기 - for
//		for(int i=0; i<arr.size(); i++) {
//			it.hasNext();
//			if(it.hasNext()==true) {
//				System.out.println(it.next());
//			
//			}
//		}
		
//		반복문으로 출력하기 - while
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
