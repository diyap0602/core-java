package exceptionhandling;
/**
* Write a Program of Throw in Exception .
* 
* @author Diya
**/
public class IsDivisableByZero {

	static void div (int value1, int value2) throws ArithmeticException {
		float division = value1 / value2;
		System.out.println("Division is : " + division);
	}

	public static void main(String[] args) {
		try {
			div(15,0);
		} catch (Exception message) {
			message.printStackTrace();
		}
	}

}