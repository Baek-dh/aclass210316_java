package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {

	/* for��
	 * 
	 * for(�ʱ�� ; ���ǽ� ; ������){
	 * 	// �ݺ� ������ �ڵ�
	 * }
	 * 
	 * �ʱ�� : for�� ������ �ݺ��� �����ϱ� ���� ����ϴ� ������ �ۼ��ϴ� �κ�
	 * 
	 * ���ǽ� : for���� �ݺ� ���θ� �����ϴ� �κ�
	 * 
	 * ������ : �ʱ�Ŀ� �ۼ��� ������ for���� ������ �� ���� ���� �Ǵ� ���� ��Ű�� �κ�
	 * */
	
	public void example1() {
		
		for( int i=1 ; i <= 10 ; i++ ) {
			System.out.println(i + " ���");
		}
		
		/* 1. �ʱ�Ŀ� �ۼ��� ������ ���� (int i=1)
		 * 
		 * 2. �ۼ��� ������ ���� ���ǽĿ� �������� �� true���� Ȯ��
		 * 
		 * 3. (���ǽ��� true�� ���) for�� ���� �ڵ带 1ȸ ����
		 * 
		 * 4. �������� 1ȸ ���� (i++)
		 * 
		 * 5. ���������� ��ȭ�� �� i�� ���ǽĿ� ����
		 * 
		 * -> true�� ��� 2~5�� �ݺ�,  false�� ��� for�� ����
		 * 
		 * */
	}
	
	
	public void example2() {
		
		// 5 ~ 1 ���� 1�� ����, �Ųٷ� �ݺ� ���
		for(int i = 5 ; i > 0  ; i-- ) {
			
			System.out.println(i);
		}
	}
	
	
	public void example3() {
		
		// 2���� 20 ���� ¦���� ���
		// 2 4 6 8 10 12 14 16 18 20
		
		for(int i=2 ; i <= 20 ; i += 2 ) {
			System.out.print(i + " ");
		}
		
		System.out.println(); // �ٹٲ�
		
		// 1���� 20 ������ ���� �� 2�� ����� ����ϼ���.
		for(int i=1 ; i <= 20 ; i++) {
			
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public void example4() {
		// 1.0 ~ 10.0 ���� 0.5�� �����ϱ�
		// 1.0 1.5 2.0 2.5 3.0 3.5 .... 9.5 10.0
		
		for(double i = 1 ;  i <= 10  ; i += 0.5 ) {
			System.out.print(i + " ");
		}
	}
	
	
	public void example5() {
		// 'A' ~ 'Z' ����ϱ�
		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.print(ch);
		}
	}
	
	
	public void example6() {
		// 5���� ������ �Է¹޾� ��� �� ���ϱ�(�Ҽ��� �Ʒ� 1�ڸ�)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �ԷµǴ� ���� ��� ���� ���� ���� �� 0���� �ʱ�ȭ
		
		for(int i=1 ; i <= 5 ; i++ ) {
			System.out.print("�Է�" + i + " : "); // �Է� 1 : 
			sum += sc.nextInt(); // sum ������ �ԷµǴ� ���� ����
		}
		
		System.out.printf("��� : %.1f \n", sum/5.0   );
		
	}
	
	
	public void challenge1() {
		// 2~9 ���� ������ �Է¹޾� 
		// �Է� ���� ���� �������� ���
		// ��, 2~9 ���� ���ڰ� �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�" ���
		
		// [���� ȭ��]
		// �� �Է� : 2
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// ... (�߷�)
		// 2 x 9 = 18
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 2 ~ 9 ����
			// ������ ���
			for(int i=1 ; i<=9 ; i++) { // i == 1 ~ 9, 1�� ����
				
				// 2 x 1 = 2
				// 2 x 2 = 4
				// 2 x 3 = 6
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
			
		} else {
			System.out.println( "�߸� �Է��ϼ̽��ϴ�");
		}
	}

	
	public void example7() {
		// 1~10 ���� ���� 10�� �߻� ���� ���
		
		// java.lang.Math Ŭ����
		// - ���а� ���õ� ����� �����ϴ� Ŭ����
		// (java.lang ��Ű���� ������ �� �ڵ����� import �ȴ�)
		
		// Math.random() �޼ҵ�
		// - ������ �߻���Ű�� ���
		// ���� �߻� ���� :  0.0 <= ���� < 1.0
		
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
		
		// 1 ~ 20 ������ ���� 5���� �߻����� ����ϰ�
		// �߻��� ������ �հ踦 ���.
		
		int sum = 0; // �߻��� ������ �հ踦 ������ ����
		for(int i=1 ; i<=5 ; i++ ) {
			
			// 1 ~ 20 ���� ���� �߻�
			int random =  (int)(Math.random() * 20 + 1);
			System.out.println(random); // ���� ���
			sum += random; // �߻��� ���� ����
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	
	public void example9() {
		
		// �� ������ �Է¹޾� 
		// �� ���� ������ ��� ���� ���� ���
		// ��, �Է� 1�� �Է� 2���� Ŭ ��� "�Է� 1�� �Է�2���� Ů�ϴ�" ���
		
		// [����ȭ��]
		// �Է� 1 : 2
		// �Է� 2 : 4
		// �հ� : 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt(); //3
		
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt(); //5
		
		if(num1 > num2) { // �Է� 1�� �Է� 2���� Ŭ ���
			System.out.println("�Է� 1�� �Է� 2���� Ů�ϴ�.");
		
		} else { // �Է� 1�� �Է� 2���� �۰ų� ���� ���
			
			// 3 + 4 + 5 = 12
			int sum = 0;
			for(int i=num1 ; i<=num2 ; i++ ) {  // i= 3, 4, 5
				sum += i;
			}
			
			System.out.println("�հ� : " + sum);
		}
	}
	
	
	
	// ���ڿ� �Է� �ϱ�, ���ڿ� ���ϱ�
	public void example10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String input = sc.next();
		
		sc.nextLine(); // �Է� ���ۿ� �����ִ� \n �� ����
		
		System.out.print("�Է� : ");
		String input2 = sc.nextLine();
		
		// sc.next() : ���� �ԷµǴ� �ܾ� �ϳ��� ����. (�ܾ� ���� ���� == ����)
		// sc.nextLine() : ���� �ԷµǴ� �� ��(����)�� ���ͱ��� ����.
		
		System.out.println(input);
		System.out.println(input2);
		
		// Ű���� �Է� ��     Ű���� -> �Է� ���� -> ���α׷�(�ܼ�)  ������ �Էµ�.
		
		// �Է� ���� ex)
		// �����(����)�߱�(����)���빮��(\n)
		
		// sc.next() 1ȸ : �����    /  (����)�߱�(����)���빮��(\n)
		// sc.next() 2ȸ : �߱�       /  (����)���빮��(\n)
		// sc.next() 3ȸ : ���빮�� /  (\n)
		// sc.next() 4ȸ : (\n)  /   empty
		
		
		// ����(\n)
		// sc.next() : ����    	/  (\n)
		// sc.nextLine() : (\n) /  empty
		
		// * nextLine() �տ�  next(), nextInt(), nextDouble() ���� ����ϸ�
		// �Է� ���ۿ� �����ִ� ���๮��(\n)�� �ٷ� ������ ������ �Է��� ���ϴ� ���� �߻�.
		
		
		// �Է¹��� input, input2 �� ���� ���ڿ��� ��
		
		//if(input.equals(input2)) {
		if(input == input2) {
			// input.equals(input2) : 
			// input�� �����ϴ� ���ڿ����� input2�� �����ϴ� ���ڿ����� ������?
			// -> ������ true, �ƴϸ� false
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	}
	
	
	
} // class end


