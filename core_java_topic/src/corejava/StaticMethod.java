package corejava;
/**
* Create the Program that show the Static Method and Variable.
* 
* @author Diya
**/
public class StaticMethod {

	static void myMethod() {
		System.out.println("Static method can called without creating object.");
	}

	static {
		myMethod();
		System.out.println("This is static block.");
	}

	static int variable = 30;
	public static void main(String[] args) {
		System.out.println("Static variable can also called without creating object : " + StaticMethod.variable);
	}

}