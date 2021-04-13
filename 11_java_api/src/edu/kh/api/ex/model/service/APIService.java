package edu.kh.api.ex.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import edu.kh.api.ex.model.vo.Student;

public class APIService {

	public void example1() {
		
		Student std1 = new Student("ȫ�浿", 3, 5);
		Student std2 = new Student("ȫ�浿", 3, 5);
		
		System.out.println(std1);
		System.out.println( std1.equals(std2)  ); // true

		System.out.println( std1.hashCode() ); 
		System.out.println( std2.hashCode() ); 
		System.out.println( std1.hashCode() == std2.hashCode() ); 
		// equals() �������̵� �� hashCode() �������̵� �ؾߵȴ�
		// -> equals()�� true�� ��� �� ��ü�� hashCode()�� ���ƾ� �Ѵ�.
		
	}
	
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		// String ���ͷ� �ۼ� �� �޸𸮱���
		// - String ���ͷ��� ������ ���ڿ��� String Pool�̶�� Heap���� ������ ������.
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.print("abc �Է� : ");
		String str4 = sc.next(); // abc �Է�
		
		
		
		System.out.println(str1 == str2); // true
		// String ���ͷ��� "abc"�� �ʱ�ȭ�� str1, str2��
		// String Pool�� �ִ� ���� "abc" �ּҸ� �����Ѵ�.
		
