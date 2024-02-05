package oopsconcept;
/**
* Create the Program of Encapsulation.
* 
* @author Diya
**/
public class Encapsulation {

	private String userName;
	private int userAge;

	public String getName() {
		return userName;
	}

	public int getAge() {
		return userAge;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public void setAge(int age) {
		this.userAge = age;
	}

	public static void main(String[] args) {
		Encapsulation userInformation = new Encapsulation();
		userInformation.setName("Diya");
		userInformation.setAge(17);
		System.out.println("The User name is : " + userInformation.getName());
		System.out.println("The User age is : " + userInformation.getAge());
	}

}