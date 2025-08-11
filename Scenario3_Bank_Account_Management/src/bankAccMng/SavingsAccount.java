package bankAccMng;

public class SavingsAccount extends BankAccount{
	double interestRate;
	public SavingsAccount(String accNo, double balance,double interest) {
		super(accNo, balance);
		interestRate=interest;
	}
	
	@Override
	public double withdraw(double amt) {
		if(balance>=amt) {
			balance-=amt;
		}
		else {
			System.out.println("not sufficient balance!");
		}
		return balance;
		
	}
	@Override
	public double deposit(double amt) {
		balance+=amt;
		return balance;
	}
	public double applyInterest() {
		double interest=interestRate*balance/100;
		return balance+=interest;
	}

}
