package oopsconcept;

import java.util.Scanner;

/**
 * Write a Program that show the MultiLevel Inheritance.
 * 
 * @author Diya
 **/
class UserDetails {

	String userName;

	public String getuserName() {
		return userName;
	}

	public void setuserName(String name) {
		this.userName = name;
	}

	int userAge;

	public int getuserAge() {
		return userAge;
	}

	public void setuserAge(int userAge) {
		this.userAge = userAge;
	}

}

class LoanDetails extends UserDetails {

	int loanNumber;

	public int getloanNumber() {
		return loanNumber;
	}

	public void setloanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	float loanAmount;

	public float getloanAmount() {
		return loanAmount;
	}

	public void setloanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

}

class ManagerDetails extends LoanDetails {

	String managerName;

	public String getmanagerName() {
		return managerName;
	}

	public void setmanagerName(String managerName) {
		this.managerName = managerName;
	}

}

class MultiLevelInheritance {

	public static void main(String[] args) {
		ManagerDetails userData = new ManagerDetails();
		Scanner userInformation = new Scanner(System.in);
		System.out.println("Enter the user name : ");
		userData.setuserName(userInformation.next());
		System.out.println("Enter the userAge. : ");
		userData.setuserAge(userInformation.nextInt());
		System.out.println("Enter the loanNumber. : ");
		userData.setloanNumber(userInformation.nextInt());
		System.out.println("Enter the loanAmount. : ");
		userData.setloanAmount(userInformation.nextFloat());
		System.out.println("Enter the ManagerName. : ");
		userData.setmanagerName(userInformation.next());
		System.out.println("loan Number : " + userData.getloanNumber() + ", Loan Amount : " + userData.getloanAmount() + ", Manager name : " + userData.getmanagerName());
		System.out.println("Ia loan approce? (if Yes then enter y or n for false) : ");
		String userInput = userInformation.next();
		if (userInput.equals("Y") || userInput.equals("y")) 
			System.out.println("Loan status : Approved");
		else if (userInput.equals("N") || userInput.equals("n")) 
			System.out.println("Loan status : Cancelled");
		 else 
			System.out.println("Choose between Y or N.");
		
	}

}