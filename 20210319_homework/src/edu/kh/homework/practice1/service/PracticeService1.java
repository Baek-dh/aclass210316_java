package edu.kh.homework.practice1.service;

import java.util.Scanner;

public class PracticeService1 {

	/*
	 * �ǽ�����1 ���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����(+, -, *, /)�� ����ȯ�� �̿��Ͽ� �ּ��� ���� ���� ���� ����
	 * �������� �ڵ带 �ۼ��ϼ���.
	 */
	public void practice1() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println(iNum1 / iNum2); // 2 , iNum1 % iNum2
		System.out.println((int) dNum); // 2
		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double) iNum1); // 10.0
		System.out.println((double) iNum1 / iNum2); // 2.5
		System.out.println(dNum); // 2.5
		System.out.println((int) fNum); // 3

		System.out.println((int) (iNum1 / fNum)); // 3, iNum1 / (int)fNum
		System.out.println(iNum1 / fNum);// 3.3333333
		System.out.println(iNum1 / (double) fNum); // 3.3333333333333335
		// float, double�� ��Ȯ�� �Ǽ��� ��Ÿ���°� �ƴ϶� �ٻ簪�� ǥ����
		// float�� �Ҽ��� �Ʒ� 8�ڸ� ���� ǥ��
		// double�� �Ҽ��� �Ʒ� 16�ڸ� ���� ǥ��
		// double�� float���� 2�� �� ���� �Ҽ����� ǥ����(��Ȯ���� 2�� ����)

		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println(ch + iNum1); // 75
		System.out.println((char)(ch + iNum1)); // 'K'
	}
	
	
	/* �ǽ����� 2
	��� ����� ������ ���� ������������ �Ѵ�. 
	�ο� ���� ���� ������ Ű����� �Է� �ް�
	1�δ� �����ϰ� �������� ���� ������ �����ְ� 
	���� ������ ������ ����ϼ���.
	
	[����ȭ��]
	�ο� �� : 29
	���� ���� : 100
	1�δ� ���� ���� : 3
	���� ���� ���� : 13
	*/
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		// sc.next() : ���� �ԷµǴ� �ܾ �о��.
		// sc.nextInt() : ���� �ԷµǴ� ������ �о��.
		// sc.nextDouble() : ���� �ԷµǴ� �Ǽ��� �о��.
		
		System.out.print("�ο� �� : ");
		int input1 = sc.nextInt(); // ���� ����� ���ÿ� �ʱ�ȭ
		
		System.out.print("���� ���� : ");
		int input2 = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + (input2 / input1));
		System.out.println("���� ���� ���� : " + (input2 % input1));
	}
	
	/* �ǽ����� 3
	Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
	ex.
	�̸� : ȫ�浿
	�г�(������) : 3
	��(������) : 4
	��ȣ(������) : 15
	����(���л�/���л�) : ���л�
	����(�Ҽ��� �Ʒ� ��° �ڸ�����) : 85.75
	3�г� 4�� 15�� ȫ�浿 ���л��� ������ 85.75�̴�
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�г�(������) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(������) : ");
		int classRoom = sc.nextInt();
		
		System.out.print("��ȣ(������) : ");
		int number = sc.nextInt();
		
		System.out.print("����(���л�/���л�) : ");
		String gender = sc.next();
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		double record = sc.nextDouble();
		
		//3�г� 4�� 15�� ȫ�浿 ���л��� ������ 85.75�̴�
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.\n"
							, grade, classRoom, number, name, gender, record);
		// \n : ���๮��(�ٹٲ�)
	}
	

	/* �ǽ����� 4
	����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
	�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
	
	[����ȭ��]
	���� : 60
	���� : 80
	���� : 40
	�հ� : 180
	��� : 60.0
	*/
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat; // �հ�
		double avg = sum / 3.0; // ���
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
	}
	
	
	
	
	
	
	
	

}
