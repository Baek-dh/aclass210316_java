package edu.kh.poly.practice.model.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class PracticeService implements QuestionInterface{

	private Scanner sc = new Scanner(System.in);
	
	private Person[] pArr = new Person[3];

	@Override
	public void displayMenu() {
		
		int sel = 0;
		
		do {
			System.out.println("===== 종합 문제 =====");
			System.out.println("1. Person 배열 pArr에 학생 또는 직원 등록하기.");
			System.out.println("2. pArr 배열에 저장되어있는 모든 요소 출력하기.");
			System.out.println("3. pArr배열에서 학생 정보만 출력하기");
			System.out.println("4. pArr배열에서 직원 정보만 출력하기");
			System.out.println("5. pArr배열에서 입력 받은 이름과 같은 사람 정보를 얻어와 출력하기");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (sel) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: System.out.println("프로그램 종료"); break;

			
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
			
		}while(sel != 0);
		
	}
	
	
	// 1. Person 배열 pArr에 학생 또는 직원 등록하기.
	// -> 숫자 1을 입력 받으면 학생 객체를 생성해 배열요소에 대입
	// -> 숫자 2를 입력 받으면 직원 객체를 생성해 배열 요소에 대입
	@Override
	public void insertPerson() {
		
		for(int i=0 ; i<pArr.length ; i++) {
			
			System.out.print("1.학생 / 2.직원 (선택) : ");
			int sel = sc.nextInt();
			sc.nextLine();
			
			if(sel == 1) { // 학생 정보(이름, 나이, 학년, 반) 입력 받기
				System.out.println("=== 학생 정보 입력 ===");
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				
				pArr[i] = new Student(name, age, grade, classroom);
				
			}else if(sel == 2) { // 직원 정보(이름, 나이, 사번, 직급, 급여) 입력 받기
				System.out.println("=== 직원 정보 입력 ===");
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("사번 : ");
				int empNo = sc.nextInt();
				
				System.out.print("직급 : ");
				String position = sc.next();
				
				System.out.print("급여: ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				pArr[i] = new Employee(name, age, empNo, position, salary);
				
			}
			
			
		}
		
		
	}
	
	
	

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		
	}
	
	// 3. pArr배열에서 학생 정보만 출력하기
	@Override
	public void selectStudent() {
		
		for(Person p : pArr) {
			if(p != null &&  p instanceof Student) {
				System.out.println(p);
			}
		}
		
	}
	
	

	@Override
	public void selectEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person searchName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String printName() {
		// TODO Auto-generated method stub
		
		return null;
	}


	@Override
	public void printAge() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Person deletePerson() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
