/**
 *  Gets a command-line argument (int), and checks if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]); // Gets a given integer 
		String str = n + " is a perfect number since " + n + " = 1";
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0){
				sum += i;
				if (i > 1){
					str += " + " + i;
				}
			}
		}
		// Checks if the given number is perfect, and prints a suitable response
		if ((sum == n) && (n > 0)) {
			System.out.println(str);
		} else {
			System.out.println(n + " is not a perfect number");
		}
	}
}
