package corejava;
/**
* Perform the math formula using constructor.
* 
* @author Diya
**/
public class Constructor {

	public Constructor (int value1, int value2) {
		System.out.println("The sum of both number : " + (value1 + value2));
	}

	// Start the main method. 
	public static void main(String[] args) {
		new Constructor(15, 5);
	}

}