		System.out.println(str1 == str3); // false
		System.out.println(str1 == str4); // false
		
		
		// str1�� str2�� �����ϴ� �ּҰ� ������ ������ Ȯ��
		// -> System.identityHashCode()
		//  -> �ڹٴ� ���� �޸� �ּҸ� ������ ������
		//     �޸� �ּҸ� �̿��� ������ ���¿� ���ڸ� ��ȯ�ϴ�
		//     identityHashCode()��� ���� ���� �ִ�. 
		//  == ���� �ּҶ�� �����ص� ������.
		System.out.println("std1 : " + System.identityHashCode(str1));
		System.out.println("std2 : " + System.identityHashCode(str2));
		System.out.println("std3 : " + System.identityHashCode(str3));
		System.out.println("std4 : " + System.identityHashCode(str4));
	}
	
	
	public void example3() {
		
		// String�� �Һ���(immutable) 
		//		<-> ������(mutable)
		
		// String �ڷ����� ���� �ѹ� �޸𸮿� ����Ǹ� ����� ���� �� ����. == �Һ���
		// String ��ü�� ���ϰ� �� ���
		// ������ �����ϰ��ִ� String ��ü�� ���� ���� �ƴ�
		// ���ο� String ��ü�� �޸𸮿� �����Ǿ� �� �ּҸ� ������.
		
		// String �Һ������� ���� �߻��ϴ� ������
		// - ���� ���� String ��ü�� �ݺ������� �̾��, ���� ���� �̷������ �Ǹ�
		//   �� �� ���� ���ο� String ��ü�� �����Ǳ� ������
		//   ���� �޸� �Һ� �߱��Ѵ�.
		
		String str1 = "abc";
		
		// "def" ���ڿ� �߰� �� str1�� ���� �ּ� Ȯ��
		System.out.println("def �߰� �� : " + System.identityHashCode(str1));
		
		str1 += "def";
		System.out.println(str1); // abcdef
		
		// "def" ���ڿ� �߰� �� str1�� ���� �ּ� Ȯ��
		System.out.println("def �߰� �� : " + System.identityHashCode(str1));
		
		/*String result = "";
		for(int i=0 ; i<10000 ; i++) {
			result += i;
			// 012345678910111213141516
			System.out.println(result);
		}*/
	}
	
	
	public void example4() {
		// String �Һ��� ���� �ذ�
		// -> StringBuffer, StringBuilder
		
		// StringBuffer, StringBuilder (mutable, ������)
		// -> ���ڿ� ���� ���ص� ���� ��ü ������ ��ȭ�� �̷����.
		
		// �� Ŭ������ �̸��� �ٸ����� ����� ������ �����ϴ�.
		
		// ������ : StringBuffer�� ����ȭ�� �����Ѵ�.
		//		  StringBuilder�� ����ȭ�� �������� �ʴ´�.
		
		// Buffer: ��ǻ�Ͱ� �����͸� �����ϴ� �޸� ���� (�ӽ� ����)
		// (Scanner�� �Է¹��� : Ű���忡�� �Էµ� ���� �ӽ� �����ϴ� �޸� ����)
		
		// Buffering : ���ۿ� �����͸� ä��� ����
		// -> ���α׷��� ���۸��� ���� ä���� �����͸� ����ϰų� ����Ѵ�.
		
		StringBuffer sb1 = new StringBuffer(); // 16ĭ ¥�� StringBuffer��ü ����
		//sb1 = "abc"; // String ó�� �� ���� �Ұ���
		
		System.out.println("abc �߰� �� �뷮 : " + sb1.capacity());
		System.out.println("abc �߰� �� �ּ� : " + System.identityHashCode(sb1));
		
		sb1.append("abc"); // append(��) : ���ڿ� ���� �ڿ� �߰�
		
		System.out.println("abc �߰� �� �뷮 : " + sb1.capacity());
		System.out.println("abc �߰� �� �ּ� : " + System.identityHashCode(sb1));
		
		sb1.append("defghijklmnopqrstuvwxyz"); // 23 ���� �߰� -> 16ĭ ũ�� �Ѿ.
		
		System.out.println(sb1.toString()); // ���ڿ��� �ڿ� �߰� �Ǿ��� Ȯ��
		System.out.println("�뷮 ���� Ȯ�� : " + sb1.capacity());
		System.out.println("�ּ� ��ȭ Ȯ�� : " + System.identityHashCode(sb1));
		
		// StringBuffer�� ���� String���� ��ȯ�ϴ� ���
		String str = sb1.toString();
		
		
		//////////////////////////////////////////////////////////
		
		StringBuilder sb2 = new StringBuilder(5); // 5ĭ ¥�� StringBuilder ��ü ����
		
		System.out.println("�߰� �� �뷮 : " + sb2.capacity());
		
		sb2.append("Hello World!!"); // 13����
		
		System.out.println("�߰� �� �뷮 : " + sb2.capacity());
		System.out.println(sb2.toString());
		
		// StringBuffer�� StringBuilder ������ ����
		
	}
	
	public void example5() {
		// String���� �����ϴ� ������ �޼ҵ�
		
		// boolean contains(CharSequence s)
		// Ư�� �ܾ ���ڿ��� ���ԵǾ� �ִ��� Ȯ���Ͽ� ������ true / ������ false
		
		String str1 = "���ع��� ��λ��� ...";
		System.out.println( str1.contains("��λ�")  );
		
		// int	indexOf(String str)
		// Ư�� ���ڿ��� �����ϴ� �ε����� ��ȯ. ������ -1�� ��ȯ
		// �ߺ��Ǵ� ���ڿ��� �ִٸ� 
		// �տ������� �˻��ؼ� ù ��° �˻��Ǵ� �ε����� ��ȯ�Ѵ�.
		// <-> lastIndexOf(String str) (�ڿ��� ����)
		
		String str2 = "abcdef abcdef";
		System.out.println( str2.indexOf("c")   ); // 2
		System.out.println( str2.lastIndexOf("c")   ); // 9
		
		System.out.println( str2.indexOf("z")   ); // -1
		
		
		// String[]	split(String ������)
		// �����ڸ� �������� �ϳ��� ���ڿ��� �и��Ͽ� String[] ���·� ��ȯ
		// ex) ���,�ٳ���,����  ->  "," �������� �и��ϸ�
		//    [0] = ���, [1] = �ٳ���, [2] = ����
		String str3 = "���,,,�ٳ���,,,����,,,���ξ���,,,������,,,���,,,������";
		
		String[] arr = str3.split(",,,");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// static String join(CharSequence delimiter, CharSequence... elements)
		// �迭�� delimiter(������)�� �̿��Ͽ� �ϳ��� String���� ��ȯ
		
		String str4 = String.join("/", arr);
					// arr �迭 ��ҵ��� "/"�� �����ڷ� �Ͽ� �ϳ��� ���ڿ��� ����� ��ȯ
		System.out.println(str4);
		
		
		// StringTokenizer
		// - java.util�� ����.
		// ���ڿ��� ������ �����ڷ� �ɰ��� �ϳ��� ������� ��ȯ�ϴ� ��ü
		// (��, �����ڰ� �������� ������ ���鹮�ڰ� �����ڰ� ��.)
		// (���鹮�� : ����, ����, �� ��)
		
		String str5 = "aa bb cc";
		StringTokenizer st1 = new StringTokenizer(str5);
		// -> ���鹮�ڸ� �������� ������
		
		while(st1.hasMoreTokens()) {
			// hasMoreTokens() : ��ū �� ������ �ֳ�?
			//					 ���� ��ū�� �ִ��� �˻��ϴ� �޼ҵ�
			
			System.out.println(st1.nextToken());
			// nextToken() : ���� ��ū�� ����.
		}
		
		
		String str6 = "AA/BB,CC~DD";
		StringTokenizer st2 = new StringTokenizer(str6, "/,~" );
		// ���ڿ����� "/,~" 3�� �� �ϳ��� ��ġ�ϸ� �ɰ���
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		// StringTokenizer�� 
		// split()���� �����ڸ� �پ��ϰ� ������ �� �ְ�,
		// �ӵ��� �̼��ϰ� �� ����. (�ٷ��� �����Ͱ� ���� �� �ξ� ����)
		
	}
	
	
	public void example6() {
		// ��¥ ���� Ŭ����  Date
		// - java.util�� ������.
		// - ���� ������, �޼ҵ尡 ���̻� ������ �ʴ� ���� Ŭ����
		// -> �츮�� ���� ����� DB Date�� ���谡 ����
		
		Date date1 = new Date();
		// Date() �⺻������ : ���� ��¥, �ð� ������ ��ü�� ��ϵ�.
		System.out.println(date1);
		

		// Date(long date) ������
		// 1970�� 1�� 1��, 00:00 GMT�� ��������
		// -> �ѱ������� KST�� ǥ�õ�. ��? OS�� �ѱ� OS�� �ð� ������ ������ ����
		
		// �� �и������� ���� �ð��� ��ü�� ��ϵ�.
		// �и� ������(�и���, ms) == 1/1000 ��
		// 1ms == 0.001��
		Date date2 = new Date(0L);
		System.out.println(date2);
		// �츮���� �������δ� 1970/1/1 09:00 ��µ�
		
		// 1970/1/2 09:00 ���
		Date date3 = new Date( 1000L * 60 * 60 * 24 );
		System.out.println(date3);
		
		// ���� �ð����� ���� 24�ð� �� ���
		Date date4 = new Date( System.currentTimeMillis() - (1000L * 60 * 60 * 24 )  );
		
		System.out.println(System.currentTimeMillis()  );
		
		System.out.println(date4);
		
		
		// SimpleDateFormat Ŭ����
		// - java.text
		// - ��¥�� ���ϴ� �������� ������ �����ϴ� ����� ����
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("G yyyy�� MM�� dd�� E���� HH�� mm�� ss��");
		
		String text = sdf.format(date4);
		// date4�� ����� �ð��� sdf�� ������ ������ ���ڿ��� ��ȯ�Ͽ�
		// text�� ������ ����
		
		System.out.println(text);
	}
	
	
	public void example7() {
		// Math Ŭ����
		// - java.lang
		// - Math Ŭ������ ��� �ʵ�� �޼ҵ�� static�̴�.
		//  -> ��� ������ static ������ �ִ�
		//     == Math ��ü�� static �� �����ϱ� ������ ��ü ������ ���� �ʴ´�.
		
		double d1 = 360.45;
		// 3604.5    ( * 10 )
		
		// ceil() -> 3605.0
		// round() -> 3605
		// floor() -> 3604.0
		
		// ( / 10.0)
		// 3605.0 / 10.0 = 360.5
		// 3605 / 10.0 = 360.5
		// 3604.0 / 10.0 = 360.4
		
		
		// �Ҽ��� �Ʒ� ��° �ڸ����� �ø�, �ݿø�, ���� ó���ϱ�
		
		// double ceil() : �ø�
		System.out.println(  Math.ceil(d1 * 10)  / 10.0  );
		
		// double/int round() : �ݿø�
		System.out.println( Math.round(d1 * 10) / 10.0  );
		
		// double floor() : ����
		System.out.println( Math.floor(d1 * 10)  / 10.0 );
		
		// random() : 0�̻� 1�̸��� ���� �߻�
		
		// 1~50 ���� ������ �߻����� ����
		int ran =  (int)(Math.random() * 50 + 1);
		
		// 10 ~ 20���� ����
		int ran2 = (int)(Math.random() * 11 + 10);
				// 0 <= ran <11
				// 10 <= ran < 21
		
		System.out.println(ran);
		System.out.println(ran2);
	}
	
	
	public void example8() {
		
		// Wrapper Ŭ����
		// -> �⺻ �ڷ����� ��ü ���·� ��ȯ�ϴ� Ŭ������ �����Ͽ� 
		//     Wrapper Ŭ������� �θ���.
		
		// �� ����ϴ°�?
		// 1) �� �ڷ������� �ʿ��� �ʵ�, ����� �����ϱ� ���Ͽ�
		//  ex) Integer.MAX_VALUE; // int �ִ밪
		//      Integer.parseInt( "123" ); // String -> int�� ��ȯ
		
		// 2) �÷��ǿ� �������� ������ �� �ְ� �ϱ� ���Ͽ�
		//		-> �÷����� ��ü�� ������ �� ����. (�⺻ �ڷ����� ���� �Ұ���)
		//		--> ������ Wrapper Ŭ������ ���� ���� .
		
		/* �⺻ �ڷ���		Wrapper Ŭ����
		 * byte				Byte
		 * short			Short
		 * int				Integer
		 * long				Long
		 * float			Float
		 * double			Double
		 * char				Character
		 * boolean			Boolean
		 * 
		 * */
		
		// Integer Wrapper Ŭ���� ���캸��
		System.out.println(Integer.BYTES); // int byte ũ�� == 4
		System.out.println(Integer.SIZE);  // int�� bit ũ�� == 32
		System.out.println(Integer.MAX_VALUE); // �ִ밪
		System.out.println(Integer.MIN_VALUE); // �ּҰ�
		System.out.println(Integer.TYPE); // ��Ī�Ǵ� ���� �ڷ���
		
		
		// String���ε� �⺻�ڷ��� ������ -> �⺻�ڷ������� ��ȯ
		//  ex) "123"  ->  123
		int iNum = Integer.parseInt("10000");
		System.out.println(iNum + 10000);
		
		long lNum = Long.parseLong("10000");
		
		// "3.123456789"�� double, float�� ����
		double dNum = Double.parseDouble("3.12345678901234567890");
		float fNum = Float.parseFloat("3.12345678901234567890");
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		
		// �⺻�ڷ��� -> String���� ��ȯ
		
		int num = 123;
		
		String str = Integer.valueOf(num).toString();
		String st2 = num + "";
		
		
		// Boxing : �⺻ �ڷ��� -> ��ü�� ����
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("20"); // Boxing + Parsing
		
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		
		// UnBoxing : Wrapper ��ü -> �⺻ �ڷ���
		int u1 = i1.intValue(); // i1 �� �����ϴ� ��ü�� ���� int�� ��ȯ
		int u2 = (int)i2; // Wrapper ��ü -> �⺻ �ڷ��� ����ȯ

		
		// AutoBoxing / AutoUnBoxing
		// �ڵ�����   �⺻ �ڷ��� <-> Wrapper ��ü  ����ȯ
		
		//Integer i3 = new Integer(100);
		Integer i3 = 100; // AutoBoxing
		
		int u3 = i3; // AutoUnBoxing
		
		// ���� : Java9 ���� ���ĺ��ʹ� AutoBoxing/AutoUnBoxing�� ������
		
	}
	
	
	
	
	
	
	
	
	
	
}
