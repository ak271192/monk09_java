import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class GFG extends ArrayList<Integer> {

	
	public static void main(String[] args) {
		GFG arr = new GFG();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		
		
		
		/*
		 * AbstractList<String> list = new LinkedList<String>(); list.add("Geeks");
		 * list.add("for"); list.add("Geeks"); list.add("computer"); list.add("portal");
		 */
		System.out.println("Original list" +arr);
		
		//list.subList(1, 3).clear();
		
		arr.removeRange(2, 5);
		System.out.println("Modified List" +arr);
		
		
		

	}

}
