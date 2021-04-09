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
			System.out.println("===== ���� ���� =====");
			System.out.println("1. Person �迭 pArr�� �л� �Ǵ� ���� ����ϱ�.");
			System.out.println("2. pArr �迭�� ����Ǿ��ִ� ��� ��� ����ϱ�.");
			System.out.println("3. pArr�迭���� �л� ������ ����ϱ�");
			System.out.println("4. pArr�迭���� ���� ������ ����ϱ�");
			System.out.println("5. pArr�迭���� �Է� ���� �̸��� ���� ��� ������ ���� ����ϱ�");
			System.out.println("0. ����");
			
			System.out.print("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (sel) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: System.out.println("���α׷� ����"); break;

			
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
			
			
		}while(sel != 0);
		
	}
	
	
	// 1. Person �迭 pArr�� �л� �Ǵ� ���� ����ϱ�.
	// -> ���� 1�� �Է� ������ �л� ��ü�� ������ �迭��ҿ� ����
	// -> ���� 2�� �Է� ������ ���� ��ü�� ������ �迭 ��ҿ� ����
	@Override
	public void insertPerson() {
		
		for(int i=0 ; i<pArr.length ; i++) {
			
			System.out.print("1.�л� / 2.���� (����) : ");
			int sel = sc.nextInt();
			sc.nextLine();
			
			if(sel == 1) { // �л� ����(�̸�, ����, �г�, ��) �Է� �ޱ�
				System.out.println("=== �л� ���� �Է� ===");
				
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				int age = sc.nextInt();
				
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				
				pArr[i] = new Student(name, age, grade, classroom);
				
			}else if(sel == 2) { // ���� ����(�̸�, ����, ���, ����, �޿�) �Է� �ޱ�
				System.out.println("=== ���� ���� �Է� ===");
				
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				int age = sc.nextInt();
				
				System.out.print("��� : ");
				int empNo = sc.nextInt();
				
				System.out.print("���� : ");
				String position = sc.next();
				
				System.out.print("�޿�: ");
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
	
	// 3. pArr�迭���� �л� ������ ����ϱ�
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
