package SearchingAlgorithms;

/*
 * REMEMBER TO SORT THE STRUCTURE FIRST!!!!
 * 
 * */

public class BinarySearch {
	
	public static void main(String[] args) {
		int array[] = new int[100];
		
		for(int i = 1; i< array.length; i ++) {
			array[i] = i;
		}
		
		int key = 37;
		
		for(int i = 0; i< array.length; i ++) {
			System.out.println(array[i]);
		}
		boolean isFound = bSearch(array, key);
		System.out.println(isFound);
	}
	
	
	public static boolean bSearch(int [] array, int key) {
		int steps = 0;
		int first = 0;
		int last = array.length - 1;
	
		
		while(first <= last) {
			int middle = (first + last) / 2;
			steps ++;
			if(array[middle] == key) {
				System.out.println("number of steps:" + steps);
				return true;
			}else if(key < array[middle]) {
				last = middle - 1;
			}
			else {
				first = middle + 1;
			}
			
		}
		System.out.println("number of steps:" + steps);
		return false;
		
		
	
		
	}


}


