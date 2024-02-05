package oopsconcept;
/**
* Write a Program that show the ComplieTime Polymorphism.
* 
* @author Diya
**/
class Math {

	public void sum() {
		int value1 = 12;
		int value2 = 15;
		int sum = value1 + value2;
		System.out.println(sum);
	}

	public void sum(int value1, int value2) {
		int sum = value1+ value2;
		System.out.println(sum);
	}

	public void sum(int price1, double price2) {
		double sum = price1 + price2;
		System.out.println(sum);
	}

}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Math operation = new Math();
		operation.sum();
		operation.sum(34, 23);
		operation.sum(13, 45.9);
	}

}