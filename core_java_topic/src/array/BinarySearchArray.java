package array;
import java.util.Scanner;
import java.util.Arrays;
/**
* Write a Program to find the Index of an element with Binary Search.
* 
* @author Diya
**/
public class BinarySearchArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("The array element are : " +(Arrays.toString(numberList)));
		System.out.println("Enter the element : ");
		int findElement = scanner.nextInt();
		int index = findIndex(numberList, findElement);

		if (index != -1) {
			System.out.println("The element " + findElement + " is at index " + index + " in the array.");
		} else {
			System.out.println("The element " + findElement + " is not in the array.");
		}
		scanner.close();
	}

	public static int findIndex(int[] array, int element) {
		int index = Arrays.binarySearch(array, element);
		return (index < 0) ? -1 : index;
	}

}