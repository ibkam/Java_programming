package ibkamcodes;
//Java program that computes means from give inputs
//Implements Scanner class

import java.util.Scanner;

public class ComputesMeans {
	//instance variables 
	 static int sum = 0, count = 0;
	 static double mean = 0;
	 
	public static void main(String[] args) {
		System.out.println("Please enter the numbers: ");
		Scanner scan = new Scanner(System.in);
		
		// Create an instance of the ComputesMeans class
		ComputesMeans meansCalculator = new ComputesMeans();
		
		// Call the calculate means method passing the scanner as a parameter
		meansCalculator.calculatemeans(scan);
	}
	
	void calculatemeans(Scanner scan) {
		while (scan.hasNextInt()) {
			int num = scan.nextInt();
			sum += num;
			count++;
			mean = (double) sum / count;
			System.out.println("Sum: " + sum + " Count: " + count + " Mean: " + mean);
		}
	}
}
