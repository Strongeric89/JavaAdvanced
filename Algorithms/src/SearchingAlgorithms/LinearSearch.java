package SearchingAlgorithms;
import java.util.Random;

public class LinearSearch {
	
	
	public static void main(String[] args) {
		
		int[] array = new int[100];
		Random r = new Random();
		
		
		for(int i = 0; i< array.length;i++) {
			array[i] = r.nextInt(100);
		}
		int key = r.nextInt(100);
		System.out.println("key: " + key);
		
		for(int i = 0; i< array.length;i++) {
			System.out.println((i+1) + ":" +array[i]);
		}
		
		
		
		
		
		int i = 0;
		int steps=0;
		int index = -1;

		boolean isRunning = true;
		while(isRunning) {
			if(key == array[i]) {
				index = i + 1;
				System.out.println("found the key! at index " + index +" it took " + (steps + 1)  + " amount of steps");
				
				break;
			}
			
			if(i == (array.length - 1)) {
				System.out.println("The key was not found :(");
				break;
			}
			i++;
			steps++;
		}
		

	}


}
