package kr.or.kosa.dz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private String accountNo;
	private String name;
	private long balance;
	private List<Transaction> transactions = new ArrayList();
	
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}

	public void deposit(long amount) {
		LocalDateTime now = LocalDateTime.now();
	    DateTimeFormatter dateTrans = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
	    DateTimeFormatter timeTrans = DateTimeFormatter.ofPattern("HH시mm분");
	    String transactionDate = now.format(dateTrans);
	    String transactionTime = now.format(timeTrans);
	    String kind = "예금";
	    balance += amount;
		transactions.add(new Transaction(transactionDate,transactionTime, kind,amount,balance));
		System.out.printf("%d원 입금하셨습니다.\n",amount);
		System.out.printf("현재 계좌의 잔액은 %d원 입니다.\n",balance);
	}
	
	public void withdraw(long amount) {
		
		LocalDateTime now = LocalDateTime.now();
	    DateTimeFormatter dateTrans = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
	    DateTimeFormatter timeTrans = DateTimeFormatter.ofPattern("HH시mm분");
	    String transactionDate = now.format(dateTrans);
	    String transactionTime = now.format(timeTrans);
	    String kind = "예금";
	    balance -= amount;
		transactions.add(new Transaction(transactionDate,transactionTime, "withdraw",amount,balance));
		System.out.printf("%d원 출금하셨습니다.\n",amount);
		System.out.printf("현재 계좌의 잔액은 %d원 입니다.\n",balance);
		
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public long getBalance() {
	
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
				+ transactions + "]";
	}
	

}
