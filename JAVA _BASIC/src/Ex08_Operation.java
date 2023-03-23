import java.util.Scanner;

public class Ex08_Operation {
	public static void main(String[] args) {
		
		
		int result = 0;
		
		//첫번째 숫자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 숫자를 입력하세요: ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		// 두번째 숫자 입력받기
		System.out.print("두 번쨰 숫자를 입력하세요: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		//원하는 연산식 입력받기
		System.out.println("원하는 연산을 입력하세요 : 예시) +, - ,*, /");
		String cal =sc.nextLine();
		/*
		switch(cal) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "*" : result = num1 * num2; break;
		case "/" : result = num1 / num2; break;
		default : System.out.println("잘못 입력하셨습니다.");
		} //올바르지않은 연산자가 입력되었을때 처리
		*/
		if(cal.equals("+")) {
			result = num1 + num2;
		}
		else if(cal.equals("-")) {
			result = num1 - num2;
		}
		else if (cal.equals("*")) {
			result = num1 * num2;
		}
		else if (cal.equals("/")) {
			result = num1 /num2;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		//System.out.println("결과값 : "+result);
		//System.out.println("계산 결과는 : "+result);
		if(result !=0) { //올바르지않은 연산자가 입력되었을때 처리ㅇ
		System.out.printf("계산 결과 : %d %s %d = %d",num1,cal,num2,result);
		}
		
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// 문자열의 비교는 == 쓰지마라!
		// String은 엄밀히 따지면 주소값이기에 문자열 비교는 ==쓰지말고 equals 사용.
		// String 클래스 별도 학습할 때 이유를 알게됨.
	}
}
