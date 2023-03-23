import java.util.Scanner;

public class Ex07_printf_format{
	public static void main(String[] args) {
		// System.out.println()
		// C# : Console.Writeline()
		
		System.out.println("A");// 출력+줄바꿈
		System.out.println();
		System.out.println("B");
		
		int num = 1000;
		System.out.println("num");
		System.out.println("num 값은 : "+ num + "입니다");
		
		//형식 format
		System.out.printf("num 값은 %d 입니다",num);
		
		float f = 3.141592f;
		System.out.println(f);
		System.out.printf("f변수값은 %10.2f 입니다 \n", f);
		System.out.printf("f변수값은 %f 입니다 \n", f);
		
		//cmd 모드 (console 창에서) 사용자가 입력한 값을 read ...
		// 설계도 == 클래스 == 타입 은 사용하고 싶다면 heap에 올린다.
		Scanner sc = new Scanner(System.in); //<- 생성자 함수를 호출하는 괄호 /in <- 스태틱 상수 , 출력에 사용됨
		String value = sc.nextLine(); //입력하고 Enter를 칠때까지 대기 -> 프로그램 종료되지않고 계속대기
		System.out.println("value 입력값:" + value);
		
		/*
		int number = sc.nextInt(); // 사용자가 입력한 값을 정수로 변환 return 하는 함수.
		System.out.println(number);
		//a1100같은 정수가 아닌 값 입력시 예외발생
		
		float fnumber = sc.nextFloat();
		
		예외를 줄이는 방법 
		권장사항) nextInt, nextFloat 보다는 모든 데이터를 nextLine()으로 read해서
		Today Point
		Interger.parseInt 와같은 방식으로 [문자를] -> 숫자로(정수, 실수)
		
		String data = sc.nextLint();
		int idata = Integer.parseInt(data);
		
		Integer.parseInt("10000") -> 10000
		Float.parseFloat("3.14") -> 3.14
		
		
        */
		System.out.print("숫자를 입력하세요 : ");
		int number = Integer.parseInt(sc.nextLine()); //nextInt 를 사용하는 것 보다 예외발생을 줄일 수 있다.
		System.out.printf("입력한 숫자는 : %d",number);
	}
	
	/*
	 %d 는 10진수 형식의 정수
	 %f 실수
	 %s 문자열
	 %c 문자
	 \t (탭) ,\n ( 줄바꿈)
	 */
}
