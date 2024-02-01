package corejava;
import java.math.*;
/**
* Create the Program that show the difference between == and .equal()."
* 
* @author Diya
**/
public class OperatorAndFunction {

	public static void main(String[] args) {
		// Create the Integer class.
		Integer number1 = 87;
		Integer number2 = 98;
		System.out.println("The value of number1 = " + number1);
		System.out.println("The value of number2 = " + number2);
		System.out.println("The answer of using .equals() function is : " + number1.equals(number2));
		System.out.print("The answer of using '==' Operator is : ");
		if (number1 == number2) {
			System.out.println("Both number are same.");
		} else {
			System.out.println("Both number are not same.");
		}
		// Using String for perform the operation.
		String firstName = "Amit";
		String secondName = new String("Amit");
		System.out.println("The value of Firstname is : " + firstName);
		System.out.println("The value of Secondname is : " + secondName);
		System.out.println("The answer of using .equals() function is : " + firstName.equals(secondName));
		System.out.print("The answer of using '==' Operator is : ");
		if (firstName == secondName) {
			System.out.println("Both name are same.");
		} else {
			System.out.println("Both name are not same.");
		}
		// Using BigDecimal for perform the operation.
		BigDecimal value1 = new BigDecimal("108.89");
		BigDecimal value2 = new BigDecimal("108.89");
		System.out.println("The value of value1 is : " + value1);
		System.out.println("The value of value2 is : " + value2);
		System.out.println("The answer of using .equals() function is : " + value1.equals(value2));
		System.out.print("The answer of using '==' Operator is : ");
		if (value1 == value2) {
			System.out.println("Both value are same.");
		} else {
			System.out.println("Both value are not same.");
		}
	}

}