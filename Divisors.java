/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]); // Gets a given integer 
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i); // Prints all the divisors of the given number.
			}
		}
	}
}
