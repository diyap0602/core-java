package array;
import java.util.Scanner;
import java.util.Arrays;
/**
* Write a Program to find the Index of an element.
* 
* @author Diya
**/
public class LinearSearchArray{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("The array element are : " +(Arrays.toString(myArray)));
		System.out.println("Enter the element : ");
		int findElement = scanner.nextInt();
		int index= findIndex(myArray, findElement);

		if (index != -1) {
			System.out.println("The element " + findElement + " is at index " + index + " in the array.");
		} else {
			System.out.println("The element " + findElement + " is not in the array.");
		}
		scanner.close();
	}

	public static int findIndex(int[] array, int element) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == element) {
				return index;
			}
		}
		return -1;
	}

}