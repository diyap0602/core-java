package corejava;
import java.util.Scanner;
/**
* Perform the pattern program
* 
* @author Diya
**/
public class PatternProgram {

	public static void main(String[] args) {
		// Define the Scanner and create the pattern-object for getting the number of pattern.
		Scanner pattern = new Scanner(System.in);
		System.out.println("Give your no:");
		int number = pattern.nextInt();
		// Check the no and follow the loop.
		for (int row=1; row<=number; row++) {
			for (int column=1; column<=row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		pattern.close();
	}

}