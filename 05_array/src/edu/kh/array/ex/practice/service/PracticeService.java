package edu.kh.array.ex.practice.service;

import java.util.Scanner;

public class PracticeService {
	/*
	 * �ǽ����� 4 ���� 5���� �Է� �޾� �迭�� �ʱ�ȭ �ϰ� �˻��� ������ �ϳ� �Է� �޾� �迭���� ���� ���� �ִ� �ε����� ã�� ���. �迭��
	 * ���� ���� ���� ��� ����ġ�ϴ� ���� �������� �ʽ��ϴ١� ���
	 */

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�Է� " + i + " : "); // �Է� 0 : , �Է� 1 :
			arr[i] = sc.nextInt();
		}

		System.out.print("�˻��� �� : ");
		int input = sc.nextInt();

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				System.out.println("�ε��� : " + i);

				flag = false;
			}
		}

		if (flag) {
			System.out.println("��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
		}

	}

	/*
	 * �ǽ����� 7 �ֹε�Ϲ�ȣ�� �Է� �޾� ������ ��Ÿ���� ���� ���ĺ��� *�� ������ ����ϼ���.
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε��ȣ(-����) : ");
		String input = sc.nextLine();

		// 991010-123457
		// 0123456789012
		for (int i = 0; i < input.length(); i++) {
			if (i < 8) {
				System.out.print(input.charAt(i));
			} else {
				System.out.print("*");
			}
		}

	}

	/*�ǽ����� 13 
	 * ���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
	 * ������ ������ �Բ� ����ϼ���. 
	 * ex. 
	 * ���ڿ� : application 
	 * ���ڿ��� �ִ� ���� : a, p, l, i, c, t, o, n 
	 * ���� ���� : 8
	 */
	public void practice13() {
		// 1. ����ڿ��� ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		// 2. �ش� ���ڿ��� ���ڵ��� char[]�� ���
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3. char�迭���� �ߺ��� ������ ��� ���X,

		int count = 0; // ���� ���� ī��Ʈ

		System.out.print("���ڿ��� �ִ� ���� : ");

		for (int i = 0; i < arr.length; i++) {

			boolean flag = true; // �ߺ� üũ�� ����

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) { // �ߺ��̹߻����� ��
					flag = false;
					break;
				}
			}

			if (flag) { // �ߺ��� �߻����� �ʾ��� ���
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		}

		System.out.println();
		System.out.println("���� ���� : " + count);
	}

}
