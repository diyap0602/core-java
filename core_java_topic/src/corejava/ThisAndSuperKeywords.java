package corejava;
/**
* Write a Program that show the This and Super Method.
* 
* @author Diya
**/
class Company {

	String firstName = "Diya";
	String lastName = "Prajapati";

	public void userDetails(String name, String surName) {
		name = this.firstName;
		surName = this.lastName;
		System.out.println(name);
		System.out.println(surName);
	}

	public void companyType() {
		System.out.println("This is an IT company.");
	}

}

// Create the Sub class as Intern
class Intern extends Company {

	public void jobType() {
		super.companyType();
		System.out.println("Diya is intern in this company.");
	}

}

public class ThisAndSuperKeywords {

	public static void main(String[] args) {
		Intern intern = new Intern();
		intern.userDetails(null, null);
		intern.companyType();
		intern.jobType();
	}

}