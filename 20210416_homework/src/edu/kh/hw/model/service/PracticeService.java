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
		System.out.print("���̵� : ");
		String id = sc.next();
		
		System.out.print("��й�ȣ : ");
		String pwd = sc.next();
			
		for(Member mem : memList) {
						// List<Member> memList
			
			// �Է� ���� ���̵�/��й�ȣ�� ��ġ�ϴ� ȸ���� ���� ���
			if(mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
				
				loginMember = mem; // �ʵ忡 ����� loginMember ������ ���� ȸ�� ������ �߰�
			}
		}
		
		// �տ� for�� ���� �Ŀ��� loginMember�� null�� ��� == ���̵�, ��й�ȣ�� ��ġ�ϴ� ȸ���� ����Ʈ�� ����
		if(loginMember == null) {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
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
		
		System.out.print("���̵� : ");
		String input = sc.next();
		
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		for(Member m : memList) { // ȸ�� ��Ͽ��� ȸ�� ������ �ϳ��� ������
			if( m.getMemberId().equals(input)) { // ������ ȸ���� ���̵�� �Է� ���� ���̵� ���� ���(== �ߺ�)
				System.out.println("�ߺ��Ǵ� ���̵� �ֽ��ϴ�. �ٽ� �õ����ּ���.");
				return; // �޼ҵ带 �� �������� ������ ȣ���� ������ ���ư�
			}
		}
		
		// �տ� for�� ���� �� return ���� ���� ��� == �ߺ� ���̵� ���� 
		Member member = new Member(input, memberPwd, name); // ���ο� ȸ�� ��ü�� ����
		memList.add(member); // ������ ȸ�� ��ü�� ȸ�� ����Ʈ�� �߰�
		System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
		
		
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
		System.out.println("���̵� : " + loginMember.getMemberId());
		System.out.println("�̸� : " + loginMember.getName());
		System.out.println("���� ����Ʈ : " + loginMember.getPoint());
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
		
		System.out.print("���� ��й�ȣ : ");
		String currentPwd = sc.next();
		
		System.out.print("�� ��й�ȣ : ");
		String newPwd1 = sc.next();
		
		System.out.print("�� ��й�ȣ Ȯ�� : ");
		String newPwd2 = sc.next();
		sc.nextLine();
		
		
		if(!currentPwd.equals(loginMember.getMemberPwd())) { // ���� ��й�ȣ�� ��ġ���� �ʴ� ���
			System.out.println("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			
		}else if(!newPwd1.equals(newPwd2)){ // �� ��й�ȣ, �� ��й�ȣ Ȯ���� ��ġ���� �ʴ� ���
			System.out.println("�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}else {
			loginMember.setMemberPwd(newPwd1); // �α����� ȸ���� ��й�ȣ�� ����
			System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
		}
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
		System.out.print("������ �ݾ� : ");
		int point = sc.nextInt();
		sc.nextLine();
		
		System.out.println(point + "����Ʈ�� �����Ǿ����ϴ�.");
		
		System.out.println("���� �� ����Ʈ : " + loginMember.getPoint());
		
		loginMember.setPoint(loginMember.getPoint() + point);  // ���� ����Ʈ�� �Է� ���� ����Ʈ ��ŭ �߰�
		System.out.println("���� �� ����Ʈ : " + loginMember.getPoint());
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
		
		System.out.println("1000 ����Ʈ�� �ζ� 1ȸ ���� ����");
		System.out.println("���� ���� ����Ʈ : " + loginMember.getPoint());
		System.out.print("����� ����Ʈ(��� �� 0 �Է�, 1000 ������ �ۼ�) : ");
		int usePoint = sc.nextInt();
		sc.nextLine();
		
		
		if(usePoint == 0) { // 0 �Է� �� 
			System.out.println("���� ���");
			
		}else if(usePoint < 1000) {
			System.out.println("���Ÿ� ���� �� 1000 ����Ʈ �̻��� �ۼ����ּ���."); // 1000 �̸� �Է� ��
			
		}else if(usePoint > loginMember.getPoint()) { // ���� ����Ʈ ���� ���� �Է� ��
			
			System.out.println("������ ����Ʈ���� ���� ���� �ۼ��� �� �����ϴ�.");
			
		}else {
			
			for(int i=0 ; i<usePoint/1000 ; i++) {
				
				// �ζ� ��ȣ �� �� ����
				Set<Integer> lotto = new TreeSet<Integer>();
				// Set : ���� X �ߺ� X ,  TreeSet : �ߺ� X, �������� ����
			
				while(true) {
					lotto.add(  (int)(Math.random() * 45 +1)  );
					
					if(lotto.size() == 6) break;
				}
				
				System.out.println(lotto); // �ζ� ��ȣ ���
				
				// �α����� ȸ���� PurchaseLotto����Ʈ�� ������ �ζ� ��ȣ �� �� �߰�
				loginMember.getPurchaseLotto().add(lotto); 
				// setPurchaseLotto( new ArrayList<Set<Integer>>()  )
			
			}
			
			// �α����� ȸ���� ����Ʈ���� ����� ����Ʈ ����.
			loginMember.setPoint( loginMember.getPoint() - (usePoint / 1000 * 1000)   );
		}
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
		
		for(Set<Integer> lotto : loginMember.getPurchaseLotto()) {
			System.out.println(lotto);
		}
	}
	
	
	
	
	
}
