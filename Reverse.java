/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0]; // Gets a string to reverse
		int n = str.length(); 
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)); // Prints the string backward
		}
		System.out.println(); // Prints a new line
		System.out.println("The middle character is " + str.charAt((n - 1) / 2)); // Prints the middle character.
	}
}
