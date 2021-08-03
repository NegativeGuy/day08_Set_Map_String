package day08_Set_Map_String;

public class Ex10_String {
	public static void main(String[] args) {
		
		// trim()	: ���� ���� ����
		// split()	: Ư�� ������ �������� �ڸ��� 
		// replace(): ġȯ�ϱ�
		
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
		// ���⸦ �������� "   Have a nice day      "�� �ڸ���
		System.out.println(split[0]);	// Have
		System.out.println(split[1]);	// a
		System.out.println(split[2]);	// nice
		System.out.println(split[3]);	// day
		
		
		String addr = "101/�����/���α�/����3��/100����/4��";
		String[] ad = addr.split("/");	
		// ad�� String���� �迭�� ����
		for(int i=0; i<ad.length; i++) {
			System.out.println(ad[i]);
		}
			/*
				�����
				���α�
				����3��
				100����
				4��
			*/
		
			
			
		// replace()==============================
		String replace = result.replace(" ","+++");
		// " "(����)�� +++�� ġȯ
		System.out.println(replace);
	}
}
