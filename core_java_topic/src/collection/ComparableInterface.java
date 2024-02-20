package collection;
import java.util.*;
/**
* Write a Program to show Comparable.
* 
* @author Diya
**/
class Bikes implements Comparable<Bikes> {
	String bikeName;
	int bikePrice;

	Bikes(String bikeName, int bikePrice) {
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
	}

	public int compareTo(Bikes bikeDetails) {
		if (bikePrice > bikeDetails.bikePrice)
			return 1;
		else
			return -1;
	}
}
public class ComparableInterface {

	public static void main(String[] args) {
		ArrayList<Bikes> bikeList = new ArrayList<>();
		bikeList.add(new Bikes("Yamaha MT 15", 167000));
		bikeList.add(new Bikes("Royal Enfield Classic 350", 193000));
		bikeList.add(new Bikes("Hero Splender", 75141));
		bikeList.add(new Bikes("Hero Xtrem 125R", 95000));
		Collections.sort(bikeList);
		System.out.println("Bike names : it's price");
		for (Bikes bikeDetails : bikeList) {
			System.out.println(bikeDetails.bikeName + " : " + bikeDetails.bikePrice);
		}
	}

}