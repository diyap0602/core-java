package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
* Write a Program to show Comparator for Student Data.
* 
* @author Diya
**/
class studentInformation {
	String studentName;
	int studentRollNumber;
	public studentInformation(String studentName, int studentRollNumber) {
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;	
	}
	public String toString() {
		return this.studentName + "" + this.studentRollNumber;
	}
}

class SortByRollNuimber implements Comparator<studentInformation> {
	public int compare(studentInformation firstStudent, studentInformation secondStudent) {
		return firstStudent.studentRollNumber - secondStudent.studentRollNumber;
	}
}

public class CompareStudentData {

	public static void main (String[] args) {
		ArrayList<studentInformation> studentDetails = new ArrayList<>();
		studentDetails.add(new studentInformation("Rajan => " , 2));
		studentDetails.add(new studentInformation("Jaya => " , 1));
		studentDetails.add(new studentInformation("Kajal => " , 3));
		System.out.println("List of Students with their Roll number :");

		for (int i = 0; i < studentDetails.size(); i++)
			System.out.println(studentDetails.get(i));
		Collections.sort(studentDetails,new SortByRollNuimber());
		System.out.println("\nSorted list of Student by their Roll number:");

		for (int i = 0; i <studentDetails .size(); i++)
			System.out.println(studentDetails.get(i));
	}

}