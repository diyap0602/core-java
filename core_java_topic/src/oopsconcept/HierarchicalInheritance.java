package oopsconcept;
/**
* Write a Program that show the Hierarchical Inheritance.
* 
* @author Diya
**/
class FlowerDetails {

	String flowerName;
	public void flowerName() {
		System.out.println("The name of Flower is. :");
	}

}

class SunFlower extends FlowerDetails {

	String flowerColour;
	public void firstFlowerDetail() {
		flowerName = "SunFlower";
		System.out.println(flowerName);
		System.out.println("SunFlower is yellow.");
	}
}

class Rose extends FlowerDetails {

	String flowerColour;
	public void secondFlowerDetail() {
		flowerName = "Rose";
		System.out.println(flowerName);
		System.out.println("Rose is Red.");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Rose myFlower = new Rose();
		SunFlower yourFlower = new SunFlower();
		myFlower.flowerName();
		myFlower.secondFlowerDetail();
		yourFlower.flowerName();
		yourFlower.firstFlowerDetail();
	}

}
