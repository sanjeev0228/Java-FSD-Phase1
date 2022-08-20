package ArrayList;

import java.util.ArrayList;

public class arrayListExamples {
	public static void main(String[] args) {
	 
	 ArrayList<String> list = new ArrayList<>();
		list.add("Heena");
		list.add("Manish");
		list.add("Babita");
		list.add("Kavish");
		list.add(null);
		list.add("Heena");
		System.out.println("ArrayList element: " +list);
		
		if(list.contains("Kavish")) 
			System.out.println("found= "+list.indexOf("Kavish"));
		else
			System.out.println("Not Found");	
		
		
		
		list.remove("Babita");
		System.out.println(list);
	    
	
}
	
	
	
	
	
	
	
	

}
