package corejava;
import java.util.Scanner;
/**
* Check that you are eligible for voting or not.
* 
* @author Diya
**/
public class ConditionalStatement {

	public static void main(String[] args) {
		// Define the Scanner and create the object for getting the input.
		Scanner condition = new Scanner(System.in); 
		System.out.println("Give your age:");
		int yourage = condition.nextInt();
		// Check the condition that you are eligible for voting or not.
		if (yourage > 18) {
			System.out.println("You are eligible for voting.");
		} else {
			System.out.println("You are not eligible for voting.");
		}
		condition.close();
	}

}