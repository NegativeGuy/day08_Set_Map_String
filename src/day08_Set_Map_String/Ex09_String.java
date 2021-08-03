package day08_Set_Map_String;

public class Ex09_String {
	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		
		str += "안녕하세요";
		System.out.println(str);
		
		System.out.println(str.equals("abcdefg안녕하세요"));
		// 문장 전체를 비교할 때는 ""(큰따옴표)를 사용
		// 그리고 ==(부등호)가 아닌 .equals로 비교해야함
		
		System.out.println(str.charAt(0) == 'a'); // true
		// 문자 하나 비교할때는 ''(작은 따옴표)로 써야함
		System.out.println(str.charAt(0) == 'b'); // false

		// 아스키코드 활용
		System.out.println(str.charAt(0)-32);	// 65
		// 97(a) - 32 = 65(A)
		System.out.println((char)(str.charAt(0)-32));	// A
		// 연산 먼저하고 그 결과를 형변환

	}
}
