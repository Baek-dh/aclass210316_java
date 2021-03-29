package edu.kh.array.ex.practice.service;

import java.util.Scanner;

public class PracticeService {
	/*
	 * 실습문제 4 정수 5개를 입력 받아 배열을 초기화 하고 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력. 배열에
	 * 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	 */

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : "); // 입력 0 : , 입력 1 :
			arr[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int input = sc.nextInt();

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				System.out.println("인덱스 : " + i);

				flag = false;
			}
		}

		if (flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}

	/*
	 * 실습문제 7 주민등록번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등번호(-포함) : ");
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

	/*실습문제 13 
	 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	 * 문자의 개수와 함께 출력하세요. 
	 * ex. 
	 * 문자열 : application 
	 * 문자열에 있는 문자 : a, p, l, i, c, t, o, n 
	 * 문자 개수 : 8
	 */
	public void practice13() {
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3. char배열에서 중복값 존재할 경우 출력X,

		int count = 0; // 문자 개수 카운트

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {

			boolean flag = true; // 중복 체크용 변수

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) { // 중복이발생했을 때
					flag = false;
					break;
				}
			}

			if (flag) { // 중복이 발생하지 않았을 경우
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		}

		System.out.println();
		System.out.println("문자 개수 : " + count);
	}

}
