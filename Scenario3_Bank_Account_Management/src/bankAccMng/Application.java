package bankAccMng;

import java.util.List;
import java.util.ArrayList;

public class Application{
	public static void main(String[] args) {
		List<BankAccount> accounts=new ArrayList<BankAccount>();
		accounts.add(new SavingsAccount("1341BAI", 60000, 12));
		accounts.add(new CheckingAccount("21BAI1215", 60000, 15000));
		System.out.println("New Balance after withdraw: "+accounts.get(0).withdraw(70000));
		System.out.println("New Balance after Deposit: "+accounts.get(0).deposit(10000));
		System.out.println("New Balance after Interest: "+((SavingsAccount) accounts.get(0)).applyInterest());
		System.out.println("New Balance after withdraw: "+accounts.get(1).withdraw(70000));
		System.out.println("New Balance after Deposit: "+accounts.get(1).deposit(10000));
		
	}

}
