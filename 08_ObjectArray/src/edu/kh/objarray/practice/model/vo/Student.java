package edu.kh.objarray.practice.model.vo;

public class Student {
	private int grade; // �г�
	private int classroom; // ��
	private String name; // �̸�
	private int kor; // ��������
	private int eng; // ��������
	private int math; // ��������
	
	// �⺻������ �ڵ� �ϼ� : ctrl + space -> enter
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	// �Ű����� �ִ� ������ �ڵ� �ϼ� : alt + shift + s -> o 
	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}
	
	
	public String toString() {
		// 3�г� 5�� ȫ�浿 >> ���� : 100, ���� : 50, ���� :70
		return  grade + "�г� " + classroom + "�� " + name 
				+ " >> ���� : " + kor + ", ���� : " + eng + ", ���� : " + math;
	}
	
	
	
	
	
	
	
}