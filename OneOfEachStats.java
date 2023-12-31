import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]); // Gets the number of families to simulate
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		int totalChildren = 0; // Counts the total number of children that were generated in the simulation
		int b = 0; // b is a variable that represents the number of families with 2 children
		int c = 0; // c is a variable that represents the number of families with 3 children
		int d = 0; // d is a variable that represents the number of families with 4 children or more
		for (int i = 1; i <= T; i++) {
			int numOfBoys = 0;
			int numOfGirls = 0;
			// Generates new children until the family has at least one child of each gender.
			while (numOfBoys == 0 || numOfGirls == 0) {
				double rnd = generator.nextDouble();
				if (rnd < 0.5){
					numOfBoys ++;
				} else {
					numOfGirls++;
				}
			}
			int numOfChildren = numOfBoys + numOfGirls; // Counts the total number of children that were born in each family
			totalChildren += numOfChildren;
			if (numOfChildren == 2) {
				b++;
			} else if (numOfChildren == 3) {
				c++;
			} else {
				d++;
			}
		}
		double average = (totalChildren/(double) T); // Computes the average number of children to have at least one child of each gender.
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + b);
		System.out.println("Number of families with 3 children: " + c);
		System.out.println("Number of families with 4 or more children: " + d);
		String mostCommon = "2"; // Saves the the most common number of children in a family as a string
		if ((c > b) || (d > b)) {
			if (d > c) {
				mostCommon = "4 or more";
			} else {
				mostCommon = "3";
			}
		}
		System.out.println("The most common number of children is " + mostCommon + ".");
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
