package edu.kh.eh.model.exception;

public class SonjeolException extends Exception{
	// 사용자 정의 예외를 만드는 방법!
	// - 아무 Exception 클래스 중 하나를 상속받으면 된다!
	// - 생성자 작성
	
	public SonjeolException() {
		super("감소가 3번되서 손절예외 발생");
	}
	
	public SonjeolException(String msg) {
		super(msg);
	}
	
}
