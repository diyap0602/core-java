package exceptionhandling;
/**
* Write a Program of Throw in Exception .
* 
* @author Diya
**/
public class CheckAgeEligibility {

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(17);
		} catch(Exception age) {
			System.out.println(age.getMessage());
		} finally {
			System.out.println("You can check your age.");
		}
	}

}