/**
 * 
 */
package labExercises;

import java.util.Random;

/**
 * 
 */
public class Exercise04_GenerateASetOf10RandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generateASetOfTenRandomNumbers();
		

	}

	/**
	 * This method generates 10 random numbers between 1 and 100 (inclusive)
	 */
	
	public static void generateASetOfTenRandomNumbers() {
		
		// Initial Printout
		
		System.out.println("Generating 10 random integers in range 1..100");
		
		// Instantiate Random
		Random rand = new Random();
		
		// Initialise Count
		int count = 0;
		
		// While loop
		while (count < 10) {
		System.out.println("Generated : " + rand.nextInt(1, 101));
		count++;
		}
		
		// Finishing Statement
		System.out.println("Done");
		
	}
}
