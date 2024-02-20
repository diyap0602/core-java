package filehandling;
import java.io.File;
import java.io.IOException;
/**
* Write a Program to create a file.
* 
* @author Diya
**/
public class CreateFile {

	public static void main (String[] args) throws IOException {
		File createFile = new File ("C:\\Users\\Diya\\OneDrive\\Desktop\\myTestFile.txt");
		if (createFile.createNewFile()) {
			System.out.println("File successfully created..");
		} else {
			System.out.println("File already Exist..");
		}
	}

}