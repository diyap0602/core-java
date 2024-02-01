package corejava;
/**
* Using do-while loop for print the 1 to 10 numbers.
* 
* @author Diya
**/
public class DoWhileLoop {

	public static void main(String[] args) {
		// Initialize the start number.
		int startNumber = 1;
		// Perform the first mandatory condition.
		do {
			System.out.println(startNumber);
			startNumber++;
		} while (startNumber <= 10);
	}

}