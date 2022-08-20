package recursion;

public class Factorial {
	
	
	static int fact (int num) {
		if(num==1 || num==0)
			return 1;
		return  num*fact(num-1);
	}

	public static void main(String[] args) {
		int ans = fact(5);
		System.out.println("Factorials is: "+ans);
		
	}

}
