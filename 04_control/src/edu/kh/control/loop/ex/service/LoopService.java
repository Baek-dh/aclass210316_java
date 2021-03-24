package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {

	/* for문
	 * 
	 * for(초기식 ; 조건식 ; 증감식){
	 * 	// 반복 수행할 코드
	 * }
	 * 
	 * 초기식 : for문 내에서 반복을 제어하기 위해 사용하는 변수를 작성하는 부분
	 * 
	 * 조건식 : for문의 반복 여부를 결정하는 부분
	 * 
	 * 증감식 : 초기식에 작성된 변수를 for문이 종료할 때 마다 증가 또는 감소 시키는 부분
	 * */
	
	public void example1() {
		
		for( int i=1 ; i <= 10 ; i++ ) {
			System.out.println(i + " 출력");
		}
		
		/* 1. 초기식에 작성된 변수를 생성 (int i=1)
		 * 
		 * 2. 작성된 변수의 값을 조건식에 대입했을 때 true인지 확인
		 * 
		 * 3. (조건식이 true일 경우) for문 내부 코드를 1회 실행
		 * 
		 * 4. 증감식을 1회 수행 (i++)
		 * 
		 * 5. 증감식으로 변화된 값 i를 조건식에 대입
		 * 
		 * -> true일 경우 2~5번 반복,  false인 경우 for문 종료
		 * 
		 * */
	}
	
	
	public void example2() {
		
		// 5 ~ 1 까지 1씩 감소, 거꾸로 반복 출력
		for(int i = 5 ; i > 0  ; i-- ) {
			
			System.out.println(i);
		}
	}
	
	
	public void example3() {
		
		// 2부터 20 까지 짝수만 출력
		// 2 4 6 8 10 12 14 16 18 20
		
		for(int i=2 ; i <= 20 ; i += 2 ) {
			System.out.print(i + " ");
		}
		
		System.out.println(); // 줄바꿈
		
		// 1에서 20 사이의 정수 중 2의 배수만 출력하세요.
		for(int i=1 ; i <= 20 ; i++) {
			
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public void example4() {
		// 1.0 ~ 10.0 까지 0.5씩 증가하기
		// 1.0 1.5 2.0 2.5 3.0 3.5 .... 9.5 10.0
		
		for(double i = 1 ;  i <= 10  ; i += 0.5 ) {
			System.out.print(i + " ");
		}
	}
	
	
	public void example5() {
		// 'A' ~ 'Z' 출력하기
		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.print(ch);
		}
	}
	
	
	public void example6() {
		// 5개의 정수를 입력받아 평균 값 구하기(소수점 아래 1자리)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 입력되는 값을 모두 더할 변수 선언 및 0으로 초기화
		
		for(int i=1 ; i <= 5 ; i++ ) {
			System.out.print("입력" + i + " : "); // 입력 1 : 
			sum += sc.nextInt(); // sum 변수에 입력되는 값을 누적
		}
		
		System.out.printf("평균 : %.1f \n", sum/5.0   );
		
	}
	
	
	public void challenge1() {
		// 2~9 사이 정수를 입력받아 
		// 입력 받은 단의 구구단을 출력
		// 단, 2~9 사이 숫자가 아닌 경우 "잘못 입력하셨습니다" 출력
		
		// [실행 화면]
		// 단 입력 : 2
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// ... (중략)
		// 2 x 9 = 18
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 2 ~ 9 사이
			// 구구단 출력
			for(int i=1 ; i<=9 ; i++) { // i == 1 ~ 9, 1씩 증가
				
				// 2 x 1 = 2
				// 2 x 2 = 4
				// 2 x 3 = 6
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
			
		} else {
			System.out.println( "잘못 입력하셨습니다");
		}
	}

	
	public void example7() {
		// 1~10 사이 난수 10개 발생 시켜 출력
		
		// java.lang.Math 클래스
		// - 수학과 관련된 기능을 제공하는 클래스
		// (java.lang 패키지는 컴파일 시 자동으로 import 된다)
		
		// Math.random() 메소드
		// - 난수를 발생시키는 기능
		// 난수 발생 범위 :  0.0 <= 난수 < 1.0
		
		for(int i=1 ; i<=10 ; i++ ) {
			int random =  (int)(Math.random() * 10 + 1) ;
			//  0.0 <=   Math.random()   < 1.0
			//  0.0 <=   Math.random() * 10  < 10.0
			//  1.0 <=   Math.random() * 10 + 1  < 11.0
			//  1 <=   (int)(Math.random() * 10 + 1)  < 11
			
			System.out.println(random);	
		}
	}
		
	
	public void example8() {
		
		// 1 ~ 20 사이의 난수 5개를 발생시켜 출력하고
		// 발생한 난수의 합계를 출력.
		
		int sum = 0; // 발생된 난수의 합계를 저장할 변수
		for(int i=1 ; i<=5 ; i++ ) {
			
			// 1 ~ 20 사이 난수 발생
			int random =  (int)(Math.random() * 20 + 1);
			System.out.println(random); // 난수 출력
			sum += random; // 발생한 난수 누적
		}
		
		System.out.println("합계 : " + sum);
	}
	
	
	public void example9() {
		
		// 두 정수를 입력받아 
		// 두 정수 사이의 모든 정수 합을 출력
		// 단, 입력 1이 입력 2보다 클 경우 "입력 1이 입력2보다 큽니다" 출력
		
		// [실행화면]
		// 입력 1 : 2
		// 입력 2 : 4
		// 합계 : 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt(); //3
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt(); //5
		
		if(num1 > num2) { // 입력 1이 입력 2보다 클 경우
			System.out.println("입력 1이 입력 2보다 큽니다.");
		
		} else { // 입력 1이 입력 2보다 작거나 같을 경우
			
			// 3 + 4 + 5 = 12
			int sum = 0;
			for(int i=num1 ; i<=num2 ; i++ ) {  // i= 3, 4, 5
				sum += i;
			}
			
			System.out.println("합계 : " + sum);
		}
	}
	
	
	
	// 문자열 입력 하기, 문자열 비교하기
	public void example10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input = sc.next();
		
		sc.nextLine(); // 입력 버퍼에 남아있는 \n 를 제거
		
		System.out.print("입력 : ");
		String input2 = sc.nextLine();
		
		// sc.next() : 다음 입력되는 단어 하나를 얻어옴. (단어 구분 기준 == 공백)
		// sc.nextLine() : 다음 입력되는 한 줄(문장)과 엔터까지 얻어옴.
		
		System.out.println(input);
		System.out.println(input2);
		
		// 키보드 입력 시     키보드 -> 입력 버퍼 -> 프로그램(콘솔)  순서로 입력됨.
		
		// 입력 버퍼 ex)
		// 서울시(공백)중구(공백)남대문로(\n)
		
		// sc.next() 1회 : 서울시    /  (공백)중구(공백)남대문로(\n)
		// sc.next() 2회 : 중구       /  (공백)남대문로(\n)
		// sc.next() 3회 : 남대문로 /  (\n)
		// sc.next() 4회 : (\n)  /   empty
		
		
		// 서울(\n)
		// sc.next() : 서울    	/  (\n)
		// sc.nextLine() : (\n) /  empty
		
		// * nextLine() 앞에  next(), nextInt(), nextDouble() 등을 사용하면
		// 입력 버퍼에 남아있는 개행문자(\n)를 바로 얻어오기 때문에 입력을 못하는 문제 발생.
		
		
		// 입력받은 input, input2 가 같은 문자열인 비교
		
		//if(input.equals(input2)) {
		if(input == input2) {
			// input.equals(input2) : 
			// input이 참조하는 문자열값과 input2가 참조하는 문자열값이 같은가?
			// -> 같으면 true, 아니면 false
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
	
	
	
} // class end


