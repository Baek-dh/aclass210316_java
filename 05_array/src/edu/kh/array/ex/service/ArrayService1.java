package edu.kh.array.ex.service;

import java.util.Scanner;

public class ArrayService1 {

	// 배열
	// - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	// - 묶어둔 변수를 index를 통해 구분함. (index 시작은 0)
	
	public void example1() {
		
		// 1. 배열 선언
		int[] arr; 
		// Stack 영역에 int[] 자료형을 참조할 수 있는 변수 arr을 선언.
		// -> int[] 참조 변수 arr 선언
		
		double arr2[];
		// Stack 영역에 double[] 자료형을 참조할 수 있는 변수 arr2을 선언.
		// -> double[] 참조 변수 arr2 선언
		
		
		// 2. 배열 할당 (할당 : 메모리상에 데이터 저장 공간을 확보하는 것)
		arr = new int[4];
		// 1) Heap 영역에 새로운 int 자료형 공간 4칸을 할당.
		// -> 각 칸은 int 자료형, 4칸을 묶으면 int[] 자료형
		
		// 2) 새로 생성된 int[]의 시작 주소를 arr 참조 변수에 대입
		// -> arr변수의 자료형은 int[]로  
		//    새로 생성된 int[]과 자료형이 일치함 --> 대입 연산 가능.
		
		
		// 3. 배열 초기화 & 사용 방법
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 5;
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		// arr[3]은 별도의 값으로 초기화 하지 않았으므로
		// int 기본값 0이 출력됨.
		
		// System.out.println("arr[4] : " + arr[4]);
		// ArrayIndexOutOfBoundsException : 배열 index 범위 초과
		
		System.out.println(arr);
		
		
		for(int i=0 ; i<=3 ; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	
	public void example2() {
		
		// for문을 이용한 배열 초기화
		// -> 초기화할 값이 규칙적이라면 for문을 이용하여 초기화 할 수 있다.
		
		// int형 배열 arr을 선언 후 5칸을 할당하여 각 인덱스에 0,1,2,3,4를 초기화
		
		int[] arr = new int[5];
		
		// arr.length == arr 변수가 참조하고 있는 배열의 길이 == 5
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i; // 각 인덱스에 0,1,2,3,4를 초기화
		}
		
		for(int i=0 ; i<arr.length ; i++ ) {
			System.out.printf("arr[%d] : %d\n",i , arr[i]);
		}
		
		
		// int형 배열 arr2를 선언 후 7칸을 할당하여 
		// 각 인덱스에 0,2,4,6,8,10,12 를 초기화 후 역순으로 출력
		int[] arr2 = new int[7];
		
		
		// 배열 정방향 반복
		for(int i=0 ; i<arr2.length ; i++) {
			//   i = 0 1 2 3 4 5 6
			arr2[i] = i * 2;
		}

		
		// 배열 역방향 반복
		for(int i=arr2.length - 1 ; i>=0 ; i--) {
			System.out.printf("arr2[%d] : %d\n", i ,arr2[i]);
		}
		
	}
	
	
	public void example3() {
		
		// double[] arr 을 선언한 후 3칸 할당
		// 실수 3개를 입력받아 arr 각 인덱스에 저장 후
		// 저장된 값을 순서대로 출력, + 합계도 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];
		/*
		System.out.print("입력 : ");
		arr[0] = sc.nextDouble();
		
		System.out.print("입력 : ");
		arr[1] = sc.nextDouble();
		
		System.out.print("입력 : ");
		arr[2] = sc.nextDouble();
		*/
		
		for(int i=0 ; i<arr.length ; i++) {
			// int i 역할 : 배열의 각 인덱스 요소에 순서대로 접근할 수 있는 숫자를 제공
		
			System.out.print("입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		double sum = 0.0; // 각 인덱스에 저장된 모든 값의 합을 저장할 변수
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
			
			sum += arr[i];
		}
		
		System.out.println("합계 :  " + sum  );
		
		
	}
	
	
	
	
	
	
	
	
	
}
