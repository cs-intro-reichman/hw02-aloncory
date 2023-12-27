/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int n = 0;
		int m = (int) (10 * Math.random()); // Generates the first random integer in the range [0,10)
		do {
			System.out.print(m + " "); // Prints the first random integer
			n = m;
			m = (int) (10 * Math.random());// Generates the next random integer in the range [0,10)
		} while (m >= n); // Checks if the next integer is not less than the last integer that was printed.
	}
}
