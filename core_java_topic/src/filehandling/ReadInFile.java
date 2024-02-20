package filehandling;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
* Write a Program to read the file.
* 
* @author Diya
**/
public class ReadInFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your File name with path :");
		String filePath = scanner.nextLine();
		try {
			FileReader readFile = new FileReader(filePath);
			try {
				int data;
				while ((data = readFile.read()) != -1) {
					System.out.print((char)data);
				}
			} finally {
				readFile.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}