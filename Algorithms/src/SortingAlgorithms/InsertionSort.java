package SortingAlgorithms;


import java.util.Random;
public class InsertionSort {

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
			
				for(int j =1; j < array.length; j++) {
					int key = array[j];
					int i = j-1;
					
					while((i> -1) && (array[i] > key)) {
						array[i+1] = array[i];
						i--;
					}
					array[i+1] = key;
				}
				
				double endtime = System.currentTimeMillis();
				
				
				//after sorted
				System.out.println("--------after sorting-----------");
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
					
				}	
				System.out.println("sorting took:(milliseconds) " + (endtime - starttime) );
				
				

			
		}//end main
}//end class
