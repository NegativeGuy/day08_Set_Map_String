package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		/*
		 	bof -> [�� -> �� -> ��] -> eof
		   (����)					 (��)
		*/
		
		Iterator it = arr.iterator(); // �ݺ���
//		System.out.println(it.hasNext()); 	// true ���
//		// hasNext : ���� ���� �ִ��� ����
//		
//		System.out.println(it.next()); 	// "��" ���
//		// next : ���� ���� ������ ��
//
//		System.out.println(it.hasNext()); 	// true ���
//		System.out.println(it.next()); 	// "��" ���
//
//		System.out.println(it.hasNext()); 	// true ���
//		System.out.println(it.next()); 	// "��" ���
//
//		System.out.println(it.hasNext()); 	// false ���
//		System.out.println(it.next()); 	// ���� ��
		
//		�ݺ������� ����ϱ� - for
//		for(int i=0; i<arr.size(); i++) {
//			it.hasNext();
//			if(it.hasNext()==true) {
//				System.out.println(it.next());
//			
//			}
//		}
		
//		�ݺ������� ����ϱ� - while
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
