package day08_Set_Map_String;

public class Ex10_String {
	public static void main(String[] args) {
		
		// trim()	: 양쪽 공백 제거
		// split()	: 특정 지점을 기준으로 자르기 
		// replace(): 치환하기
		
		// trim()==============================
		String str = "   Have a nice day      ";
		String result = str.trim();
		System.out.println("1."+str);
		System.out.println("2."+result);
		
		String inputId = "abcd    ";
		String saveId = "abcd";
		System.out.println(inputId);
		System.out.println(saveId);
		
		System.out.println(inputId.length());
		System.out.println(saveId.length());
		
		inputId = inputId.trim();
		System.out.println(inputId.equals("saveId"));
		
		// split()==============================
		String[] split = result.split(" ");
		// 띄어쓰기를 기준으로 "   Have a nice day      "를 자르기
		System.out.println(split[0]);	// Have
		System.out.println(split[1]);	// a
		System.out.println(split[2]);	// nice
		System.out.println(split[3]);	// day
		
		
		String addr = "101/서울시/종로구/종로3가/100번지/4층";
		String[] ad = addr.split("/");	
		// ad를 String형의 배열로 생성
		for(int i=0; i<ad.length; i++) {
			System.out.println(ad[i]);
		}
			/*
				서울시
				종로구
				종로3가
				100번지
				4층
			*/
		
			
			
		// replace()==============================
		String replace = result.replace(" ","+++");
		// " "(띄어쓰기)를 +++로 치환
		System.out.println(replace);
	}
}
