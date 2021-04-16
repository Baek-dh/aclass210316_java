package edu.kh.hw.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.hw.model.vo.Member;

public class PracticeService {

	private Scanner sc= new Scanner(System.in);
	private List<Member> memList = new ArrayList<Member>(); // ȸ�� ������ ������ ����Ʈ
	private Member loginMember = null; // �α����� ȸ�� ������ ������ ����
	
	
	public PracticeService() {  // �ʱ� ȸ�� �����͸� memList�� �߰�
		memList.add(new Member("user01", "pass01", "������"));
		memList.add(new Member("user02", "pass02", "������"));
		memList.add(new Member("user03", "pass03", "������"));
	}
	
	
	public void mainMenu() {
		int sel = 0;
		do {
			try {
				System.out.println();
				
				if(loginMember == null) { // �α����� �Ǿ����� ���� ���
				
					System.out.println("===== ���� �޴� =====");
					System.out.println("1. �α���");
					System.out.println("2. ȸ������");
					System.out.println("0. ����");
					
					System.out.print("�޴� ���� >> ");
				
					sel = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					switch(sel) {
					case 1 : login(); break;
					case 2 : signUp(); break;
					case 0 : System.out.println("���α׷� ����"); break;
					default : System.out.println("�޴��� �ִ� ��ȣ�� �Է����ּ���.");
					}
				
					
				} else { // �α����� �Ǿ��ִ� ���
					
					System.out.println("===== �α��� �޴� =====");
					System.out.println("1. �� ���� ��ȸ");
					System.out.println("2. ��й�ȣ ����");
					System.out.println("3. ����Ʈ ����");
					System.out.println("4. �ζ� ����");
					System.out.println("5. ������ �ζ� ��ȣ Ȯ��");
					System.out.println("0. �α׾ƿ�");
					
					System.out.print("�޴� ���� >> ");
				
					sel = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					switch(sel) {
					case 1 : selectMyInfo(); break;
					case 2 : changePwd(); break;
					case 3 : pointCharge(); break;
					case 4 : lottoPurchase(); break;
					case 5 : checkLotto(); break;
					case 0 : 
						System.out.println("<<�α׾ƿ�>>"); 
						loginMember = null; // �α׾ƿ�
						sel = -1;
					break;
					default : System.out.println("�޴��� �ִ� ��ȣ�� �Է����ּ���.");
					}
					
				}
				
			}catch (InputMismatchException e) {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���.");
				sel = -1;
				sc.nextLine();
			}
		
		} while(sel !=0);
	}
	
	
	// �α���
	// ���̵�, ��й�ȣ�� �Է� �޾� memList�� ��ġ�ϴ� ȸ�� �ִٸ� �ʵ� loginMember�� �ش� ȸ�� ������ ����
	// ���� ��� "���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�." ���
	/*
	=== �α��� ===
	���̵� : aaa
	��й�ȣ : 123
	���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
	
	=== �α��� ===
	���̵� : user01
	��й�ȣ : pass01

	(�α��� �޴� ���)
	*/
	private void login() {
		System.out.println("=== �α��� ===");
		
	}
	
	
	// ȸ�� ����
	// ���̵�, ��й�ȣ, �̸��� �Է� �޾� ������ Member ��ü�� memList�� �߰�
	
	/*
	=== ȸ�� ���� ===
	���̵� : user04
	��й�ȣ : pass04
	�̸� : ������
	ȸ�� ������ �Ϸ�Ǿ����ϴ�.
	
	(�ߺ� ���̵� ���� ���)
	=== ȸ�� ���� ===
	���̵� : user01
	��й�ȣ : pass04
	�̸� : ������
	�ߺ��Ǵ� ���̵� �ֽ��ϴ�. �ٽ� �õ����ּ���.
	*/
	private void signUp() {
		System.out.println("=== ȸ�� ���� ===");
		
	
		
	}
	
	
	// �� ���� ��ȸ
	/*
	=== �� ���� ��ȸ ===
	���̵� : user01
	�̸� : ������
	���� ����Ʈ : 0
	*/
	private void selectMyInfo() {
		System.out.println("=== �� ���� ��ȸ ===");
		
		
	}
	
	
	// ��й�ȣ ����
	// ���� ��й�ȣ, �� ��й�ȣ, �� ��й�ȣ Ȯ���� �Է� �޾�
	// ���� ��й�ȣ�� ��ġ���� �ʴ� ��� "���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�."
	// �� ��й�ȣ, �� ��й�ȣ Ȯ���� ��ġ���� �ʴ� ��� "�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�."
	// ��й�ȣ ���濡 ������ ��� "��й�ȣ�� ����Ǿ����ϴ�." ���
	/*
	=== ��й�ȣ ���� ===
	���� ��й�ȣ : pass01
	�� ��й�ȣ : 123123
	�� ��й�ȣ Ȯ�� : 123123
	��й�ȣ�� ����Ǿ����ϴ�.
	*/
	private void changePwd() {
		System.out.println("=== ��й�ȣ ���� ===");
		
		
	}
	
	
	
	// ����Ʈ ����
	// �Է� ���� ����Ʈ ��ŭ ȸ���� ����Ʈ�� �����ϱ�
	/*
	=== ����Ʈ ���� ===
	������ �ݾ� : 3000
	3000����Ʈ�� �����Ǿ����ϴ�.
	���� �� ����Ʈ : 0
	���� �� ����Ʈ : 3000
	*/
	private void pointCharge() throws InputMismatchException{
		System.out.println("=== ����Ʈ ���� ===");
		
		
	}
	
	
	
	// �ζ� ����
	// �Է��� ����Ʈ ��ŭ�� �ζ� ��ȣ�� �����Ͽ� �α����� ����� purchaseLotto�� �߰�
	// ��, 0 �Է� �� "���� ���"
	// 1000�� �̸� �Է� �� "���Ÿ� ���� �� 1000 ����Ʈ �̻��� �ۼ����ּ���."
	// ���� ����Ʈ���� ���� �� �Է� �� "������ ����Ʈ���� ���� ���� �ۼ��� �� �����ϴ�." ���
	
	/*
	=== �ζ� ���� ===
	1000 ����Ʈ�� �ζ� 1ȸ ���� ����
	���� ���� ����Ʈ : 3000
	����� ����Ʈ(��� �� 0 �Է�, 1000 ������ �ۼ�) : 2000
	[7, 9, 10, 11, 25, 28]
	[6, 9, 20, 24, 40, 42]
	 */
	private void lottoPurchase() throws InputMismatchException{
		System.out.println("=== �ζ� ���� ===");
		
		
	}
	
	
	// ������ �ζ� ��ȣ Ȯ��
	// ���ݱ��� ������ ��� �ζ� ��ȣ ���
	/*
	=== ������ �ζ� ��ȣ Ȯ�� ===
	[7, 9, 10, 11, 25, 28]
	[6, 9, 20, 24, 40, 42]
	*/
	private void checkLotto() {
		System.out.println("=== ������ �ζ� ��ȣ Ȯ�� ===");
		
	}
	
	
}