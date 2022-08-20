package Calculator;
import java.util.*;

public class calculatorDrive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculator calc=new calculator();
		int result;
		
		
		
		
		//Menu Driven program
		System.out.println("Enter 1. Addition 2 Division 3 Subtraction 4 Multiplication ");
		int choice=sc.nextInt();
		switch(choice){
			case 1 :result=calc.addition(a, b);
					System.out.println("sum="+result);
					break;
			case 2 : result=calc.division(a, b);
					 System.out.println("Q="+result);		
					 break;
			case 3 : result=calc.subtraction(a ,b);
			        System.out.println("Subtraction= "+result);
			        break;
			case 4 :result =calc.multiplication(a,b);
			        System.out.println("Multiplication="+result);
			        break;
		}
		
}

}
