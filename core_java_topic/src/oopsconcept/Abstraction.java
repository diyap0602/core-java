package oopsconcept;
/**
* Create the Program that show the Abstraction."
* 
* @author Diya
**/
abstract class Flower {

	public abstract void flowerColour();
	public void flowerName() {
		System.out.println("The name of Flower is Lotus");
	}

}

class Lotus extends Flower {

	public void flowerColour() {
		System.out.println("The colour of Flower is Pink.");	
	}

}

public class Abstraction {

	public static void main(String[] args) {
		Lotus lotus = new Lotus();
		lotus.flowerColour();
		lotus.flowerName();
		
	}

}