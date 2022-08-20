package searchingSorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {12,45,455,89,9};
		SelectionSort.sort(arr);
		//printed sorted array
		for(int i=0 ;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		//take value to be search 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be Searched : ");
		int key =sc.nextInt();
		
		//calling binary search method 
		
		boolean ans =BinarySearching(arr,key);
		if(ans) 
			System.out.println("Value Found");
		else
			System.out.println("Value Not Found");
		
	}
	
	public static boolean BinarySearching(int arr[], int key) {
		boolean ans = false;
		int st = 0;
		int end = arr.length-1;
		int mid;
		while(st<=end){
			mid=(st+end)/2;
			if(arr[mid]==key) {
				ans =true;
				break;
			}
			else
				if(arr[mid]<key)
					st=mid+1;
				else
					end = mid-1;
			
		}
		
		return ans;
		
	}

}
