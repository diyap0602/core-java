package filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
* Write a Program to read data in file using FileInputStream.
* 
* @author Diya
**/
public class FileInputStreamReader {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fileWrite = new FileInputStream("C:\\\\\\\\Users\\\\\\\\Diya\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\myTestFile.txt");
		int data;
		try {
			while ((data = fileWrite.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}