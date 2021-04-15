package edu.kh.collection.ex.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetService {

	// Set(����)
	// - ������ �������� ���� (== �ε����� ����)
	// - �ߺ� ������ ���� �Ұ���. (null�� �ϳ��� ���� ����)
	//  -> �ߺ� Ȯ���� ���ؼ� equals()�� �ݵ�� �������̵� �Ǿ� �־�� �Ѵ�.
	
	public void example1() {
		// HashSet 
		// - ��ü ���� �� hashCode() (�ؽ��Լ�)�� �̿���
		//   ���� ó���� �ߺ� �˻簡 ������ Set
		// - equals() �Ӹ� �ƴ϶� hashCode()�� �������̵� �Ǿ� �־�� �ϴ�.
		
		Set<String> set1 = new HashSet<String>();
		// String ���� �ڹٿ��� �������ִ� Ŭ������
		// ��κ� equals(), hashCode() �������̵� �� �Ǿ��ִ�.
		
		set1.add( new String("Apple") );
		set1.add( new String("Samsung") );
		set1.add( new String("LG") );
		set1.add( new String("Apple") );
		set1.add( new String("���") );
		set1.add( new String("�Ｚ") );
		set1.add( new String("����") );
		set1.add( new String("Hello") );
		set1.add( new String("World") );
		//set1.add( null );
		//set1.add( null );
		//set1.add( null );
		
		System.out.println(set1.toString());
		// ���� ���� X, �ߺ� ���� O
		
		
		// Set���� �� �ϳ��� ������
		// -> Set�� ���ϴ� �� �ϳ��� ��� ���� ���� �Ұ����ϴ�.
		//  --> �ϳ��� ������ Ȯ���� �ؾ� ��.
		
		// 1. Iterator �ݺ���
		// - �÷��� �����ӿ�ũ���� �����ϴ� 
		//   �÷��� ��ü ��Ҹ� �ϳ��� �ݺ� ������ ������ ���.
		
		Iterator<String> it = set1.iterator();
		// set1.iterator() : set1 ���տ� ����� ������ �ϳ��� �����ü� �ִ� ���·� �����ϴ� �޼ҵ�
		
		while(it.hasNext()) {
			// it.hasNext() : ������ ���� ���� �ִ��� �˻�. ������ true, ������ false
			
			String str = it.next();
			System.out.println(str);
			// it.next() : ���� �� ��������
		}
		
		System.out.println("--------------------");
		// 2. ���� for���� �̿�
		for(String s :  set1){
			System.out.println(s);
		}
	}
	
	
	public void lotto1() {
		
		Set<Integer> lotto = new HashSet<Integer>(); 
		
		while(true) {
			
			int ran = (int)(Math.random() * 45 + 1);
			// 1 ~ 45 ���� ����
			
			lotto.add(ran); // AutoBoxing(int -> Integer)
			
			if(lotto.size() == 6) {
				// lotto�� �ߺ� ���� 6���� ����� ���
				break;
			}
		}
		System.out.println(lotto);
		
	}
	
	
	
	
	
	
	
	
	
}
