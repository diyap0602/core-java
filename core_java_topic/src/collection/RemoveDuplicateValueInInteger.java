package collection;
import java.util.*;
/**
* Write a Program to remove the duplicate value from the List.
* 
* @author Diya
**/
public class RemoveDuplicateValueInInteger {

	public static <elementList> ArrayList<elementList> removeDuplicates(ArrayList<elementList> List) {
		ArrayList<elementList> listValue = new ArrayList<elementList>();
		for (elementList element : List) {
			if (!listValue.contains(element)) {
				listValue.add(element);
			}
		}
		return listValue;
	}

	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,5,7,5,3,11,23,43,1));
		System.out.println("The array List is : " + list); 
		System.out.println("After remove duplicate value in array List is : " + removeDuplicates(list));
	}

}