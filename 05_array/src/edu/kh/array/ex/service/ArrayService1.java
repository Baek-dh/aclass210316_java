package edu.kh.array.ex.service;

import java.util.Scanner;

public class ArrayService1 {

	// �迭
	// - ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��.
	// - ����� ������ index�� ���� ������. (index ������ 0)
	
	public void example1() {
		
		// 1. �迭 ����
		int[] arr; 
		// Stack ������ int[] �ڷ����� ������ �� �ִ� ���� arr�� ����.
		// -> int[] ���� ���� arr ����
		
		double arr2[];
		// Stack ������ double[] �ڷ����� ������ �� �ִ� ���� arr2�� ����.
		// -> double[] ���� ���� arr2 ����
		
		
		// 2. �迭 �Ҵ� (�Ҵ� : �޸𸮻� ������ ���� ������ Ȯ���ϴ� ��)
		arr = new int[4];
		// 1) Heap ������ ���ο� int �ڷ��� ���� 4ĭ�� �Ҵ�.
		// -> �� ĭ�� int �ڷ���, 4ĭ�� ������ int[] �ڷ���
		
		// 2) ���� ������ int[]�� ���� �ּҸ� arr ���� ������ ����
		// -> arr������ �ڷ����� int[]��  
		//    ���� ������ int[]�� �ڷ����� ��ġ�� --> ���� ���� ����.
		
		
		// 3. �迭 �ʱ�ȭ & ��� ���
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 5;
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		// arr[3]�� ������ ������ �ʱ�ȭ ���� �ʾ����Ƿ�
		// int �⺻�� 0�� ��µ�.
		
		// System.out.println("arr[4] : " + arr[4]);
		// ArrayIndexOutOfBoundsException : �迭 index ���� �ʰ�
		
		System.out.println(arr);
		
		
		for(int i=0 ; i<=3 ; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	
	public void example2() {
		
		// for���� �̿��� �迭 �ʱ�ȭ
		// -> �ʱ�ȭ�� ���� ��Ģ���̶�� for���� �̿��Ͽ� �ʱ�ȭ �� �� �ִ�.
		
		// int�� �迭 arr�� ���� �� 5ĭ�� �Ҵ��Ͽ� �� �ε����� 0,1,2,3,4�� �ʱ�ȭ
		
		int[] arr = new int[5];
		
		// arr.length == arr ������ �����ϰ� �ִ� �迭�� ���� == 5
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i; // �� �ε����� 0,1,2,3,4�� �ʱ�ȭ
		}
		
		for(int i=0 ; i<arr.length ; i++ ) {
			System.out.printf("arr[%d] : %d\n",i , arr[i]);
		}
		
		
		// int�� �迭 arr2�� ���� �� 7ĭ�� �Ҵ��Ͽ� 
		// �� �ε����� 0,2,4,6,8,10,12 �� �ʱ�ȭ �� �������� ���
		int[] arr2 = new int[7];
		
		
		// �迭 ������ �ݺ�
		for(int i=0 ; i<arr2.length ; i++) {
			//   i = 0 1 2 3 4 5 6
			arr2[i] = i * 2;
		}

		
		// �迭 ������ �ݺ�
		for(int i=arr2.length - 1 ; i>=0 ; i--) {
			System.out.printf("arr2[%d] : %d\n", i ,arr2[i]);
		}
		
	}
	
	
	public void example3() {
		
		// double[] arr �� ������ �� 3ĭ �Ҵ�
		// �Ǽ� 3���� �Է¹޾� arr �� �ε����� ���� ��
		// ����� ���� ������� ���, + �հ赵 ���
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];
		/*
		System.out.print("�Է� : ");
		arr[0] = sc.nextDouble();
		
		System.out.print("�Է� : ");
		arr[1] = sc.nextDouble();
		
		System.out.print("�Է� : ");
		arr[2] = sc.nextDouble();
		*/
		
		for(int i=0 ; i<arr.length ; i++) {
			// int i ���� : �迭�� �� �ε��� ��ҿ� ������� ������ �� �ִ� ���ڸ� ����
		
			System.out.print("�Է� : ");
			arr[i] = sc.nextDouble();
		}
		
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		double sum = 0.0; // �� �ε����� ����� ��� ���� ���� ������ ����
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
			
			sum += arr[i];
		}
		
		System.out.println("�հ� :  " + sum  );
		
		
	}
	
	
	
	
	
	
	
	
	
}
