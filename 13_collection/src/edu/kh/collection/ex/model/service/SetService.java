package edu.kh.collection.ex.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetService {

	// Set(집합)
	// - 순서가 존재하지 않음 (== 인덱스가 없다)
	// - 중복 데이터 저장 불가능. (null도 하나만 저장 가능)
	//  -> 중복 확인을 위해서 equals()가 반드시 오버라이딩 되어 있어야 한다.
	
	public void example1() {
		// HashSet 
		// - 객체 저장 시 hashCode() (해시함수)를 이용해
		//   빠른 처리와 중복 검사가 가능한 Set
		// - equals() 뿐만 아니라 hashCode()도 오버라이딩 되어 있어야 하단.
		
		Set<String> set1 = new HashSet<String>();
		// String 같이 자바에서 제공해주는 클래스는
		// 대부분 equals(), hashCode() 오버라이딩 잘 되어있다.
		
		set1.add( new String("Apple") );
		set1.add( new String("Samsung") );
		set1.add( new String("LG") );
		set1.add( new String("Apple") );
		set1.add( new String("사과") );
		set1.add( new String("삼성") );
		set1.add( new String("엘지") );
		set1.add( new String("Hello") );
		set1.add( new String("World") );
		//set1.add( null );
		//set1.add( null );
		//set1.add( null );
		
		System.out.println(set1.toString());
		// 순서 유지 X, 중복 제거 O
		
		
		// Set에서 값 하나만 꺼내기
		// -> Set은 원하는 값 하나만 얻어 오는 것이 불가능하다.
		//  --> 하나씩 꺼내서 확인을 해야 함.
		
		// 1. Iterator 반복자
		// - 컬렉션 프레임워크에서 제공하는 
		//   컬렉션 객체 요소를 하나씩 반복 접근해 얻어오는 방법.
		
		Iterator<String> it = set1.iterator();
		// set1.iterator() : set1 집합에 저장된 내용을 하나씩 꺼내올수 있는 형태로 변형하는 메소드
		
		while(it.hasNext()) {
			// it.hasNext() : 꺼내올 다음 값이 있는지 검사. 있으면 true, 없으면 false
			
			String str = it.next();
			System.out.println(str);
			// it.next() : 다음 값 꺼내오기
		}
		
		System.out.println("--------------------");
		// 2. 향상된 for문을 이용
		for(String s :  set1){
			System.out.println(s);
		}
	}
	
	
	public void lotto1() {
		
		Set<Integer> lotto = new HashSet<Integer>(); 
		
		while(true) {
			
			int ran = (int)(Math.random() * 45 + 1);
			// 1 ~ 45 사이 난수
			
			lotto.add(ran); // AutoBoxing(int -> Integer)
			
			if(lotto.size() == 6) {
				// lotto에 중복 없이 6개가 저장된 경우
				break;
			}
		}
		System.out.println(lotto);
		
	}
	
	
	
	
	
	
	
	
	
}
