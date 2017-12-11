package FileIO_with_resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithResources {
	public static void main(String[] args) {
		File file = new File("test.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String s;
			while((s=br.readLine()) != null) {
				System.out.println(s);
			}
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("file not found");
			
		}catch(IOException ioe) {
			System.out.println("error with io");
			
		}
		
	}
}
