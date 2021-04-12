package edu.kh.api.ex.model.service;

import java.util.Scanner;

import edu.kh.api.ex.model.vo.Student;

public class APIService {

	public void example1() {
		
		Student std1 = new Student("ȫ�浿", 3, 5);
		Student std2 = new Student("ȫ�浿", 3, 5);
		
		System.out.println(std1);
		System.out.println( std1.equals(std2)  ); // true

		System.out.println( std1.hashCode() ); 
		System.out.println( std2.hashCode() ); 
		System.out.println( std1.hashCode() == std2.hashCode() ); 
		// equals() �������̵� �� hashCode() �������̵� �ؾߵȴ�
		// -> equals()�� true�� ��� �� ��ü�� hashCode()�� ���ƾ� �Ѵ�.
		
	}
	
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		// String ���ͷ� �ۼ� �� �޸𸮱���
		// - String ���ͷ��� ������ ���ڿ��� String Pool�̶�� Heap���� ������ ������.
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.print("abc �Է� : ");
		String str4 = sc.next(); // abc �Է�
		
		
		
		System.out.println(str1 == str2); // true
		// String ���ͷ��� "abc"�� �ʱ�ȭ�� str1, str2��
		// String Pool�� �ִ� ���� "abc" �ּҸ� �����Ѵ�.
		
		System.out.println(str1 == str3); // false
		System.out.println(str1 == str4); // false
		
		
		// str1�� str2�� �����ϴ� �ּҰ� ������ ������ Ȯ��
		// -> System.identityHashCode()
		//  -> �ڹٴ� ���� �޸� �ּҸ� ������ ������
		//     �޸� �ּҸ� �̿��� ������ ���¿� ���ڸ� ��ȯ�ϴ�
		//     identityHashCode()��� ���� ���� �ִ�. 
		//  == ���� �ּҶ�� �����ص� ������.
		System.out.println("std1 : " + System.identityHashCode(str1));
		System.out.println("std2 : " + System.identityHashCode(str2));
		System.out.println("std3 : " + System.identityHashCode(str3));
		System.out.println("std4 : " + System.identityHashCode(str4));
		
		
		
		
	}
	
	
	
	
	
	
	
}
