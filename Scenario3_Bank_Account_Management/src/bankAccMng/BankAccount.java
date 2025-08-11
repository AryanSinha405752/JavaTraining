package bankAccMng;

abstract class BankAccount {
	String accNo;
	double balance;
	public BankAccount(String accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	abstract double deposit(double amt) ;
	abstract double withdraw(double amt) ;
}
