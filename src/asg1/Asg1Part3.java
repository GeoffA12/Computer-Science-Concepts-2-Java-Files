package asg1;
import java.util.Scanner;
public class Asg1Part3 {
	final static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		//boolean n;
		String message;
		int userChoice;
		System.out.println("Please enter your credit hours: ");
		userChoice = userInput.nextInt();
		userInput.nextLine();
		message = getUniversityClass(userChoice);
		System.out.println(message);
		/*if (n == true) {
			System.out.println("Your input of " + userChoice + " is odd.");
		}
		else {
			System.out.println("Your input of " + userChoice + " is even.");
		}*/
		
		
	}
	
	public static boolean isOdd(int number) {
		if (number % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String getUniversityClass(int creditHours) {
		if (creditHours < 0) {
			return "No Classification";
		}
		else if (creditHours < 30) {
			return "Freshman";
		}
		else if (creditHours < 60) {
			return "Sophomore";
		}
		else if (creditHours < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}
}
