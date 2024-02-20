package filehandling;
import java.io.File;
/**
* Write a Program to change the file name.
* 
* @author Diya
**/
public class RenameFile {

	public static void main(String[] args){
		File oldFileName = new File("C:\\Users\\Diya\\OneDrive\\Desktop\\myFile.txt");
		File newfileName = new File("C:\\Users\\Diya\\OneDrive\\Desktop\\welcomeFile.txt");
		if (oldFileName.exists()) {
			System.out.println(oldFileName.renameTo(newfileName));
		} else {
			System.out.println("File does not exist.");
		}
	}

}