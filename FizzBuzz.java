package ibkamcodes;
// FizzBuzz program of 1 to 100
// implement if-else statement

public class FizzBuzz {
	static int num;
	public static void main(String[] args) {
		System.out.println("FizzBuzz of 1 to 100");
		System.out.println("---------------------");

		//new instance of the class
		FizzBuzz NewFizzBuzz = new FizzBuzz();
		
		NewFizzBuzz.computesFizzBuzz();
		
	}
	// method to compute FizzBuzz
	void computesFizzBuzz() {
		for (num = 1 ; num <= 100; num++) {

			//if number is a modulas of 3 & 5
			if (num % 5 == 0 && num % 3 == 0) {
				System.out.print("FizzBuzz, ");
			}
			else if (num % 5 == 0) {
				System.out.print("Fizz, ");
			}
			else if ( num % 3 == 0) {
				System.out.print("Buzz, ");
			}
			else {
				System.out.print(num +", ");
			}
		}
	}
}
