package SortingAlgorithms;

/*
 * O(n2)
 * slow On passes
 * O(1) space
 * */
import java.util.Random;
public class BubbleSort {

		public static void main(String[] args) {
			 
				Random r = new Random();
				int array[] = new int [100000];
				
				//populate the array
				for(int i =0;i<array.length;i++) {
					array[i] = r.nextInt(100);
					
				}
				
				//before sorted
				System.out.println("--------before sorting-----------");
//				
//				for(int i=0;i<array.length;i++) {
//					System.out.println(array[i]);
//					
//				}
				
				//sort using bubble sort
				int temp;
				double starttime = System.currentTimeMillis();
				System.out.println(starttime);
			
				for(int i=0; i< array.length ;i++) {
					for(int j=1;j < array.length ; j++) {
						
						if(array[j-1] > array[j]) {
							temp = array[j-1];
							array[j-1] = array[j];
							array[j] = temp;
							
						}//if
					}//inner
				}//outter
				
				double endtime = System.currentTimeMillis();
				
				
				//after sorted
				System.out.println("--------after sorting-----------");
//				for(int i=0;i<array.length;i++) {
//					System.out.println(array[i]);
//					
//				}	
				System.out.println("sorting took:(milliseconds) " + (endtime - starttime) );
				
				

			
		}//end main
}//end class
