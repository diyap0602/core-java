package oopsconcept;
import java.util.Scanner;

/**
* Write a Program that show the Single Inheritance.
* 
* @author Diya
**/
class StudentDetails {

	protected void studentDetails() {
		Scanner studentInformation = new Scanner(System.in);
		String studentName;
		System.out.println("Enter the StudentName. : ");
		studentName = studentInformation.nextLine();
		int studentRollNumber;
		System.out.println("Enter the StudentRollNumber. : ");
		studentRollNumber = studentInformation.nextInt();
	}

}

class SingleInheritance extends StudentDetails {

	public void studentExamDetails() {
		Scanner studentExamInformation = new Scanner(System.in);
		int studentMarks;
		System.out.println("Enter the StudentMarks. : ");
		studentMarks = studentExamInformation.nextInt();
		if (studentMarks >= 33) {
			System.out.println("Student is Pass in Exam.");
		} else {
			System.out.println("Student is Fail in Exam.");
		}
		
	}

	public static void main(String[] args) {
		SingleInheritance studentInformation = new SingleInheritance();
		studentInformation.studentDetails();
		studentInformation.studentExamDetails();
	}

}