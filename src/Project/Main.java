package Project;
import java.util.ArrayList;;

public class Main {

	public static void main(String[] args) {
		int simple_array[] = new int [5];
		ArrayList <Integer> list = new ArrayList <Integer> (5);
		list.add(2);
		list.add(90);
		list.add(87);
		//list.add(110);
		list.add(110);
		for (Integer a :list) 
			System.out.println(a);	
			
			System.out.println("size is " + list.size());
			//list.trimToSize();
			//System.out.println("size is " + list.trimToSize());
		System.out.println("the removed index value is " +list.remove(2));
		for (Integer a :list) 
			System.out.println(a);
		
		
		
		
	} }

