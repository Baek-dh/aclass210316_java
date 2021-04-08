package edu.kh.poly.ex.model.service;

import javax.print.PrintService;

import edu.kh.poly.ex.model.vo.Car;
import edu.kh.poly.ex.model.vo.ModelX;
import edu.kh.poly.ex.model.vo.Porter;
import edu.kh.poly.ex.model.vo.Spark;

public class PolymorphismService {

	public void example1() {
		
		Car c = new Car();
		// �θ� Ÿ�� �������� = �θ� Ÿ�� ��ü 
		
		// �θ� Ÿ�� ���� ������ 
		// �θ� ��ü�� �޼ҵ带 ������ �� �ִ�.
		c.setEngine("��������");
		c.setHandle("�����ڵ�");
		c.setWheel(4);
		
		Porter p = new Porter();
		// �ڽ� Ÿ�� �������� = �ڽ� Ÿ�� ��ü

		// �ڽ� Ÿ�� ���� ������ 
		// �ڽ� ��ü�� �޼ҵ带 ������ �� �ִ�.
		p.setEngine("��������");
		p.setHandle("ũ�� ���׶� �ڵ�");
		p.setWheel(8);
		p.setWeight(4.5);
		p.setBay("ū ��ĭ");
		
		
		// ������ ����
		
		// �θ� Ÿ�� �������� = �ڽ� Ÿ�� ��ü
		Car c2 = new Porter();
		// Car, Porter �ڷ����� �ٸ�
		// ��ǻ�ʹ� ���� �ڷ��� ������ ������ �����ϴ� -> �̸� ������ ���
		
		// �θ� Ÿ���� ���� �����δ�
		// �ƹ��� �ڽ� ��ü�� �����ϰ� �־
		// ��� ���� �θ� �κи� ���� �����ϴ�.
		c2.setEngine("��������");
		c2.setHandle("ũ�� ���׶� �ڵ�");
		c2.setWheel(8);
		
		System.out.println(c2.getEngine());
		System.out.println(c2.getHandle());
		System.out.println(c2.getWheel());
		
		System.out.println(c2.toString());
		
		Car c3 = new Spark();
		Car c4 = new ModelX();
		
		//Car c5 = new String("abc");
		// -> String�� Car�� ��� ���� �ʾƼ� ������(��ĳ����)�� ������� ����.
	}
	
	
	public void example2() {
		
		// �� ĳ���� : �θ� Ÿ�� ���� ������   �ڽ� ��ü �ּҸ� ����
		
		// �ٿ� ĳ���� : �θ� Ÿ���� ���� ������  �ڽ� Ÿ������ ����ȯ �Ͽ�
		// 		          �ڽ� ��ü�� ������ ������.
		
		
		// �� ĳ����
		Car c = new Spark("�ֹ�������", 4, "���� �ڵ�", "����");
		// �θ� Ÿ�� ���� ����         // �ڽ� ��ü
		
		System.out.println( c.getEngine() );
		System.out.println( c.getWheel() );
		System.out.println( c.getHandle() );
		// ����, ����, �ڵ��� �θ�� ���� ��� ���� ��
		
		//System.out.println( c.getColor() );
		// ������ �ڽĸ��� ��� --> �θ� ���� ������ ������ �� ����
		// --> �θ� ���� ������   �ڽ� ���� ������ ����ȯ!
		
		System.out.println(   ((Spark)c).getColor() );
		// (Spark) ����ȯ ������ ����  . �� �����ڰ� �켱 ���� ����
		// --> �θ� ���� ������ ����ȯ ������ (Spark)�� ��ȣ()�� ���� ���� ����ó����.
	}
	
	
	
	
	
	
	

	
}
