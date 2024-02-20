package filehandling;
import java.io.File;
/**
* Write a Program to show the file information.
* 
* @author Diya
**/
public class FileInformation {

	public static void main (String[] args) {
		File createFile = new File ("C:\\Users\\Diya\\OneDrive\\Desktop\\myTestFile.txt");
		if (createFile.exists()) {
			System.out.println("File name is : " + createFile.getName());
			System.out.println("File location is : " + createFile.getAbsolutePath());
			System.out.println("File Writable? : " + createFile.canWrite());
			System.out.println("File Readable? : " + createFile.canRead());
			System.out.println("File size is : " + createFile.length());
		} else {
			System.out.println("File does not exist.");
		}
	}

}