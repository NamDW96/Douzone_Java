/*
 
 */



public class Ex_03 {

	public static void main(String[] args) {
		
		int num = 100000000;
		System.out.println("num : " + num);
		//int num2= 10000000000; 
		//The literal 10000000000 of type int is out of range 
		// 컴파일 오류
		
		//1. 해결방법 
		long num2 = 100000000000L;
		/* The literal 100000000000 of type int is out of range */
		//개발자가 입력하는 정수의 범위는 int 의 범위를벗어나면 안된다.
		System.out.println("num2" + num2);
		
		long num3 = 100; // 값을 보는것이 아니라 타입을 봐라.(리터럴값도)
						 // long num3 = (long)100
		  			     // 암시적 형변환 (컴파일러가 자동으로 변환 - 큰 타입에 작은 타입을 넣는 것은 신경쓰지않는다.)
						 // 작은 타입에 있는 값을 큰 타입에 넣는 것은 가능.
		System.out.println("num3=" + num3);
		
		//해결
		//int num4 = 10000000000; The literal 10000000000 of type int is out of range 
		//int num4 = 10000000000L; Type mismatch: cannot convert from long to int
		////손실이 발생하더라도 담아보겠다. => 명시적 형변환 (타입 변환)
		int num4 = (int)10000000000L;
		System.out.println("타입변환 / num4의 값은 : " +num4 + "이렇게 나오는 값은 쓰레기값");
		//데이터 손실발생 => 쓰레기값 , ghost data / 정상적인 해결방법 x 
		
		// int num5 = 1000L; 값이 1000으로 int의 범위에 해당하지만 1000L 은 long 타입이므로 타입오류 발생.
	    // 해결방법1. (강제형변환)
		//int num5 =(int)1000L; // 값의 손실이 없지만 있을수도있다.
		
		//2. 담는 그릇을 크게
		
		
		char ch = '가';
		System.out.println("한문자 출력 : " +  ch);
		
		// char ch2 = '가나'; 예외발생 / 컴파일 불가 한문자만 가능
		
		ch = 'a';
		ch = 'A';
		
		// char 정수 타입 (문자를 저장하지만 내부적으로 정수값을 가지고 있다.)
		// 아스키 코드표에서 십진수값과 문자값을 비교해 보세요.?
		
		int chint = ch;
		System.out.println("ch 문자의 10진수 값 : " + chint); // 65 
		
		//int chint = ch;
		//내부적으로 암묵적으로 자동 형변환이 발생 - int chint = (int)ch;
		
		int chint2 = 'a';
		System.out.println(chint2);
		int intch2 = (int)chint2; // 명시저그로 개발자가 직접 형변환 하는것도 가능.
		
		int intch3 = 65;
		//char chint3 = intch3; // Type mismatch
		
		//1. 명시적 형변환 >> 데이터의 손실 발생
		//char chint3 = (char)intch3;
		
		//2. 받는 그릇을 크게
		//int chint3 = intch3; 개발자의 의도와는 다름 에러x
		
		char chint3 = (char)intch3;
		System.out.println("chint3 이 가지는 문자값 : " + chint3);
		
		
		
		long num5 = 1000L;
		
		
		//String 타입 (8+1) 값 타입 처럼 사용하자.
		//문자열 >> 문자들의 집합 >> 문자의 배열 >> 문자열
		// int, long 과 동일하게 사용
		String name = "홍길동";
		name = "동길홍";
		
		String color = "red";
		color = color + "방가방가"; // 오라클 => + 산술만 한다 >> 결합 연산자 ||  - 자바는 '+' 를 사용해서 산술과 결합을 모두 할 수 있다.
		System.out.println("color의 문자열 : " + color);
		
		//TIP) 연산자는 언어마다 표현이 다르다
		//JAVA >> 자바는 '+' 를 사용해서 산술과 결합을 모두 할 수 있다.
		//Oracle >> '+' 산술만 기능, '||' 결합 연산자 ex) '안녕' || '하위' >> '안녕하위'
		
		char sing='\'';
		System.out.println(sing);
		
		// 홍"길"동 이라는 문자열 출력하기
		String username = "홍\"길\"동";
		System.out.println(username);
		
		String str1 = "1000";
		String str2 = "10";
		String result = str1 + str2; // + 문자열사이에서는 결합의 의미를 갖는다.
		System.out.println("result : " + result);
		
		System.out.println("100"+100); //100100
		System.out.println(100+"100");
		System.out.println(100+"100"+100);
		System.out.println(100+100+"100");
		System.out.println(100+(100+"100"));		
		// 오라클에서는 문자형식숫자의 경우 산술연산자  -처리 결과 : 200 200 300 300 200
		
		
		// 경로 "C:\Temp" 문자열을 String 변수에 담아 출력
		String path = "C:\\Temp";
		System.out.println(path);
		// \t (tab) , \n (new line)
		
		float f = 3.14f; // Type mismatch: cannot convert from double to float
		
		float data = 1.123456789f;
		System.out.println("float data : 1.123456789 : " + data);
		// 대략적으로 소수이하 7자리까지 표현가능
		
		double data2 = 1.123456789123456789;
		System.out.println("double data : " +data2);
		//대략 16자리 까지 표현
		
		double data3 = 100;
		System.out.println("data3 : " + data3);
		
		double data4 = 100;
		int number = 100;
		
		int result4 = (int)data4 + number;
		
		int number2 = 100;
		// byte b2 = number2; Type mismatch 에러 발생
		
		//byte b2 = (byte)number2;
		//int b2 = number2;
		// 강제로 캐스팅 (형변환) or 받는 쪽의 크기 확장
		
		//Today Point
		//1. 큰타입 + 작은 타입 연산 결과는 큰타입
		//2. 타입간
		
		int data5 = 100;
		byte b3 = (byte)data5;
		
		byte b4 = 20;
		//int data6 = b4; 컴파일러가 내부적으로 암시적 형변환
		int data6 = (int)b4;
		
		
	}					
}