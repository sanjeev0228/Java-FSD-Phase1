package searchingSorting;

public class BubbleSort2 {
	
	
	public static void sort(int arr[]) {
		
		int arr1[]= {5,77,87,6,3,776,7};
		int temp;
		//bubble Sort;
		for(int i=0;i<=arr1.length;i++) {
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					
				}
			}
			
		}
		
	}
	
		
	public static void main(String[] args) {
		int arr1[]= {45,67,23,89,9};
		sort(arr1);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}

}
