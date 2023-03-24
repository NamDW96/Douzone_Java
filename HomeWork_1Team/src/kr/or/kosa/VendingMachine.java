package kr.or.kosa;

public class VendingMachine {
	private static int inputMoney; 	// 소비자가 투입한 금액
	/*
	private static int totalBalance;   // 기계가 가지고 있는 금액
	
	public int getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(int totalBalance) {
		this.totalBalance = totalBalance;
	}*/
	

	public int getInputMoney() {
		return inputMoney;
	}
	public void setInputMoney(int inputMoney) {
		this.inputMoney += inputMoney;
	}
	
	public void set2InputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	
}
//음료의 종류 확인 몬함...