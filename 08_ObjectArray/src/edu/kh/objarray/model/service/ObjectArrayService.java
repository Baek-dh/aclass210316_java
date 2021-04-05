package edu.kh.objarray.model.service;

import edu.kh.objarray.model.vo.Book;

public class ObjectArrayService {

	private Book[] books = null;
	// null : 아무것도 참조하고 있지 않은 상태
	
	public void init1() {
		// 3칸짜리 Book 배열을 생성하여 각 배열 요소를 초기화
		
		// Book[] 객체 생성
		books = new Book[3];
		
		// Book[]의 각 요소(Book 참조 변수)에 
		// 새로운 Book 객체를 생성해서 참조 하도록 함.
		books[0] = new Book();
		
		books[0].setTitle("자바의 정석");
		books[0].setContent("자바에 대한 내용이 적혀있음.");
		books[0].setAuthor("남궁 성");
		books[0].setPublisher("도우출판");
		books[0].setPrice(30000);
		
		
		books[1] = new Book("어린왕자", "어린왕자의 이야기", "생택쥐베리", "교학사", 10000);
		
		books[2] = new Book("삼국지", "도원결의하고 이러쿵 저러쿵", "이문열", "알에이치코리아", 130000);
	}
	
	
	
	
	
	
	
	
}
