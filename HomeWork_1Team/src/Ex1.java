import java.util.Scanner;

import kr.or.kosa.Drink;
import kr.or.kosa.VendingMachine;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int secondChoice = 0;

		VendingMachine vm = new VendingMachine();
		Drink drink = new Drink();
		Drink cola = new Drink(1,"콜라",1100);
		Drink water = new Drink(2,"물",500);
		Drink fanta = new Drink(3,"환타",1000);
		Drink cider = new Drink(4,"사이다",900);
		Drink coffee = new Drink(5,"커피",600);
		
		while (cola.getDrinkCnt()!=0 && fanta.getDrinkCnt()!=0 && water.getDrinkCnt()!=0 && cider.getDrinkCnt()!=0 && coffee.getDrinkCnt()!=0 ) {
			
			do {
				System.out.println("******* 무엇을 하시겠습니까? *******");
				System.out.println("**** 1.금액투입   2.메뉴선택   ****");
				System.out.println("**** 3.잔돈확인   4.잔돈반환   ****");
				System.out.println("*******************************");
				secondChoice = Integer.parseInt(sc.nextLine());
				switch (secondChoice) {

				case 1:
					System.out.println("투입할 금액 입력 | 취소:0");
					while (true) {
						int input = Integer.parseInt(sc.nextLine());
						if (input == 0)
							break;
						vm.setInputMoney(input);
						System.out.printf("현재 투입금액 : %d\n", vm.getInputMoney());
					}
					break;
					
				case 2: 
					System.out.println("원하시는 메뉴를 선택하세요");
					cola.drinkInfo();
					water.drinkInfo();
					fanta.drinkInfo();
					cider.drinkInfo();
					coffee.drinkInfo();
					int choiceDrink = Integer.parseInt(sc.nextLine());
					switch(choiceDrink) {
					case 1 : cola.priceCompare();
							 break;
					case 2 : water.priceCompare();
							 break;
					case 3 : fanta.priceCompare();
							 break;
					case 4 : cider.priceCompare();
							 break;
					case 5 : coffee.priceCompare();
							 break;
					default : System.out.println("잘못 누르셨습니다.");
					}
					break;	
				case 3:
					System.out.printf("잔액 : %d\n\n",vm.getInputMoney());
					break;
				case 4:
					break;
				default:
					System.out.println("");
				}

			} while (secondChoice != 4);
			System.out.printf("잔돈 %d원을 반환하고 종료합니다.\n\n\n", vm.getInputMoney());
			vm.set2InputMoney(0); 
		}

	}
}