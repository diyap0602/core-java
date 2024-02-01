package corejava;
/**
* This is a Program that show the skip the number and break the number.
* 
* @author Diya
**/
public class BreakAndContinueStatement {

	public static void main(String[] args) {
		// Using for loop and declare number that for perform task.
		for (int number = 1; number <= 10; number++) {
			if(number == 3) {
				continue;
			} else if(number > 7) {
				break;
			}
			System.out.println(number);
		}
	}

}