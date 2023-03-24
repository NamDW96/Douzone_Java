package kr.or.kosa;

public class Drink {
	private int drinkNum;
	private String drinkName;
	private int drinkCnt; 
	private int drinkPrice;
	VendingMachine vm = new VendingMachine();
	public Drink() {
		// ex1에서 drink.priceCompare를 실행해보기 위해서 작성
	}
	
	public Drink(int drinkNum, String drinkName,int drinkPrice) {
		this(drinkNum, drinkName,10,drinkPrice);
	}

	public Drink(int drinkNum, String drinkName, int drinkCnt, int drinkPrice) {
		this.drinkNum = drinkNum;
		this.drinkName = drinkName;
		this.drinkCnt = drinkCnt;
		this.drinkPrice = drinkPrice;
	}
	public int getDrinkCnt() {
		return this.drinkCnt;
	}
	
	public void priceCompare() {
//		this.drinkNum = drinkNum;
//		this.drinkPrice = drinkPrice;
//		this.drinkName = drinkName;
//		this.drinkCnt =drinkCnt;
		if(this.drinkCnt ==0) {
			System.out.println("재고가 부족합니다.");
		}
			
		else {
		//System.out.printf("%d. 상품명 : [%s] , 남은 수량 : [%d], 가격 : [%d]\n",drinkNum, drinkName,drinkCnt,drinkPrice);
			if(vm.getInputMoney() >= this.drinkPrice) {
				this.drinkCnt--;
				vm.set2InputMoney(vm.getInputMoney()-this.drinkPrice);
				System.out.printf("[%s]의구매가 완료되었습니다.\n",this.drinkName);
			}
			else {
				System.out.println("잔액부족");
			}
		}
	}
	
	public void drinkInfo() {
		System.out.printf("%d. 상품명 : [%s] , 남은 수량 : [%d], 가격 : [%d]\n",drinkNum, drinkName,drinkCnt,drinkPrice);
	}

	public static void main(String[] args) {
		
	
	}
}
// 음료의 이름과 정보를 가져올 때 배열이 필요할 것 같다.