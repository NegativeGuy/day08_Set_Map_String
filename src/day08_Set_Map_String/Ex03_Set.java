package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println("set : "+set); 
		//��� ��� - set : [��, ��, ��]
		// �Է¼����� ������� ���
		
		Iterator it = set.iterator();
		// set�� �������� �����͸� �����ϱ� ������
		// �ݺ����� Iterator�� �����ϰ� �ݺ������� ���
		
		while(it.hasNext()) {
			//Object obj = it.next();	// Object ������ ���� ����
			//String s = (String)obj;	// String���� ����ȯ
			String s =(String)it.next(); // ���� ������ �ϳ��� ���� �ڵ�
			System.out.println(s);
		}
	}
}
