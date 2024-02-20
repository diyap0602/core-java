package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
* Write a Program to get file name from user and write data in file from user.
* 
* @author Diya
**/
public class CreateFileAndAddData {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your File Path :");
		String filePath = scanner.nextLine();
		System.out.println("Enter your File name (without extension) :");
		String fileName = scanner.nextLine() + ".txt";
		File file = new File(filePath, fileName);
		try {
			if (file.createNewFile()) {
				System.out.println("File create.");
			} else {
				System.out.println("File exist.");
			}
		} catch (Exception e) {
			System.out.println("File Handled.");
		}
		System.out.println("File location is : " + file.getAbsolutePath());
		System.out.println("Enter your Name :");
		String userName = scanner.nextLine();
		System.out.println("Enter your Age :");
		String userAge = scanner.nextLine();
		System.out.println("Enter your G-mail :");
		String userGmail = scanner.nextLine();
		try {
			FileWriter writeFile = new FileWriter(file);
			try {
				writeFile.write("Name : " + userName);
				writeFile.write("\nAge : " + userAge);
				writeFile.write("\nG-mail : " + userGmail);
			} finally {
				writeFile.close();
				System.out.println("Your personal info is updated.");
			}
		} catch (Exception e) {
			System.out.println("File Handled.");
		}
		scanner.close();
	}

}