package bankAccMng;

public class CheckingAccount extends BankAccount{
	

	double overdraftLimit;
	public CheckingAccount(String accNo, double balance,double odl) {
		
		super(accNo, balance);
		overdraftLimit=odl;
	}
	@Override
	double withdraw(double amt) {
		if(balance+overdraftLimit>=amt) {
			if(amt>balance){
					balance=0;
				}
			else {
				balance-=amt;
			}
			}
		else {
			System.out.println("not sufficient balance!");
		}
		return balance;
	}

	@Override
	double deposit(double amt) {
		balance+=amt;
		return balance;
	}
	
	
	

}
