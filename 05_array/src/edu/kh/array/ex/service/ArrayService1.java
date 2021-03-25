package edu.kh.array.ex.service;

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
	
	
	
	
	
	
}
