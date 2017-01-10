package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
//	public int getAccontNo(int accountNo) {
//		return accountNo;
//	}
//
//	public void setAccountNo(int accountNo) {
//		this.accountNo = accountNo;
//	}
	public int save( int accountNo ) {
		balance += accountNo;
		System.out.println(balance + "만원이 입금되었습니다");
		return balance;
	}
	public int deposit( int money ) {
		if(balance<0){
			System.out.println("출금할수없습니다.");
			return 0;
		} else {
		balance -= money;
		System.out.println(money + "만원이 출금되었습니다");
		return balance;
		}
	}
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + "가 신설되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
