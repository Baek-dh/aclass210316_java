package edu.kh.api.ex.model.vo;

public class Student {
	private String name;
	private int grade;
	private int classroom;
	
	// 기본 생성자
	public Student() {}

	
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}



	// 매개변수 있는 생성자
	public Student(String name, int grade, int classroom) {
		this(name, grade);
		this.classroom = classroom;
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	
	// Object.toString()
	// - java.lang 패키지에 존재
	
	// 객체가 가지고 있는 필드 값을 하나의 문자열로 반환할 수 있도록 하는 용도로
	// 자바에서 기본 제공하는 메소드(오버라이딩 해서 사용)
	
	// @Override : 컴파일러에게 오버라이딩 된것임을 알림.
	//				오버라이딩 성립 조건을 만족하는지 검사
	@Override
	public String toString() {
		return name + " / " + grade + " / " + classroom;
	}
	
	
	// Object.equals(Object obj)
	// 현재 객체와 전달 받은 객체(obj)가 동등한지 확인하는 메소드
	// (동등 : 객체가 가지고 있는 필드 값이 모두 같으면 동등)
	
	@Override
	public boolean equals(Object obj) {
		// Object obj : 비교할려는 다른 객체 참조 변수
		// 부모타입 참조 변수 = 자식 객체 참조; (다형성 업캐스팅)
		
		// obj가 null인 경우
		if(obj == null) {
			return false;
		}
		
		// obj가 현재 객체인 경우
		if(obj == this) {
			return true;
		}
		// 동일하면 동등한가 = true
		// 동등하면 동일한가 = true || false
		
		
		// this. (this 참조변수) : 현재 객체의 시작주소를 저장하는 참조 변수
		//						 객체내에 생성되어 있음.
		
		// this() (this 생성자) : 클래스에 작성된 다른 생성자를 호출하는 구문
		//						 클래스의 생성자 첫번째 줄에 작성되어 있음.
		
		
		if( !(obj instanceof Student) ) {
			// obj가 참조하는 객체가 Student 타입이 아닐떄
			return false;
		}
		
		// 위에 세 경우가 아니면 같은 타입의 서로 다른 객체이다.
		Student other = (Student)obj; // 다운 캐스팅 해야지만 
									  // 두 Student 객체의 값을 얻어와 비교 가능
		
		if( !this.name.equals(other.name) ) {
			// 현재 객체의 name과 다른 객체의 name이 같지 않은 경우
			return false;
		
		} else if( this.grade != other.grade) {
			// 현재 객체의 grade과 다른 객체의 grade가 같지 않은 경우
			return false;
			
		} else if( this.classroom != other.classroom) {
			// 현재 객체의 classroom과 다른 객체의 classroom이 같지 않은 경우
			return false;
		}
		
		// 모든 필드 값이 같음 == 동등하다
		return true;
	}
	
	
	
	// Object.hashCode()
	// - 동등한 객체 ( equals() 결과가 true인 두 객체 )는 동일한 hashCode를 반환해야 한다.
	//   --> 이러한 이유로 equals() 오버라이딩 시 hashCode()도 오버라이딩 함.
	
	// 왜 hashCode를 사용하는가?
	// -> 해시 테이블에 정렬될 수 있는 값을 생성해서 검색 속도를 향상 시킴
	//    Hash라고 이름붙은 객체에 효과적임. 
	//	  ex) HashSet, LinkedHashSet, HashMap 등
	
	@Override
	public int hashCode() {
		// 동등한 객체는 같은 값이 반환되어야 함
		// 몇변을 호출해도 같은 값이여야 한다.
		// 서로 다른 객체가 중복되는 hashCode를 가지는 경우를 최소화 한다.
		
		final int PRIME = 31; // prime : 소수
		int result = 1; 
		
		result = PRIME * result 
				+ ( name == null ? 0 : name.hashCode() ); 
		
		result = PRIME * result + grade;
		result = PRIME * result + classroom;
		
		return result;
	}
	
	
	
	
	
	
	
}
