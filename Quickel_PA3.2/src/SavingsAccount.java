

public class SavingsAccount {
	private double savingsBalance;
	private static double annualInterestRate; 
	
	public void setBalance ( double balance) {
		savingsBalance = balance;
	}
	
	public void setRate (double rate) {
		annualInterestRate = rate/100.0;
	}
	
	public void calculateMonthlyInterest() {
		double newBalance = savingsBalance * (annualInterestRate/12);
		savingsBalance += newBalance;
		
		
		
	}
	
	public void print() {
		
		System.out.println("New Balance: $" + savingsBalance);
		
	}
	
	public static void modifyInterestRate(double newRate) {
		
		annualInterestRate = newRate/100.0;
		
	}

}
