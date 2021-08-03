package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01_Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap map = new HashMap();
		String key = null;
		int value = 0;
		int select = 0;
		
		while(true) {
			System.out.println("===================");
			System.out.println("1. �޴����");
			System.out.println("2. �޴��� ���ݺ���");
			System.out.println("3. ����");
			System.out.print(">>> : ");
			select = sc.nextInt();
			System.out.println("===================");
			
			switch(select) {
			case 1:
				System.out.print("����� �޴� �Է� : ");
				key = sc.next();
				if(map.containsKey(key)==false) {
					
					System.out.print("����� ���� �Է� : ");
					value = sc.nextInt();
					
					map.put(key, value);
					break;
				}
				else {
					System.out.println("�̹� ��ϵ� �޴� �Դϴ�.");
					break;
				}
				
			case 2:
				System.out.println("========�޴�========");
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					key = (String)it.next();
					System.out.println(key+" : "+map.get(key)+"��");					
				}				
				System.out.println("===================");
				System.out.print("1. ����/");
				System.out.print("2. ����/");
				System.out.println("3. ������/");
				System.out.println("===================");
				select = sc.nextInt();
				switch(select) {
				case 1:
					System.out.print("������ �޴� �Է� : ");
					key = sc.next();
					if(map.containsKey(key)) {
						System.out.print("������ ���� �Է� : ");
						int newPrice = sc.nextInt();
						System.out.println(map.get(key)+"->"+newPrice);
						System.out.println("���� �Ϸ�");
						map.replace(key, newPrice);
						break;
					}
					else {
						System.out.println("�������� �ʴ� �޴� �Դϴ�.");
						break;
					}
				case 2:
					System.out.print("������ �޴� �Է� : ");
					key = sc.next();
					if(map.containsKey(key)==true) {
						map.remove(key);
						System.out.println(key+" �޴��� ���� �Ǿ����ϴ�.");
						break;
					}
					else {
						System.out.println("�������� �ʴ� �޴� �Դϴ�.");
						break;
					}

				case 3:
					break;
				}
				break;
			
			case 3:
				System.out.println("���α׷��� ���� �Ǿ����ϴ�");
				System.exit(1);
			}
				
		}
	}
}
