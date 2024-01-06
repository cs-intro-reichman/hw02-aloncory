/**
 *  Gets a command-line argument (int), and checks if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		/*
  			#feedback:
     			Seems like in the string you buidling, you insert "1" as default.
			Then in the for loop you got confused and use bad if inside it to handle this async behavior.
   			If you choose to use "1" as default (which is not wrong) you could set the rest of variable to skip it.
		*/
		int n = Integer.parseInt(args[0]); // Gets a given integer 
		String str = n + " is a perfect number since " + n + " = 1";
		int sum = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0){
				sum += i;
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
