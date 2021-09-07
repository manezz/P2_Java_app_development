
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("read or write?");
		String selectedMenu = scan.nextLine();
		
		switch (selectedMenu) {
			case "read":
				System.out.println(selectedMenu);
		}
		
		String fileName = "test.txt";
		
		String line = null;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferedReader.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println (
					"Unable to open file '" + fileName + "'");
		}
		catch (IOException ex) {
			System.out.println(
					"Error reading file '" + fileName + "'");
		}
		
	}
}
