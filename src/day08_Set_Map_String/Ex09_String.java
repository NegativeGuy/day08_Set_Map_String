package day08_Set_Map_String;

public class Ex09_String {
	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		
		str += "�ȳ��ϼ���";
		System.out.println(str);
		
		System.out.println(str.equals("abcdefg�ȳ��ϼ���"));
		// ���� ��ü�� ���� ���� ""(ū����ǥ)�� ���
		// �׸��� ==(�ε�ȣ)�� �ƴ� .equals�� ���ؾ���
		
		System.out.println(str.charAt(0) == 'a'); // true
		// ���� �ϳ� ���Ҷ��� ''(���� ����ǥ)�� �����
		System.out.println(str.charAt(0) == 'b'); // false

		// �ƽ�Ű�ڵ� Ȱ��
		System.out.println(str.charAt(0)-32);	// 65
		// 97(a) - 32 = 65(A)
		System.out.println((char)(str.charAt(0)-32));	// A
		// ���� �����ϰ� �� ����� ����ȯ

	}
}
