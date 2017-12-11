package SortingAlgorithms;

import java.util.Random;
public class QuickSort {
	
	public static void main(String[] args) {
		
		int []array = new int[100];
		
		Random r = new Random();
		
		for(int i = 0;i<array.length;i++) {
			array[i] = r.nextInt(100);
		}
		
		System.out.println("------before sort------");
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		quicksort(array,0,array.length-1); // call the quicksort algorithm
		
		System.out.println("------after sort------");
		
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		
		
	}
	
	public static void quicksort(int[] array, int left, int right) {
		//base case
		if(left>= right) {
			return;
		}
		
		int pivot = array[(left + right) / 2];
		int index = partition(array,left,right,pivot);
		
		quicksort(array,left,index-1);
		quicksort(array,index,right);
		
	}//end quicksort
	
	public static int partition(int[] array,int left,int right,int pivot) {
		
		while(left <= right) {
			while(array[left] < pivot) {
				left ++;
				
			}
			
			while(array[right] > pivot) {
				right --;
			}
			
			if(left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left ++;
				right --;
			}
			
		}
		return left;
	}
	
	
	

}
