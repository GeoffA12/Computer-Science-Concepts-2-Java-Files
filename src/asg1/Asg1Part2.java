package asg1;

public class Asg1Part2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1; x < 101; x++) {
			sum += x;
		}
		System.out.println("Here is the sum from 1-100: " + sum);
		int sum2 = 0;
		for (int i = 1; i < 2001; i++) {
			if (i % 13 == 0) {
				sum2 += i;
			}
		}
		
		System.out.println("Here is the sum of integers from 1-2000 that are evenly divisible by 13: " + sum2);
		
		int sumOfSquares = 0;
		for (int s = 1; s < 51; s++) {
			sumOfSquares += (s*s);
		}
		System.out.println("Here is the sum of squares from 1 to 50: " + sumOfSquares);
		
	}

}
