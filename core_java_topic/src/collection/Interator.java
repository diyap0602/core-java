package collection;
import java.util.ArrayList;
import java.util.Iterator;
/**
* Write a Program to add String values using Interator.
* 
* @author Diya
**/
public class Interator {

	public static void main (String[] args) {
		ArrayList<String> message = new ArrayList<String>();
		message.add("Hello");
		message.add("World");
		message.add("Diya");
		Iterator<String> iterator = message.iterator();
		while (iterator.hasNext()) {
			String newMessage = iterator.next();
			System.out.println(newMessage);
		}
		System.out.println(message.size());
	}

}