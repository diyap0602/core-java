package collection;
import java.util.*;
/**
* Write a Program to remove the duplicate value from the List.
* 
* @author Diya
**/
public class DuplicateValueInString {

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> List) {
		ArrayList<T> listValue = new ArrayList<T>();
		for (T element : List) {
			if (!listValue.contains(element)) {
				listValue.add(element);
			}
		}
		return listValue;
	}

	public static void main (String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "A", "C", "E", "E", "E"));
		System.out.println("The array List is : " + list);
		System.out.println("After remove duplicate value in array List is : " + removeDuplicates(list));
	}

}