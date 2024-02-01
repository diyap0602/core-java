package corejava;
/**
* Write Program to Compare the variables using Wrapper class"
* 
* @author Diya
**/
public class CompareVariable {

	public static void main(String[] args) {
		// Define the integer class and denotes variable1 and variable2 as object.
		Integer value1 = 50;
		Integer value2 = 90;
		System.out.println("variable1: " + value1);
		System.out.println("variable2: " + value2);
		System.out.println("The answer of using '==' oprerator: "+ (value1 == value2));
		System.out.println("The answer of using .equals() function: " +value1.equals(value2));
	}

}