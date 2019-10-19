public class Application {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setBalance(2000.00);
		saver1.setRate(4);
		
		saver2.setBalance(3000.00);
		saver2.setRate(4);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		saver1.print();
		saver2.print();
		System.out.println();
		
		saver1.setRate(5);
		saver2.setRate(5);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		saver1.print();
		saver2.print();

	}

}
