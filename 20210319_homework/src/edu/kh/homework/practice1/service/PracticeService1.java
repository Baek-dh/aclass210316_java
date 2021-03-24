package edu.kh.homework.practice1.service;

import java.util.Scanner;

public class PracticeService1 {

	/*
	 * 실습문제1 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여 주석에 적힌 값과 같은 값이
	 * 나오도록 코드를 작성하세요.
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
		// float, double은 정확한 실수를 나타내는게 아니라 근사값을 표시함
		// float는 소수점 아래 8자리 까지 표시
		// double은 소수점 아래 16자리 까지 표시
		// double은 float보다 2배 다 많은 소수점을 표현함(정확도가 2배 높다)

		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println(ch + iNum1); // 75
		System.out.println((char)(ch + iNum1)); // 'K'
	}
	
	
	/* 실습문제 2
	모든 사람이 사탕을 골고루 나눠가지려고 한다. 
	인원 수와 사탕 개수를 키보드로 입력 받고
	1인당 동일하게 나눠가진 사탕 개수와 나눠주고 
	남은 사탕의 개수를 출력하세요.
	
	[실행화면]
	인원 수 : 29
	사탕 개수 : 100
	1인당 사탕 개수 : 3
	남는 사탕 개수 : 13
	*/
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		// sc.next() : 다음 입력되는 단어를 읽어옴.
		// sc.nextInt() : 다음 입력되는 정수를 읽어옴.
		// sc.nextDouble() : 다음 입력되는 실수를 읽어옴.
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt(); // 변수 선언과 동시에 초기화
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (input2 / input1));
		System.out.println("남는 사탕 개수 : " + (input2 % input1));
	}
	
	/* 실습문제 3
	키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	ex.
	이름 : 홍길동
	학년(정수만) : 3
	반(정수만) : 4
	번호(정수만) : 15
	성별(남학생/여학생) : 남학생
	성적(소수점 아래 둘째 자리까지) : 85.75
	3학년 4반 15번 홍길동 남학생의 성적은 85.75이다
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int classRoom = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double record = sc.nextDouble();
		
		//3학년 4반 15번 홍길동 남학생의 성적은 85.75이다
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n"
							, grade, classRoom, number, name, gender, record);
		// \n : 개행문자(줄바꿈)
	}
	

	/* 실습문제 4
	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	
	[실행화면]
	국어 : 60
	영어 : 80
	수학 : 40
	합계 : 180
	평균 : 60.0
	*/
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat; // 합계
		double avg = sum / 3.0; // 평균
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
	
	
	
	
	
	
	

}
