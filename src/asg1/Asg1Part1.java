package asg1;
import java.util.Scanner;
public class Asg1Part1 {
	final static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//final Scanner userInput = new Scanner(System.in);
		int age; double gpa; String homeTown;
		
		System.out.println("Please enter your age: ");
		age = userInput.nextInt();	
		userInput.nextLine();
		if (age >= 18) {
			System.out.println("You're old enough to vote.");
		}
		else {
			System.out.println("You're not old enough to vote.");
		}
		
		if (age >= 35) {
			System.out.println("You're old enough to be the president.");
		}
		else {
			System.out.println("You're not old enough to be the president.");
		}
		
		if (age >= 65) {
			System.out.println("You're old enough to receive medical benefits.");
		}
		else {
			System.out.println("You're not old enough to receive medical benefits.");
		}
		
		if (age >= 16 && age <= 25) {
			System.out.println("You're paying extra for car insurance.");
		}
		else {
			System.out.println("You're not paying for extra car insurance.");
		}
		
		System.out.println("Please enter your gpa: ");
		gpa = userInput.nextDouble();
		userInput.nextLine();
		if (gpa < 0.0 || gpa > 4.0) {
			System.out.println("Error. Your gpa input wasn't valid.");
		}
		else {
			if (gpa >= 3.25) {
				System.out.println("You're eligible for the Dean's List.");
			}
			else {
				System.out.println("You're not eligible for the Dean's List.");
			}
			
			if (gpa < 2.0) {
				System.out.println("You are under probationary status.");
			}
			else {
				System.out.println("You aren't under probationary status.");
			}
			
			if (gpa >= 2.5) {
				System.out.println("Your gpa is satisfactory.");
			}
			else {
				System.out.println("Your gpa isn't satisfactory.");
			}
		}
		System.out.println("Please enter your hometown: ");
		homeTown = userInput.nextLine();
		
		System.out.println("Welcome! Your home town is: " + homeTown);
		String upperTown = homeTown.toUpperCase();
		System.out.println(upperTown);
		int len = homeTown.length();
		System.out.println("Here are the number of characters in your home town: " + len);
		
	}

}
