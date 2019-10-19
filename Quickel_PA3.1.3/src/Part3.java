import java.security.SecureRandom;
import java.util.Scanner;

public class Part3 {
	
	public static int num() {
		SecureRandom randGen = new SecureRandom();
		int num = randGen.nextInt(10);
		
		return num;
		
	}
	
	public static int qa(int num1, int num2) {
		
		int answer = num1 * num2;
		
		System.out.println("How much is " + num1 + " times " + num2 + "?");
		
		return answer;
		
	}
	
	public static void correct () {
		SecureRandom randGen = new SecureRandom();
		int response = randGen.nextInt(4);
		
		switch (response) {
		case 0:
			System.out.println("Very good!");
			break;
			
		case 1:
			System.out.println("Excellent!");
			break;
			
		case 2:
			System.out.println("Nice work!");
			break;
			
		case 3:
			System.out.println("Keep up the good work!");
			break;
		}
		
	}
	
	public static void wrong () {
		SecureRandom randGen = new SecureRandom();
		int response = randGen.nextInt(4);
		
		switch (response) {
		case 0:
			System.out.println("No. Please try again.");
			break;
			
		case 1:
			System.out.println("Wrong. Try once more.");
			break;
			
		case 2:
			System.out.println("Don’t give up!");
			break;
			
		case 3:
			System.out.println("No. Keep trying.");
			break;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		// Learn Multiplication

		int guess;
		int num1;
		int num2;
		int answer;
		char  cont = 'y';
		int right = 0;
		double percentage;
		
		while ( cont == 'y' || cont == 'Y') {
			int questions = 1;
			while (questions < 11) {
			
				num1 = num();
				num2 = num();
				
				//prompt with question " How much is (num1) times (num2)?"
				
				answer = qa(num1, num2);
	
				//student inputs answer
				guess = scnr.nextInt();
				
				//checks if input matches answer
				// if wrong, output "No. Please try again.>again", keep trying till correct
				if ( guess != answer) {
					
					wrong();
					//System.out.println ("Please try again.>again");
					//System.out.println();
					//answer = qa(num1, num2);
					//guess = scnr.nextInt();
	
					
				
				}
							
				//if correct, output "Very good!" , then ask another question
				else if (guess == answer) {
					correct();
					right++;
					
				}
				
				System.out.println();
				questions++;
			}
			
			percentage = ((right * 10.0)/100.0) * 100.0;
			
			System.out.println(percentage + "%");
			
			
			if (percentage < 75.0) {
				System.out.println ( "Please ask your teacher for extra help");
			}
			else if (percentage >= 75.0) {
				System.out.println( "Congratulations, you are ready to go to the next level!");
			}
			
			
			System.out.println ( "Reset for next Student? (Y/N)");
			cont = scnr.next().charAt(0);
		
			
		}

	}

}
