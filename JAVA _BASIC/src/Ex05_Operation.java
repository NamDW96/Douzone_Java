

public class Ex05_Operation {

	public static void main(String[] args) {
		//연산자 (산술, 논리, 관계)
		int result = 100 / 100;
		System.out.println("result : "+ result);
		
		result = 13/2; //몫을 구하는 연산자
		System.out.println("result : "+ result);
		
		//나머지를구하는 연산자 (%)
		result = 13 % 2;
		System.out.println("result : "+ result);
		
		//증가, 감소 (증가감 연산자 : ++ 1씩증가, -- 1씩 감소)
		int i = 10;
		++i; //전치증가
		System.out.println("i :" + i);
		i++;
		System.out.println("i :" + i);
		//다른 연산과 결합되지 않고, 혼자서 있으면 전치와 후치는 의미가 없다
		
		//Today poin (증가감 연산자와 다른 연산이 결합되면)
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2; // 전치가 먼저 동작
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		
		result2 = i2 + j2++;
		System.out.println("reslut2 : "+ result2 + " j2 : " + j2);
		
		byte b = 100;
		byte b2 = 1;
		
		//byte b3 = b + b2; //Type mismatch
		//연산시 자바는 기본적으로 4byte 공간을 만들고 공간에 값을 넣고 연산 => (int + int)
		// 이런 이유로 자바를 사용할 때 메모리를 크게 신경쓰지 말래유.
		
		//byte b3 = (byte)(b + b2); // 손실이 발생 할 수 있다.
		//System.out.println(b3);
		
		int b3 = b + b2; // 손실이 발생하지 않는다.
		System.out.println(b3);
		
		/* today point
		   1. 정수의 연산은 [int] 타입으로 변환 후 처리한다.
		   ex) byte + short >> 컴파일러가 내부적으로 값들을 int 방에 넣고 처리 >> int + int 처리
		   ex) char + char >> 컴파일러가 내부적으로 int + int 로 처리한다.
		   정리 : 정수의 연산에서 int 보다 작은 타입들은 내부적으로 모두 int 로 바꾸어서 연산을 처리한다. 
		   long은 예외 / byte, short, char >> int로 전환 후 처리
		   ex) char + int >> int || int + int >> int || int + long >> long
		
		   2. 정수 + 실수 >> 타입의 크기와 상관없이 >> 실수
		   	
		*/
		
		long lo = 10000000000L;
		float fo = 1.2f;
		// result3 = lo + fo;
		//  
		// 방법 1. result3 = (long)(lo + fo);
		
		float result3 = lo + fo; 
		System.out.println("결과 : " + result3);
		double result31 = (double)(lo + fo);
		System.out.println(result31);
		
		char c2 = '!';
		char c3 = '!';
		int result4 = c2+ c3;
		System.out.println("result4 : " + result4);
		
		// 변수 >> 타입(자료형) >> 연산(산술, 논리, 관계) >> 제어문(if, for, while ...)
		
		// 제어문
		int sum = 0; //local variable 초기화
		for(int j=0; j<=100; j++) { //j의 변수의 Scope <= 블록변수 제어문이 동작하는 동안만 사용되는 변수
			//sum = sum + j;
			//System.out.println(j+"회 반복할 때 sum의 값 : "+sum);
			if(j% 2 == 0) { //짝수라면
				sum+=j; // sum = sum + j
				System.out.println("1부터"+j+"까지의 짝수의 합 : "+ sum);
			}
		}
		// == 연산자 (값을 비교하는 연산자) - 타입을 비교하는 것이 아닌 가지고있는 값만 비교
		if(10 == 10.0f) {
			System.out.println("같다.");
		}
		else {
			System.out.println("아님");			
			}
		
		// != 부정연산자 
		if('A' !=65) {
			System.out.println("다름");
		}
		else {
			System.out.println("가틈");
		}
		
		//Today point 
		//연산자 중에서 제어문 역할 (조건, 반복)
		//삼항연산자 암기
		int p = 10;
		int k = -10;
		int result5 = (p==k) ? p:k;
		System.out.println("result5 : " + result5 );
		
		// '===' javascript 값과 타입 모두를 비교한다.
		
		int result6 = 0;
		if(p==k) {
			result6 = p;
		}
		else {
			result6 = k;
		}
		System.out.println("result6의 값은 : " + result6);
		
		/*
		 진리표 (논리연산)
		 0 : 거짓(false), 1 : 참 (true)
		 
		 OR 연산, AND 연산
		 
		 DB 쿼리 Oreacle)
		 SQL => 자연어 ...
		 select * from emp where job = 'IT' and sal > 3000
		 select * from emp where job = 'IT' or sal > 3000
		 		AND 	,	OR
		 0  0	 0			0
		 0  1	 0			1	
		 1  0	 0			1
		 1  1	 1			1
		 
		 연산 비트 연산 ( | or연산 ..... & and 연산 )
		 || 논리연산 (OR), && 논리연산 (AND)
		 
		 
		 */
		int x = 3;
		int y = 5;
		
		//비트 여산 (십진수 >> 이진수 바꾸어서 연산)
		System.out.println("x | y :"+ (x | y));
		/*
		  256  128 64  32  16   8   4   2   1
		5: 0	0	0	0	0	0	1	0	1
		3: 0    0 	0	0	0	0	0	1	1
	(OR)
	-------------------------------------------
		   0	0	0	0	0	0	1	1	1  => 7
		   x | y = 3 | 5 = 7 - 비트연산
		 */
		System.out.println("x & y :"+ (x & y));
		/*
		  256  128 64  32  16   8   4   2   1
		5: 0	0	0	0	0	0	1	0	1
		3: 0    0 	0	0	0	0	0	1	1
	(AND)
	-------------------------------------------
		   0	0	0	0	0	0	0	0	1  => 1
		   x & y = 3 & 5 = 1 - 비트연산
		
		비트 (영상 처리, 판독)
		
		Today Point
		(&& >> and 연산)
		(|| >> or 연산)
		if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 ) {A} else{B} => 거짓 조건이 나오는 순간 처리
		if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1 ) {A} else{B} => 참이 나온느 순간 처리
		
		제어문 암기!
		
		 */
		
		/*
		  int data = 90; switch(data) { 
		  case 100 : System.out.println("100입니다"); 
		  case90 : System.out.println("90입니다"); 
		  case 80 : System.out.println("80입니다");
		  default : System.out.println("내 아입니다");
		  
		 
		  }
		 */
		int data = 90;
		switch(data) {
			case 100 : System.out.println("100입니다");
						break;
			case 90 : System.out.println("90입니다");
						break;
			case 80 : System.out.println("80입니다");
						break;
			default : System.out.println("내 아입니다");
						
		}
		
		int month=3; // 월을 데이터로 제공받는다
		String res= ""; //빈 문자열로 초기화
		switch(month) {
			case 1:
			case 3: 
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: res="31일";
					break;
			case 4:
			case 6:
			case 9:
			case 11: res ="30일";
					break;
					
			case 2: res="29일";
					break;
			default : res="월이 아닙니다.";				
		}
		
		System.out.println(month + "월은 " + res + " 까지 입니다");
		
		
		//난수 (랜덤값, 임의의 추출값) 을 얻기를 원한다
		//easy : 구글링 <- 인터넷이 안돼는 환경에서는 찾을 수 없다.
		// 자바 자습서 (API 문서) -> 자원에 대한 설명과 사용방법이 들어있다.(영어ㅜ)
		//https://docs.oracle.com/javase/8/docs/api/index.html 검색
		//패키지 기준 (폴더별로 자원읆 모아놈)
		//java.lang.Math 클래스 - 여러가지 수학적 기능 사용가능.
		//import java.lang.*; 생략 - default open ...
		
		//public static double random();
		// double greater than or equal to 0.0 and less than 1.0
		// 결과 : 0.0 <= random < 1.0
		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random() *10 : " + (Math.random())*10);
		System.out.println((int)(Math.random()*10)+1);//1~10까지의 난수
		
		int var = ((int)(Math.random()*10)+1)*100;
		System.out.println("경품번호는 : " +var);
		switch(var) {
		case 1000: System.out.println("TV,NoteBook,냉장고, 한우세트, 휴지 당첨!");
					break;
		case 900: System.out.println("NoteBook,냉장고, 한우세트, 휴지 당첨!");
					break;
		case 800: System.out.println("냉장고, 한우세트, 휴지 당첨!");
					break;
		case 700: System.out.println("한우세트, 휴지 당첨!");
					break;
		case 600: System.out.println("휴지 당첨!");
					break;
		default : System.out.println("칫솔");
		}
		
		int var5 = ((int)(Math.random()*10)+1)*100;
		System.out.println("경품번호는 : "+ var5);
		String str5 = "";
		switch(var5) {
			case 1000 : str5 += "TV, ";
			case 900 : str5 += "NoteBook, ";
			case 800 : str5 += "냉장고, ";
			case 700 : str5 += "한우세트, ";
			case 600 : str5 += "휴지 "; break;
			default : str5 += "칫솔";
		}
		System.out.println("당첨된 경품은 : "+str5+"입니다");
	}
}





