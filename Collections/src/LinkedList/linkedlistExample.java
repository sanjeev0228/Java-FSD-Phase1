package LinkedList;
import java.util.LinkedList;

public class linkedlistExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Heena");
		list.add("Manish");
		list.add("Babita");
		list.add("Kavish");
		list.add(null);
		list.add("Heena");
		System.out.println("LinkedList " +list);
		
		if(list.contains("Kavish")) 
			System.out.println("found= "+list.indexOf("Kavish"));
		else
			System.out.println("Not Found");	
		
		
		
		list.remove("Babita");
		System.out.println(list);
		System.out.println(list.get(2));
		
		
		
	    
		
	}

}
