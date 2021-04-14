package edu.kh.eh.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	// 예외(Exception) : 소스코드 수정으로 해결 가능한 오류(컴파일 에러, 런타임 에러)
	
	public void example1() {
		// try : 예외가 발생할 가능성이 있는 코드를 내부에 작성해서 시도함.
		// catch : try이 구문에서 예외가 발생하면 잡아내서 처리함.
		// finally : try-catch 수행 후 마지막에 무조건 실행해야 하는 코드를 작성함.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력받아 나눈 몫을 출력");
		
		// 입력1 / 입력2 = 몫
		System.out.print("입력  1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력  2 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			// java.lang.ArithmeticException: / by zero
			// 0으로 나눌 경우 산술 예외가 발생
	
		} catch(ArithmeticException e) {
			// ArithmeticException e : 발생한 예외 객체를 참조할 참조 변수
			
			System.out.println("0으로 나눌 수 없습니다.");
			// -> 예외 처리 구문
		
		} finally {
			System.out.println("계산 종료.");
		}
	}
	
	
	public void example2() {
		// 하나의 try 구문에 여러 catch문 작성하기
		
		// 3칸짜리 int 배열을 생성하여
		// 입력 받은 정수로 모든 배열 요소를 초기화하고 순서대로 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		try {
			for(int i=0 ; i<arr.length ; i++) {
				System.out.print(i + "번째 인덱스 요소 : ");
				arr[i] = sc.nextInt();
				// java.util.InputMismatchException
				// 입력 형식이 잘못되어 예외 발생
			}
			
			for(int i=0 ; i<=arr.length ; i++) {
						  // 배열 범위 초과
				System.out.println(arr[i]);
				// java.lang.ArrayIndexOutOfBoundsException: 3
				// 배열 범위 초과 예외 발생
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 초과해서 접근할 수 없습니다.");
		
		} catch(InputMismatchException e) {
			System.out.println("정수가 아닌 내용이 입력되었습니다.");
		}
		
	}
	
	
	public void example3() {
		// try-catch 중복 사용
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		try {
			for(int i=0 ; i<arr.length ; i++) {
				System.out.print(i + "번째 인덱스 입력 : ");
				
				try {
					arr[i] = sc.nextInt();
					// InputMismatchException 발생 가능성이 있음
					// -> 예외 처리 후 종료하는 것이 아닌
					//    다시 입력 받게 하기
				}catch(InputMismatchException e) {
					System.out.println("정수만 입력해주세요.");
					i--;
					sc.nextLine(); // 입력 버퍼에 남아있는 문자열을 제거
					// 여기까지만 처리하면 무한 반복 문제가 발생
					// 왜?
					
					// 입력 버퍼 :   ++(엔터)
					
					// 0번째 인덱스 입력 : 10(엔터)
					// -> sc.nextInt(); // 입력 버퍼에서 엔터 직전 까지 정수를 얻어옴.
					
					// 1번째 인덱스 입력 : ++(엔터)
					// -> sc.nextInt(); // 입력 버퍼에서 엔터 직전 까지 정수를 얻어옴.
										// 제일 앞 엔터는 무시
					// -> 다음 내용을 읽어오니 정수가 아님 -> InputMisatchException 발생
					// -> catch 구문 동작 -> for문 처음으로 다시 돌아감
					// ->  1번째 인덱스 입력 : 출력 후 try구문 다시 수행
					// -> sc.nextInt(); // 입력 버퍼에서 엔터 직전 까지 정수를 얻어옴.
					// -> 입력 버퍼에 ++(엔터)가 아직 남아있어서 다시 InputMisatchException 발생
					// -> 이 과정이 무한히 반복됨
				}
			}
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과로 프로그램 종료");
		}
		
		
	}
	
	
	public void example4() {
		// catch문에 작성되는 예외 클래스의 상속 관계
		// - catch문을 여러 개 작성하는 경우 상속 관계를 고려해야 한다.
		// -> 왜? 발생하는 예외들도 예외 클래스를 이용해 생성된 예외 객체들이다.
		// -> catch(예외참조변수) 구문의 예외참조변수로 생성된 예외 객체를 참조한다.
		// --> 예외에도 상속 관계가 있다 == 부모, 자식 관계가 있다 == 다형성이 적용된다.
		// ---> catch 구문의 예외 참조변수에 
		//		부모 타입 예외 참조변수를 작성하면   자식 예외 객체를 모두 참조할 수 있다.
		
		String[] arr = new String[3];
		
		arr[0] = "사과";
		arr[1] = "바나나";
		
		try {	
			for(int i=0 ; i<arr.length ; i++) {
				// 배열 요소에 저장된 값 중 제일 앞글자만 출력
				System.out.println( arr[i].charAt(0)  );
				// java.lang.NullPorinterException 발생
			}
			
		//} catch(NullPointerException e) {
			
			// Exception e로 모든 예외를 처리하면 되는 것 아닌가?
			// -> 예외 상황별로 다른 처리를 할 수 없게 됨.
			
		}catch(NullPointerException e) {
			// try에서 예외 발생 시
			// catch문을 작성 순서대로 발생한 예외가 방문함
			// -> 예외를 잡아서 처리할 수 있으면 처리되고, 없으면 다음 catch로 넘어감
			
			// 단, 앞에 작성된 catch문의 매개변수가 부모타입 참조변수이면
			// 뒤에 작성되는 catch문의 매개변수는 자식타입이 작성될 수 없다.
			// -> 다형성(업캐스팅) 때문에
			System.out.println("null은 참조할 수 없다.");
			
		} catch(Exception e) { // NullPointerException -> Exception 변경
			
			// NullPointerException e
			// == NullPointerException 객체를 참조할 참조 변수
			
			// Exception e == Exception 객체를 참조할 참조 변수
			// == 모든 예외를 참조할 수 있는 부모 타입 참조 변수 (다형성)
			// java.lang.Exception : 모든 예외의 최상위 부모
			
			System.out.println("예외 발생");
		}
		
		// shift + f2 : api 설명서 검색
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
