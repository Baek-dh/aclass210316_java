package edu.kh.poly.ex.model.service;

import javax.print.PrintService;

import edu.kh.poly.ex.model.vo.Car;
import edu.kh.poly.ex.model.vo.ModelX;
import edu.kh.poly.ex.model.vo.Porter;
import edu.kh.poly.ex.model.vo.Spark;

public class PolymorphismService {

	public void example1() {
		
		Car c = new Car();
		// 부모 타입 참조변수 = 부모 타입 객체 
		
		// 부모 타입 참조 변수로 
		// 부모 객체의 메소드를 접근할 수 있다.
		c.setEngine("엔진있음");
		c.setHandle("보통핸들");
		c.setWheel(4);
		
		Porter p = new Porter();
		// 자식 타입 참조변수 = 자식 타입 객체

		// 자식 타입 참조 변수로 
		// 자식 객체의 메소드를 접근할 수 있다.
		p.setEngine("경유엔진");
		p.setHandle("크고 동그란 핸들");
		p.setWheel(8);
		p.setWeight(4.5);
		p.setBay("큰 짐칸");
		
		
		// 다형성 적용
		
		// 부모 타입 참조변수 = 자식 타입 객체
		Car c2 = new Porter();
		// Car, Porter 자료형이 다름
		// 컴퓨터는 같은 자료형 끼리만 연산이 가능하다 -> 이를 위배한 모양
		
		// 부모 타입의 참조 변수로는
		// 아무리 자식 객체를 참조하고 있어도
		// 상속 받은 부모 부분만 참조 가능하다.
		c2.setEngine("경유엔진");
		c2.setHandle("크고 동그란 핸들");
		c2.setWheel(8);
		
		System.out.println(c2.getEngine());
		System.out.println(c2.getHandle());
		System.out.println(c2.getWheel());
		
		System.out.println(c2.toString());
		
		Car c3 = new Spark();
		Car c4 = new ModelX();
		
		//Car c5 = new String("abc");
		// -> String은 Car를 상속 받지 않아서 다형성(업캐스팅)이 적용되지 않음.
	}
	
	
	public void example2() {
		
		// 업 캐스팅 : 부모 타입 참조 변수로   자식 객체 주소를 참조
		
		// 다운 캐스팅 : 부모 타입의 참조 변수를  자식 타입으로 형변환 하여
		// 		          자식 객체를 온전히 참조함.
		
		
		// 업 캐스팅
		Car c = new Spark("휘발유엔진", 4, "작은 핸들", "검정");
		// 부모 타입 참조 변수         // 자식 객체
		
		System.out.println( c.getEngine() );
		System.out.println( c.getWheel() );
		System.out.println( c.getHandle() );
		// 엔진, 바퀴, 핸들은 부모로 부터 상속 받은 것
		
		//System.out.println( c.getColor() );
		// 색상은 자식만의 멤버 --> 부모 참조 변수로 참조할 수 없다
		// --> 부모 참조 변수를   자식 참조 변수로 형변환!
		
		System.out.println(   ((Spark)c).getColor() );
		// (Spark) 형변환 연산자 보다  . 점 연산자가 우선 순위 높음
		// --> 부모 참조 변수와 형변환 연산자 (Spark)를 괄호()로 묶어 먼저 연산처리함.
	}
	
	
	
	
	
	
	

	
}
