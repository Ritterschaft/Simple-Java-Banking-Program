import java.util.Scanner; // import Scanner
public class AccountHolderTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double balance; // declare balance variable as double in main method static,so variables from other fields can access this data. 
		AccountHolder.annualInterestRate = .04;  // declare annualInterestRate from AccountHolder file as 4%
		
		System.out.println("Please enter your initial balance");
		// Error trapping: if initial balance is set negative, then loop will initiate to force user to enter a positive initial balance. 
		while (true) {
			  balance = sc.nextDouble();
			  if (balance < 0)
		           System.out.println("Negative initial balance is not allowed! Please re-enter a positive initial balance!");
			  else 
			     break;
		}
		  		
		AccountHolder bobj = new AccountHolder(balance); // create an new object named bobj  
		
		System.out.println("Please enter a deposit");
		// Error trapping: if deposit balance is set negative, then loop will initiate to force user to enter a positive deposit balance.		
		while (true) {
			  balance = sc.nextDouble();
			  if (balance < 0)
		           System.out.println("Positive deposit balance only!");
			  else 
				  bobj.deposit(balance);
			     break;
		}		
		System.out.println("Please enter a withdraw");
		balance = sc.nextDouble();// pass in the withdraw amount into the constructor  
	  
		 bobj.withdraw(balance); // withdraw method takes on effect after withdraw being passed in 
			 		
		//show ending balance with applied interest 
		bobj.monthlyInterest(balance);
		System.out.printf("Your balance with interest applied is " + "$%.2f",bobj.getBalance());
		
		sc.close(); // scanner closes
		System.exit(0); // program session closes (code 0 means program session runs without any errors)
	}

}
