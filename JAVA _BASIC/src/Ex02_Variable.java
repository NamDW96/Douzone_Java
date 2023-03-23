import kr.or.kosa.Emp;

public class Ex02_Variable {
	public static void main(String[] args) {
		//변수선언 
		int value;   //선언 초기화 되지 않음.
		value = 100; //할당
		
		int age = 99; //선언과 할당 동시에
		
		//초기화 :변수가 최초로 값을 받는 것(할당을 통해서)
		//초기값 정의(초기화) :  
		
		int num = 0;
		System.out.println(num);
		
		//지역변수는 사용시 반드시 초기화를 해야 한다 - 지역변수는 초기화 하고 사용하자
		
		Emp emp; //선언 emp 지역변수
		//System.out.println(emp);
		emp = new Emp(); //new 연산자 메모리에 올리는 작업  > 초기화 작업 >heap에 생성된 객체의 주소값.이 emp에 담긴다.
		//설계 도와 똑같은 집을 짓는다. where? (메모리에)
		System.out.println(emp); //kr.or.kosa.Emp@5e91993f
		
		// .은 주소를 찾아가는 연산자.
		System.out.println(emp.empno); //초기화 하지 않아도 오류 발생하지 않음
		// 초기화 하지 않는 이유
		
		int a, b, c; //같은 타입의 변수를 나열x -> 배열사용
		//초기화 x
		
		a = 100;
		b = 200;
		c = 300; //초기화
		
		int result = a + b; // 초기화
		System.out.println(result);
		
		int k = 100;
		int y = k;
		y = 200;
		
	}
}



/*
 클래스 == 설계도 == 데이터타입
 
 클래스의 종류
 
1. class Car {} > main 함수를 가지고 있지 않은 클래스 > 독자적인 실행 불가 > 다른 클래스에 도움을 주는 클래스(lib)
2. class Car { public static void main (String[] args){} } > main함수를 가지고 있는 클래스 > 독자적 실행가능
3. 현재는 main 함수를 가지고 있는 클래스가 있어야 결과를 확인 할 수 있다.
4. public static void main (String[] args) >> static (new 없이 메모리에 생성o) >> 함수의 이름 (main) : 프로그램의 시작점, 진입점 >> 약속

C# 코드 >> class Car { public static void 'M'ain(String[] args){} }

변수 : variable
데이터(자료를) 담을 수 있는 공간(메모리)의 이름 
공간은(크기)를 가지고 있다 >> 데이터타입(자료형) >> 한정된 메모리의 공간을 잘 활용하기 위해 데이터타입 활용
                                     >> 최소한의 공간 최대한 데이터 표현

변수가 선언되는 위치(scope : 유효범위)
1. instance variable : 객체변수(클래스안에 생성되는 변수) >> class Car { public int door;} 
2. local variable    : 지역변수(함수내부에 생성되는 변수) >> class Car { public void run(){ int data=0;} }
3. static variable   : 공유자원(객체간)             >> class Car {public static int num;}
4. 함수안에 있는 제어블럭 안에 있는 변수 (if ,for) 블럭변수  >> class Car { void run(){ for int i=0... }}                                     
                                                                     
  */
