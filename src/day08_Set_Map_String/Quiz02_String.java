package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz02_String {
	public static void main(String[] args) {
		// Quiz01
		// "Have a nice day Have a nice day Have a nice day"
		// 문자열에서 a의 위치를 저장하여 출력 하시오.
		// 결과 : [1,5,13,17,21,29,33,37,45]
		System.out.println("====Quiz01=====");
		String str = new String("Have a nice day Have a nice day Have a nice day");
		int i = 0;
		ArrayList arr = new ArrayList(); //ArrayList를 사용해서 arr을 생성(무한 공간) 
		while(i<str.length()) {	//str의 길이만큼 반복
			if(str.charAt(i)=='a') {	//반복하면서 str에 'a'가 있는지 비교
				arr.add(i);	//있으면 i('a'가 있는 횟수)를 arr리스트에 차례대로 추가
			}
			i++;
		}
		System.out.println(arr);
		
		// Quiz02
		// It is a java programming 문자열에서 
		// 'a'의 갯수와 'g'의 갯수, 그리고 총 갯수를 출력 하시오.
		// 결과 : 
		/*	
		  	총 갯수	: 28
			a 갯수	: 4
			g 갯수	: 2
		 */
		System.out.println("====Quiz02=====");
		String str1 = new String("It is a fun java programming");
		ArrayList arrA = new ArrayList(), arrG = new ArrayList();
		
		int j=0;
		while(j<str1.length()) {
			if(str1.charAt(j)=='a') {
				arrA.add(j);
			}
			else if(str1.charAt(j)=='g') {
				arrG.add(j);
			}
			j++;
		}
		System.out.println("총 갯수"+str1.length());
		System.out.println("a 갯수"+arrA.size());
		System.out.println("g 갯수"+arrG.size());
		
		
		// Quiz03
		// String str = new String("tESt sTring   change     first");
		// String changeStr = new String();
		// 현재의 공백은 몇 개가 있는지 알 수 없는 상황
		// 첫번째 알파벳만 대문자로 변경 하시오.
		// 결과 : Test String Change First
		System.out.println("====Quiz03=====");
		String str2 = new String("tESt sTring   change     first");
		String changeStr = new String();
		changeStr = str2.toLowerCase(); 
		// 모든 글자 소문자로 변환해서 changeStr로 대입
		String[] result = changeStr.split("\\s+");
		// 각각의 공백이 몇개인지 모르기 때문에 \\s+를 써서 모든 공백을 1개씩으로 인식
		
		for(int k=0; k<result.length; k++) {
			String first = result[k].substring(0,1);
			// 첫글짜만 떼어내서 first에 대입
			String remain = result[k].substring(1);
			// 나머지 글자 remain에 대입
			first = first.toUpperCase();
			// 첫글자 대문자로 변환
			System.out.print(first+remain+" ");
			// 첫글자와 나머지글자 합치고 " "(띄어쓰기) 넣어서 출력
			}
	}
}
