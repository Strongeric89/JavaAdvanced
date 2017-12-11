package writetofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
	public static void main(String[] args) {
		File file = new File("test2.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("hello world!");
			bw.newLine();
			bw.write("Hello Eric Strong");
			
		} catch (IOException e) {
			System.out.println("file not found");
		}
		
		
	}

}
