package collection;
import java.util.*;

/**
* Write a Program to show Comparator.
* 
* @author Diya
**/
public class ComparatorInterface {

	public static void main (String[] args) {
		Comparator<Integer> compare = new Comparator<Integer>() {
			public int compare(Integer startInteger, Integer nextInteger) {
				if(startInteger % 10 > nextInteger % 10)
					return 1;
				else
					return -1;
			}
		};

		List<Integer> numberList = new ArrayList<>();
		numberList.add(545);
		numberList.add(286);
		numberList.add(792);
		numberList.add(573);
		numberList.add(166);
		System.out.println("Array list is :");
		System.out.println(numberList);
		System.out.println("After sorting the list in ascending order of last digit of each element.");
		Collections.sort(numberList, compare);
		System.out.println(numberList);
	}

}