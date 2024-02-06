package exceptionhandling;
import java.io.*;
/**
* Write a Program of Exception Handling.
* 
* @author Diya
**/
class FirstException {

	void exceptionMethod() throws IOException {
		throw new IOException("Error occured.");
	}

}
public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			FirstException exceptionHandle = new FirstException();
			exceptionHandle.exceptionMethod();
		} catch(Exception e) {
			System.out.println("Exception Handled.");
		} finally {
			System.out.println("This block always executable.");
		}
	}

}