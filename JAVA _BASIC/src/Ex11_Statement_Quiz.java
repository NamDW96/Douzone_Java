import java.util.Scanner;

public class Ex11_Statement_Quiz {
	public static void main(String[] args) {
		//메뉴를 보여주고 사용자에게 선택하도록 하는
		//원하시는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여줌.
		
		//1.예금 2.출금 3.잔고조회 4.종료
		
		//잔액 변수를 생성 (balance)
		// 예금 처리 + 누적
		// 출금 처리 - 누적
		// 잔고 balance 출력
		// 종료 (함수의 종료or 프로그램의 종료)
		Scanner sc = new Scanner(System.in);
		int check =0;
		int balance = 0;
		do {
			System.out.println("원하시는 메뉴의 번호를 입력해주세요\n1.예금 2.출금 3.잔고조회 4.종료");
			check = Integer.parseInt(sc.nextLine());
			switch(check) {
				case 1 : System.out.println("입금하실 금액을 입력하세요");
						int inputmoney = Integer.parseInt(sc.nextLine());
						balance += inputmoney;
						System.out.printf("입금 후 잔액은 %d원 입니다\n",balance);
						break;
				case 2 :
						System.out.println("출금하실 금액을 입력하세요");
						int outputmoney = Integer.parseInt(sc.nextLine());
					    if(balance < outputmoney) {
					    	System.out.println("잔액이 부족합니다.");
					    } else {
						balance -= outputmoney;
						System.out.printf("출금 후 잔액은 %d원 입니다\n",balance);
					    } break;
				case 3 : System.out.println("잔액 : "+balance);
						  break;
				case 4 : break;
				default : System.out.println("잘못된 입력입니다. 다시 입력해주십시오"); 
			}
		} while (check !=4); 
			
		

	}
}
