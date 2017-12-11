package InputOutput;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class UsingScanner {
	public static void main(String[] args) {
		File file = new File("test.txt");
		
		try {
			Scanner scan = new Scanner(file);
			
			
			while(scan.hasNextLine()) {
				
				System.out.print(scan.nextLine() + "\n");
			
			}
		}catch(FileNotFoundException fnfe) {
			System.out.println("File not found");
		}
		
		
	
		
	}
}
