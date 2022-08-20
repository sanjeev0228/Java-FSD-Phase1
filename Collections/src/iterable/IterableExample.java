package iterable;
import java.util.ArrayList;
import java.util.Iterator;

public class IterableExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Mukesh");
		list.add("Kavish");
		
		Iterator<String> name = list.iterator();
		
		while(name.hasNext()){
			System.out.println(name.next());
		}
		
		
	
	}

}
