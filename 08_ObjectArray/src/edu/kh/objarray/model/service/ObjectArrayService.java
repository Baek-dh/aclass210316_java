package edu.kh.objarray.model.service;

import edu.kh.objarray.model.vo.Book;

public class ObjectArrayService {

	private Book[] books = null;
	// null : �ƹ��͵� �����ϰ� ���� ���� ����
	
	public void init1() {
		// 3ĭ¥�� Book �迭�� �����Ͽ� �� �迭 ��Ҹ� �ʱ�ȭ
		
		// Book[] ��ü ����
		books = new Book[3];
		
		// Book[]�� �� ���(Book ���� ����)�� 
		// ���ο� Book ��ü�� �����ؼ� ���� �ϵ��� ��.
		books[0] = new Book();
		
		books[0].setTitle("�ڹ��� ����");
		books[0].setContent("�ڹٿ� ���� ������ ��������.");
		books[0].setAuthor("���� ��");
		books[0].setPublisher("��������");
		books[0].setPrice(30000);
		
		
		books[1] = new Book("�����", "������� �̾߱�", "�����㺣��", "���л�", 10000);
		
		books[2] = new Book("�ﱹ��", "���������ϰ� �̷��� ������", "�̹���", "�˿���ġ�ڸ���", 130000);
	}
	
	
	
	
	
	
	
	
}
