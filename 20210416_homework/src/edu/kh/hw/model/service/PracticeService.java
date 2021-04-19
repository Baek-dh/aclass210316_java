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
	private List<Member> memList = new ArrayList<Member>(); // 회원 정보를 저장할 리스트
	private Member loginMember = null; // 로그인한 회원 정보를 저장할 변수
	
	
	public PracticeService() {  // 초기 회원 데이터를 memList에 추가
		memList.add(new Member("user01", "pass01", "유저일"));
		memList.add(new Member("user02", "pass02", "유저이"));
		memList.add(new Member("user03", "pass03", "유저삼"));
	}
	
	
	public void mainMenu() {
		int sel = 0;
		do {
			try {
				System.out.println();
				
				if(loginMember == null) { // 로그인이 되어있지 않은 경우
				
					System.out.println("===== 메인 메뉴 =====");
					System.out.println("1. 로그인");
					System.out.println("2. 회원가입");
					System.out.println("0. 종료");
					
					System.out.print("메뉴 선택 >> ");
				
					sel = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					switch(sel) {
					case 1 : login(); break;
					case 2 : signUp(); break;
					case 0 : System.out.println("프로그램 종료"); break;
					default : System.out.println("메뉴에 있는 번호를 입력해주세요.");
					}
				
					
				} else { // 로그인이 되어있는 경우
					
					System.out.println("===== 로그인 메뉴 =====");
					System.out.println("1. 내 정보 조회");
					System.out.println("2. 비밀번호 변경");
					System.out.println("3. 포인트 충전");
					System.out.println("4. 로또 구매");
					System.out.println("5. 구매한 로또 번호 확인");
					System.out.println("0. 로그아웃");
					
					System.out.print("메뉴 선택 >> ");
				
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
						System.out.println("<<로그아웃>>"); 
						loginMember = null; // 로그아웃
						sel = -1;
					break;
					default : System.out.println("메뉴에 있는 번호를 입력해주세요.");
					}
					
				}
				
			}catch (InputMismatchException e) {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 시도해주세요.");
				sel = -1;
				sc.nextLine();
			}
		
		} while(sel !=0);
	}
	
	
	// 로그인
	// 아이디, 비밀번호를 입력 받아 memList에 일치하는 회원 있다면 필드 loginMember에 해당 회원 정보를 대입
	// 없을 경우 "아이디 또는 비밀번호가 일치하지 않습니다." 출력
	/*
	=== 로그인 ===
	아이디 : aaa
	비밀번호 : 123
	아이디 또는 비밀번호가 일치하지 않습니다.
	
	=== 로그인 ===
	아이디 : user01
	비밀번호 : pass01
	(로그인 메뉴 출력)
	*/
	private void login() {
		System.out.println("=== 로그인 ===");
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
			
		for(Member mem : memList) {
						// List<Member> memList
			
			// 입력 받은 아이디/비밀번호가 일치하는 회원이 있을 경우
			if(mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
				
				loginMember = mem; // 필드에 선언된 loginMember 변수에 현재 회원 정보를 추가
			}
		}
		
		// 앞에 for문 수행 후에도 loginMember가 null인 경우 == 아이디, 비밀번호가 일치하는 회원이 리스트에 없음
		if(loginMember == null) {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}
	
	
	// 회원 가입
	// 아이디, 비밀번호, 이름을 입력 받아 생성한 Member 객체를 memList에 추가
	
	/*
	=== 회원 가입 ===
	아이디 : user04
	비밀번호 : pass04
	이름 : 유저사
	회원 가입이 완료되었습니다.
	
	(중복 아이디가 있을 경우)
	=== 회원 가입 ===
	아이디 : user01
	비밀번호 : pass04
	이름 : 유저일
	중복되는 아이디가 있습니다. 다시 시도해주세요.
	*/
	private void signUp() {
		System.out.println("=== 회원 가입 ===");
		
		System.out.print("아이디 : ");
		String input = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		for(Member m : memList) { // 회원 목록에서 회원 정보를 하나씩 꺼내옴
			if( m.getMemberId().equals(input)) { // 꺼내온 회원의 아이디와 입력 받은 아이디가 같은 경우(== 중복)
				System.out.println("중복되는 아이디가 있습니다. 다시 시도해주세요.");
				return; // 메소드를 현 시점에서 끝내고 호출한 곳으로 돌아감
			}
		}
		
		// 앞에 for문 동작 시 return 되지 않은 경우 == 중복 아이디가 없음 
		Member member = new Member(input, memberPwd, name); // 새로운 회원 객체를 생성
		memList.add(member); // 생성한 회원 객체를 회원 리스트에 추가
		System.out.println("회원 가입이 완료되었습니다.");
		
		
	}
	
	
	// 내 정보 조회
	/*
	=== 내 정보 조회 ===
	아이디 : user01
	이름 : 유저일
	보유 포인트 : 0
	*/
	private void selectMyInfo() {
		System.out.println("=== 내 정보 조회 ===");
		System.out.println("아이디 : " + loginMember.getMemberId());
		System.out.println("이름 : " + loginMember.getName());
		System.out.println("보유 포인트 : " + loginMember.getPoint());
	}
	
	
	
	// 비밀번호 변경
	// 현재 비밀번호, 새 비밀번호, 새 비밀번호 확인을 입력 받아
	// 현재 비밀번호가 일치하지 않는 경우 "현재 비밀번호가 일치하지 않습니다."
	// 새 비밀번호, 새 비밀번호 확인이 일치하지 않는 경우 "새 비밀번호가 일치하지 않습니다."
	// 비밀번호 변경에 성공한 경우 "비밀번호가 변경되었습니다." 출력
	/*
	=== 비밀번호 변경 ===
	현재 비밀번호 : pass01
	새 비밀번호 : 123123
	새 비밀번호 확인 : 123123
	비밀번호가 변경되었습니다.
	*/
	private void changePwd() {
		System.out.println("=== 비밀번호 변경 ===");
		
		System.out.print("현재 비밀번호 : ");
		String currentPwd = sc.next();
		
		System.out.print("새 비밀번호 : ");
		String newPwd1 = sc.next();
		
		System.out.print("새 비밀번호 확인 : ");
		String newPwd2 = sc.next();
		sc.nextLine();
		
		
		if(!currentPwd.equals(loginMember.getMemberPwd())) { // 현재 비밀번호가 일치하지 않는 경우
			System.out.println("현재 비밀번호가 일치하지 않습니다.");
			
		}else if(!newPwd1.equals(newPwd2)){ // 새 비밀번호, 새 비밀번호 확인이 일치하지 않는 경우
			System.out.println("새 비밀번호가 일치하지 않습니다.");
		}else {
			loginMember.setMemberPwd(newPwd1); // 로그인한 회원의 비밀번호를 변경
			System.out.println("비밀번호가 변경되었습니다.");
		}
	}
	
	
	
	// 포인트 충전
	// 입력 받은 포인트 만큼 회원의 포인트를 충전하기
	/*
	=== 포인트 충전 ===
	충전할 금액 : 3000
	3000포인트가 충전되었습니다.
	충전 전 포인트 : 0
	충전 후 포인트 : 3000
	*/
	private void pointCharge() throws InputMismatchException{
		System.out.println("=== 포인트 충전 ===");
		System.out.print("충전할 금액 : ");
		int point = sc.nextInt();
		sc.nextLine();
		
		System.out.println(point + "포인트가 충전되었습니다.");
		
		System.out.println("충전 전 포인트 : " + loginMember.getPoint());
		
		loginMember.setPoint(loginMember.getPoint() + point);  // 이전 포인트에 입력 받은 포인트 만큼 추가
		System.out.println("충전 후 포인트 : " + loginMember.getPoint());
	}
	
	
	// 로또 구매
	// 입력한 포인트 만큼의 로또 번호를 생성하여 로그인한 멤버의 purchaseLotto에 추가
	// 단, 0 입력 시 "구매 취소"
	// 1000원 미만 입력 시 "구매를 원할 시 1000 포인트 이상을 작성해주세요."
	// 보유 포인트보다 많은 값 입력 시 "보유한 포인트보다 많은 값을 작성할 수 없습니다." 출력
	
	/*
	=== 로또 구매 ===
	1000 포인트당 로또 1회 구매 가능
	현재 보유 포인트 : 3000
	사용할 포인트(취소 시 0 입력, 1000 단위로 작성) : 2000
	[7, 9, 10, 11, 25, 28]
	[6, 9, 20, 24, 40, 42]
	 */
	private void lottoPurchase() throws InputMismatchException{
		System.out.println("=== 로또 구매 ===");
		
		System.out.println("1000 포인트당 로또 1회 구매 가능");
		System.out.println("현재 보유 포인트 : " + loginMember.getPoint());
		System.out.print("사용할 포인트(취소 시 0 입력, 1000 단위로 작성) : ");
		int usePoint = sc.nextInt();
		sc.nextLine();
		
		
		if(usePoint == 0) { // 0 입력 시 
			System.out.println("구매 취소");
			
		}else if(usePoint < 1000) {
			System.out.println("구매를 원할 시 1000 포인트 이상을 작성해주세요."); // 1000 미만 입력 시
			
		}else if(usePoint > loginMember.getPoint()) { // 보유 포인트 보다 많이 입력 시
			
			System.out.println("보유한 포인트보다 많은 값을 작성할 수 없습니다.");
			
		}else {
			
			for(int i=0 ; i<usePoint/1000 ; i++) {
				
				// 로또 번호 한 줄 생성
				Set<Integer> lotto = new TreeSet<Integer>();
				// Set : 순서 X 중복 X ,  TreeSet : 중복 X, 오름차순 정렬
			
				while(true) {
					lotto.add(  (int)(Math.random() * 45 +1)  );
					
					if(lotto.size() == 6) break;
				}
				
				System.out.println(lotto); // 로또 번호 출력
				
				// 로그인한 회원의 PurchaseLotto리스트에 생성된 로또 번호 한 줄 추가
				loginMember.getPurchaseLotto().add(lotto); 
				// setPurchaseLotto( new ArrayList<Set<Integer>>()  )
			
			}
			
			// 로그인한 회원의 포인트에서 사용한 포인트 차감.
			loginMember.setPoint( loginMember.getPoint() - (usePoint / 1000 * 1000)   );
		}
	}
	
	
	// 구매한 로또 번호 확인
	// 지금까지 구매한 모든 로또 번호 출력
	/*
	=== 구매한 로또 번호 확인 ===
	[7, 9, 10, 11, 25, 28]
	[6, 9, 20, 24, 40, 42]
	*/
	private void checkLotto() {
		System.out.println("=== 구매한 로또 번호 확인 ===");
		
		for(Set<Integer> lotto : loginMember.getPurchaseLotto()) {
			System.out.println(lotto);
		}
	}
	
	
	
	
	
}
