import java.security.SecureRandom;
import java.util.Scanner;

public class Part5 {
	
	public static int num(int difficulty) {
		SecureRandom randGen = new SecureRandom();
		int num = 0;
		
		switch (difficulty) {
			case 1:
				num = randGen.nextInt(10);
				break;
			case 2:
				num = randGen.nextInt(89)+10;
				break;
		
			case 3:
				num = randGen.nextInt(900)+100;
				break;
		
			case 4:
				num = randGen.nextInt(9000)+ 1000;
				break;
		}
		
		return num;
		
	}
	
	public static int qa(int num1, int num2, int choice) {
		
		int answer = 0;
		
		switch (choice) {
		case 1:
			answer = num1 + num2;
			
			System.out.println("How much is " + num1 + " plus " + num2 + "?");
			return answer;
		case 2:
			answer = num1 * num2;
			
			System.out.println("How much is " + num1 + " times " + num2 + "?");
			return answer;
		case 3:
			answer = num1 - num2;
			
			System.out.println("How much is " + num1 + " minus " + num2 + "?");
			return answer;
		case 4:
			answer = num1 / num2;
			
			System.out.println("How much is " + num1 + " divided by " + num2 + "?");
			return answer;
		case 5:
			SecureRandom randGen = new SecureRandom();
			int problem = randGen.nextInt(4) + 1;
			
			switch (problem) {
			case 1:
				answer = num1 + num2;
				
				System.out.println("How much is " + num1 + " plus " + num2 + "?");
				return answer;
			case 2:
				answer = num1 * num2;
				
				System.out.println("How much is " + num1 + " times " + num2 + "?");
				return answer;
			case 3:
				answer = num1 - num2;
				
				System.out.println("How much is " + num1 + " minus " + num2 + "?");
				return answer;
			case 4:
				answer = num1 / num2;
				System.out.println("How much is " + num1 + " divided by " + num2 + "?");
				return answer;
				
			}
			
			break;
		}
		
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
		double percentage;
		int difficulty;
		int choice;
		
		while ( cont == 'y' || cont == 'Y') {
			int questions = 1;
			int right = 0;
			
			System.out.println("1: Addition");
			System.out.println("2: Multiplication");
			System.out.println("3: Subtraction");
			System.out.println("4: Division");
			System.out.println("5: Combonation of all four");
			System.out.print("Please choose a type of arithmetic problem to study: ");
			choice = scnr.nextInt();
			System.out.println();
			
			System.out.print("Please enter difficulty from 1 to 4: ");
			difficulty = scnr.nextInt();
			
			while (questions < 11) {
			
				num1 = num(difficulty);
				num2 = num(difficulty);
				
				//prompt with question " How much is (num1) times (num2)?"
				
				answer = qa(num1, num2, choice);
	
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
