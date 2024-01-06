/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		// #Feedback: use meaningful names
		int last = 0;
		int next = (int) (10 * Math.random()); // Generates the first random integer in the range [0,10)
		do {
			System.out.print(next + " "); // Prints the first random integer
			last = next;
			next = (int) (10 * Math.random());// Generates the next random integer in the range [0,10)
		} while (next >= last); // Checks if the next integer is not less than the last integer that was printed.
	}
}
