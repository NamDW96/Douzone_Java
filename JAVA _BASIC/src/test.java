import java.util.Scanner;

public class test {
 public static void main(String[] args) {

	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.print(">입력값: ");
	 		int anumber = Integer.parseInt(sc.nextLine());
	 		System.out.print(">입력값(기호): ");
	 		String op = sc.nextLine();
	 		System.out.print(">입력값: ");
	 		int bnumber = Integer.parseInt(sc.nextLine());
	 		
	 		int result = 0;
	 		
	 		if (op.equals("+")) {
	 			result = anumber + bnumber;
	 		}else if (op.equals("-")) {
	 			result = anumber - bnumber;
	 		}else if (op.equals("*")) {
	 			result = anumber * bnumber;
	 		}else if (op.equals("/")) {
	 			result = anumber / bnumber;
	 		}else 
	 			System.out.println("올바른 연산자가 아닙니다.");
	 		
	 		System.out.printf("연산결과 : %d\n", result);
	 		System.out.println("---------------------");
	 		
	 	}

	 
 }

