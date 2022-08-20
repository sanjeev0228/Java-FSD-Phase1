package array;

public class SearchELementInArray {
	
	
	
	public static int Search(int[] arr ,int key) {
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
				
		}
		return -1;
	}

	public static void main(String[] args) {
		   int[] arry= {10,20,30,50,70,90,100,121};    
	        int key = 121;    
	        System.out.println(key+ " is found at index: "+Search(arry, key));  
		
	}

}
