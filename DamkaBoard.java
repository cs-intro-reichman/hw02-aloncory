/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); // Gets the size of board to print
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				System.out.print(" "); // Prints a backspace
			}
			for (int j = 0; j < n; j++) {
				System.out.print("* "); // Prints n times in row the string "* "
			}
			System.out.println(); // Skips to the next line
		}
	}
}
