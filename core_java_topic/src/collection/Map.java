package collection;
import java.util.*;
import java.util.Map.Entry;
/**
* Write a Program to show the Map List.
* 
* @author Diya
**/
public class Map {

	public static void main (String[] args) {
		HashMap<String, String> countryCapitalName = new HashMap<String, String>();
		countryCapitalName.put("India", "New Delhi");
		countryCapitalName.put("China", "Beijing");
		countryCapitalName.put("Myanmar", "Rangoon");
		countryCapitalName.put("USA", "Washington");
		countryCapitalName.put("Greece", "Athens");
		countryCapitalName.put("Canada", "Ottawa");
		countryCapitalName.put("Russia", "Moscow");
		countryCapitalName.put("Bhutan", "Thimpu");
		countryCapitalName.put("Turky", "Ankara");
		for(Entry<String, String> country : countryCapitalName.entrySet()) {
			System.out.println(country.getValue() + " is a Capital of " + country.getKey());
		}
		System.out.println(countryCapitalName.get("Turky"));
		System.out.println("Is Nepal is present in country list? " + (countryCapitalName.containsKey("nepal") ? "Yes" : "No"));
		countryCapitalName.remove("Bhutan", "Thimpu");
		System.out.println(countryCapitalName);
	}

}