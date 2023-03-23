/*

 TIP)
 하나의 물리적인 java 파일에 여러개의 클래스 생성 가능 (실무에서는 거의불가)
 원칙적인 방법은 : 패키지 > kr.or.kosa.utils.Apt  또는 kr.or.kosa.model.Apt 클래스 만듦
 */


class Apt{	// 설계도 == 데이터 타입 (=사용자 정의 타입) (작은 타입을 여러개 가지고 있는 큰타입)
			// 설계도는 구체화 되지 않으면 의미가 없다.
			// 목적 : 설계도를 가지고 같은 아파트를 무한히 생성하겠다.(in Memory) >> new 연산자를 사용
			// 생성된 설계도는 필요시 재사용이 가능하다 (똑같은 아파트 무한이 생성하능)
	String doorColor;
}

public class Ex04_Object_Variable {
	public static void main(String[] args) {
		Apt apt; //apt 변수는 Apt 객체의 주소값을 담을 수 있는 변수
		apt = new Apt(); // heap 메모리의 영역에 Apt가 생성되고 생성된 Apt의 주소가 apt에 할당
		//apt 는 참조값(주소값)을 갖는다.
		System.out.println("apt 주소 : " + apt);
		//Apt@515f550a => Apt(클래스이름) + @(문자) + 주소값(16진수 값) 결합된 것이 return
		
		Apt apt2 = new Apt();
		//apt 변수가 가지는 값(주소값) 과 apt2가지는 주소값은 다르다
		System.out.println(apt == apt2); // false 
		System.out.println(apt + " : " + apt2);
	
		Apt apt3 = apt2; // 주소값 할당
		System.out.println(apt3 == apt2); // 
		System.out.println(apt3 + " : "+ apt2);
		
		int i = 10;
		int j = i; // 값 할당	
		j = 1000; // j=1000, i=10 별개의 밗
		
		apt2.doorColor = "red";
		System.out.println(apt3.doorColor);
		apt3.doorColor = "blue";
		System.out.println(apt2.doorColor);
		
		//동작 원리
		/*
		  Ex04_Object_Variable.java >> javac.exe > Ex04_Object_Variable.class (실행파일)
		 > java Ex04_Object_Variable 
		 > JVM 동작 >> OS >> 메모리 >> 메모리(용도)구획정리 >> 각각에 땅에 자원할당(메모리) >> 프로그램 종료
		 > 사용했던 memory OS 반환 > END
		 
		 1. main 함수 실행 .... 반드시 local variable 초기화
		 2. main 시작점 
		 */
		 
	}

}
