package collection;

import java.util.*;

/**
 * Write a Program to show the Set List.
 * 
 * @author Diya
 **/
public class Set {

	public static void main(String[] args) {
		LinkedList<String> bikeList = new LinkedList<String>();
		bikeList.add("Royal Enfield");
		bikeList.add("KTM");
		bikeList.add("YamahaR15V4");
		bikeList.add("Bullet");
		bikeList.add("Jawa");
		System.out.println("Bike list is :");
		System.out.println(bikeList);
		System.out.println("After sorting the bike list :");
		Collections.sort(bikeList);
		System.out.println(bikeList);
		System.out.println("Adding the Pulser at first position in the list.");
		bikeList.addFirst("Pulser");
		System.out.println(bikeList);
		System.out.println(bikeList.removeLast());
		System.out.println(bikeList.getFirst());
		System.out.println(bikeList.size());
	}

}