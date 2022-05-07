import java.util.Scanner;
public class AccountHolder {

	// data members
	private double balance;
	static double annualInterestRate = 0.04;;
	
	// starter constructor
	public AccountHolder(double bal) {
		if (bal < 0) // check for negative value
		return; // if a negative value appears, return that value 
		else balance = bal;
//		System.out.print("ini-deposit step"+balance+"");
	}
	
	//deposit method
	public void deposit(double bal) {
		balance += bal;
//		System.out.print("deposit step"+balance+"");
	}
	
	//withdraw method
	public void withdraw(double bal) {
		// verify current balance and bal argument that passed in 
		// balance should not drop below $50		
			while(balance - bal < 50) {
				System.out.println("Limit account balance exceeded:$ 50. Please try another withdraw");			
				Scanner sc = new Scanner(System.in);
				bal = sc.nextDouble();	
				sc.close();
			}
			balance -= bal;		
	}
	
	// get balance method
	public double getBalance() { // Note: before this method executes, the balance value was in the balance field. It was invisible to the bobj instance. 
		return balance;			// In order to let bobj instance gets to access the balance value, a value-return method is needed to perform this task. 
	}
	
	//create a monthlyInterest method
	public void monthlyInterest (double bal) {
		balance += balance*(annualInterestRate / 12.0);
	}	
}
// note: bal in this file is a parameter, it will be called by an argument named balance from AccountHolderTest file.