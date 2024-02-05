package oopsconcept;
/**
* Write a Program using Interface.
* 
* @author Diya
**/
interface Fruits {

	public void fruitColour();
	public void fruitTaste();

}

class Mango implements Fruits {

	public void fruitColour() {
		System.out.println("The colour of Fruit is Yellow.");
	}

	public void fruitTaste() {
		System.out.println("The Taste of Fruit is Sweet.");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Mango mango = new Mango();
		mango.fruitColour();
		mango.fruitTaste();
	}

}