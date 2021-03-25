package edu.kh.array.ex.service;

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
	
	
	
	
	
	
}
