package SortingAlgorithms;
import java.lang.reflect.Array;
import java.util.Random;

/*
 * 	GREAT time - O(n log n)
 *  NOT AS GOOD SPACE - O(n) space - needs extra space, extra arrays
 * 
 * 
 * */

public class MergeSort {
	public static void main(String[] args) {
		
		int [] array = new int [100];
		Random r = new Random();
		
		for(int i = 0; i<array.length;i++) {
			array[i] = r.nextInt(100);

		}

		
		mergesort(array, new int[array.length], 0,array.length -1);
		
		//print the results after been sorted
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);

		}
		
	}//end main
	

	public static void mergesort(int [] array, int[] temp, int leftstart, int rightend ) {
		//base case
		if(leftstart >= rightend) {
			return;
		}
		
		int middle = (leftstart + rightend) / 2; // get the middle point
		
		mergesort(array, temp, leftstart, middle); // sort the left side
		mergesort(array, temp, middle + 1,rightend); // sort the right side
		mergeHalves(array, temp, leftstart,rightend); // merge the left and right side into the temp
		
		
	}
	
	public static void mergeHalves(int [] array,int [] temp, int leftstart, int rightend) {
		
			int leftend = (rightend + leftstart) / 2;
			int rightstart = leftend + 1;
			int size = rightend - leftstart + 1;
			
			int left = leftstart;  //pointer on the left side
			int right = rightstart; //pointer on the right side
			int index = leftstart; //index is the index for the temp array, counting up from 0
			
			while(left <= leftend && right <= rightend) {
				if(array[left] <= array[right]) {
					temp[index] = array[left];
				
					left ++;
					
				}
				else {
					temp[index] = array[right];
					right ++;
				}
				index ++;
			}
		
			System.arraycopy(array, left, temp, index, leftend - left + 1);
			System.arraycopy(array, right,temp,index, rightend - right + 1);
			System.arraycopy(temp, leftstart,array,leftstart,size);
			
			
		}
	
	

}//end class
