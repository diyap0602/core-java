package filehandling;
import java.io.FileWriter;
import java.io.IOException;
/**
* Write a Program to show write data in file.
* 
* @author Diya
**/
public class WriteInFile {

	public static void main(String[] args) {
		try {
			FileWriter writeFile = new FileWriter("C:\\\\Users\\\\Diya\\\\OneDrive\\\\Desktop\\\\myTestFile.txt");
			try {
				writeFile.write("Welcome to Qdev Technolab Private Limited."); 
			} finally {
				writeFile.close();
			}
			System.out.println("Data is successfully write in file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}