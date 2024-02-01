package corejava;
/**
* Write the Program to show the various method of String."
* 
* @author Diya
**/
public class StringMethod {

	public static void main(String[]args) {
		// Using String to perform the different method.
		String firstName = new String("Diya");
		String lastName = new String("Prajapati");
		System.out.println(firstName.concat(" ").concat(lastName));
		System.out.println(firstName.charAt(3));
		System.out.println(firstName.length());
		System.out.println(firstName.equals(lastName));
		System.out.println(lastName.isEmpty());
		System.out.println(lastName.compareTo(firstName));
		System.out.println(lastName.replace('p','a'));
	}

}