package SortingAlgorithms;


/*
 * O(n2)
 * slow On passes
 * O(1) space
 * */
import java.util.Random;
public class SelectionSort {

		public static void main(String[] args) {
			 
				Random r = new Random();
				int array[] = new int [100];
				
				//populate the array
				for(int i =0;i<array.length;i++) {
					array[i] = r.nextInt(100);
					
				}
				
				//before sorted
				System.out.println("--------before sorting-----------");
				
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
					
				}
				
				//sort using bubble sort
				int temp;
				double starttime = System.currentTimeMillis();
				System.out.println(starttime);
			
				for(int i=0; i< array.length - 1 ;i++) {
					int index = i;
					
					for(int j= i +1 ;j < array.length ; j++) {
						
						if(array[j] < array[index]) {
							index = j;	
						}//if
					}//inner
					
					temp = array[index];
					array[index] = array[i];
					array[i] = temp;
					
				}//outter
				
				double endtime = System.currentTimeMillis();
				
				
				//after sorted
				System.out.println("--------after sorting-----------");
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
					
				}	
				System.out.println("sorting took:(milliseconds) " + (endtime - starttime) );
				
				

			
		}//end main
}//end class
