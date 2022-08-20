package searchingSorting;

import java.util.Arrays;

class QuickSorts{
	//method to find the partition position
	
	static int partition (int array[] ,int low ,int high) {
		//choose the rightmost element as pivot
		
		int pivot = array[high];
		//pointer for greater element
		int i = (low-1);
		
		//transerse through all element
		
		//compare each element with pivot
		
		for(int j=low;j<high;j++) {
			if(array[j]<=pivot) {
				//if element smaller than pivot is found
				//swap it with greater element point by i
				i++;
				
				//swapping element at i with element at j
				int temp =array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		//swap the pivot element with greater element by 1
		
		int temp =array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		//return the position from where parition is done
		return(i+1);
		
	}
	
	static void quicksort(int array[],int low ,int high) {
		if(low<high) {
			 // find pivot element such that
		      // elements smaller than pivot are on the left
		      // elements greater than pivot are on the right
			int pi= partition(array,low,high);
			
			//recursive call on the left of pivot
			  quicksort(array,low,pi-1);
			// recursive call on the right of pivot
		      quicksort(array, pi + 1, high);
		}
	}
}

public class QuickSort {

	public static void main(String[] args) {
		int [] data = {8,7,2,1,0,9,67 };
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(data));
		
		int size = data.length;
		
		//call quick sort on array data
		
		QuickSorts.quicksort(data, 0, size-1);
		
		System.out.println("Sorted Array in Ascending Order");
		
		System.out.println(Arrays.toString(data));
		
		
		
	

	}
	
	
	

}
