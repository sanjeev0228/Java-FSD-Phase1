package recursion;

public class SumOfNaturalNumber {
	
	
	static int SumOfNum(int num) {
		int sum =0;
		for(int i=1;i<=num;i++) 
			sum= sum+i;
			return sum;
			
		}
	
	public static void main(String[] args) {
		
		int num =50;
		System.out.println("Sum of Natural no : " +SumOfNum(num));
		

	}

}
