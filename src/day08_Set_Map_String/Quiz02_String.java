package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz02_String {
	public static void main(String[] args) {
		// Quiz01
		// "Have a nice day Have a nice day Have a nice day"
		// ���ڿ����� a�� ��ġ�� �����Ͽ� ��� �Ͻÿ�.
		// ��� : [1,5,13,17,21,29,33,37,45]
		System.out.println("====Quiz01=====");
		String str = new String("Have a nice day Have a nice day Have a nice day");
		int i = 0;
		ArrayList arr = new ArrayList(); //ArrayList�� ����ؼ� arr�� ����(���� ����) 
		while(i<str.length()) {	//str�� ���̸�ŭ �ݺ�
			if(str.charAt(i)=='a') {	//�ݺ��ϸ鼭 str�� 'a'�� �ִ��� ��
				arr.add(i);	//������ i('a'�� �ִ� Ƚ��)�� arr����Ʈ�� ���ʴ�� �߰�
			}
			i++;
		}
		System.out.println(arr);
		
		// Quiz02
		// It is a java programming ���ڿ����� 
		// 'a'�� ������ 'g'�� ����, �׸��� �� ������ ��� �Ͻÿ�.
		// ��� : 
		/*	
		  	�� ����	: 28
			a ����	: 4
			g ����	: 2
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
		System.out.println("�� ����"+str1.length());
		System.out.println("a ����"+arrA.size());
		System.out.println("g ����"+arrG.size());
		
		
		// Quiz03
		// String str = new String("tESt sTring   change     first");
		// String changeStr = new String();
		// ������ ������ �� ���� �ִ��� �� �� ���� ��Ȳ
		// ù��° ���ĺ��� �빮�ڷ� ���� �Ͻÿ�.
		// ��� : Test String Change First
		System.out.println("====Quiz03=====");
		String str2 = new String("tESt sTring   change     first");
		String changeStr = new String();
		changeStr = str2.toLowerCase(); 
		// ��� ���� �ҹ��ڷ� ��ȯ�ؼ� changeStr�� ����
		String[] result = changeStr.split("\\s+");
		// ������ ������ ����� �𸣱� ������ \\s+�� �Ἥ ��� ������ 1�������� �ν�
		
		for(int k=0; k<result.length; k++) {
			String first = result[k].substring(0,1);
			// ù��¥�� ����� first�� ����
			String remain = result[k].substring(1);
			// ������ ���� remain�� ����
			first = first.toUpperCase();
			// ù���� �빮�ڷ� ��ȯ
			System.out.print(first+remain+" ");
			// ù���ڿ� ���������� ��ġ�� " "(����) �־ ���
			}
	}
}
