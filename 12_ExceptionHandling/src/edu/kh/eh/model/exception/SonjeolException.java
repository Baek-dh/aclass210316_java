package edu.kh.eh.model.exception;

public class SonjeolException extends Exception{
	// ����� ���� ���ܸ� ����� ���!
	// - �ƹ� Exception Ŭ���� �� �ϳ��� ��ӹ����� �ȴ�!
	// - ������ �ۼ�
	
	public SonjeolException() {
		super("���Ұ� 3���Ǽ� �������� �߻�");
	}
	
	public SonjeolException(String msg) {
		super(msg);
	}
	
}
