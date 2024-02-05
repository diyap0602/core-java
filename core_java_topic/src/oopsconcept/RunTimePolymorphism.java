package oopsconcept;
/**
* Write a Program that show the ComplieTime Polymorphism.
* 
* @author Diya
**/
class Car {

	public void carColour() {
		System.out.println("The Car Colour is Black.");
	}

}
class Fortune extends Car {
	public void carColour() {
		super.carColour();
		System.out.println("The Car Colour is Blue.");
	}

}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		Car carInformation = new Fortune();
		carInformation.carColour();
	}
	
}