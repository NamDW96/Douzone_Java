package kr.or.kosa.dz;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private ArrayList<Account> accounts = new ArrayList<>();
	private int totalAccount;
	
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo,name));
		totalAccount++;
	}
	
	public  Account getAccount(String accountNo) {
		
		//for문 accounts List를 돌면서 입력한 accountNo와 같은accountNo를 가진 배열을 출력
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getAccountNo().equals(accountNo)) {
				return accounts.get(i);
			}
		}
		return null;
	}
	
	public List<Account> findAccounts(String name) {
		
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getName().equals(name)) {
				return accounts;
			}
		}
		return null;
	}
	
	
	public List<Account> getAccounts() {
			return accounts;
	}
	
	
	public int getTotalAccount() {
		
		return this.totalAccount;
	}
	
	
	
}
