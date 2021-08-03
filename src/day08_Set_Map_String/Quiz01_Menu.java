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
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴별 가격보기");
			System.out.println("3. 종료");
			System.out.print(">>> : ");
			select = sc.nextInt();
			System.out.println("===================");
			
			switch(select) {
			case 1:
				System.out.print("등록할 메뉴 입력 : ");
				key = sc.next();
				if(map.containsKey(key)==false) {
					
					System.out.print("등록할 가격 입력 : ");
					value = sc.nextInt();
					
					map.put(key, value);
					break;
				}
				else {
					System.out.println("이미 등록된 메뉴 입니다.");
					break;
				}
				
			case 2:
				System.out.println("========메뉴========");
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					key = (String)it.next();
					System.out.println(key+" : "+map.get(key)+"원");					
				}				
				System.out.println("===================");
				System.out.print("1. 수정/");
				System.out.print("2. 삭제/");
				System.out.println("3. 나가기/");
				System.out.println("===================");
				select = sc.nextInt();
				switch(select) {
				case 1:
					System.out.print("수정할 메뉴 입력 : ");
					key = sc.next();
					if(map.containsKey(key)) {
						System.out.print("수정할 가격 입력 : ");
						int newPrice = sc.nextInt();
						System.out.println(map.get(key)+"->"+newPrice);
						System.out.println("변경 완료");
						map.replace(key, newPrice);
						break;
					}
					else {
						System.out.println("존재하지 않는 메뉴 입니다.");
						break;
					}
				case 2:
					System.out.print("삭제할 메뉴 입력 : ");
					key = sc.next();
					if(map.containsKey(key)==true) {
						map.remove(key);
						System.out.println(key+" 메뉴가 삭제 되었습니다.");
						break;
					}
					else {
						System.out.println("존재하지 않는 메뉴 입니다.");
						break;
					}

				case 3:
					break;
				}
				break;
			
			case 3:
				System.out.println("프로그램이 종료 되었습니다");
				System.exit(1);
			}
				
		}
	}
}
