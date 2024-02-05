package oopsconcept;
/**
* Write a Program that show the Hybrid Inheritance.
* 
* @author Diya
**/
class Principal {

	public void principal() {
		System.out.println("Mr.Varma is a Principal of J.L. High School.");
	}

}

class Teacher extends Principal {

	public void teacher() {
		System.out.println("Mrs. Dabhi is a Teacher.");
	}

}

class Monitor extends Teacher {

	public void monitor() {
		System.out.println("Het is a Monitor of class 9.");
	}

}

class Student extends Teacher {

	public void student() {
		System.out.println("They are student of J.L. High School.");
	}

}
public class HybridInheritance {

	public static void main(String[] args) {
		Student post = new Student();
		Monitor position = new Monitor();
		post.principal();
		post.teacher();
		post.student();
		position.principal();
		position.teacher();
		position.monitor();
	}

}