package Project;
import java.util.*;

//hashset allows iterator--iterator only have an option like hasnext...
//ListIterator have an option like hasnext() and hasprevious()
public class Main {

	public static void main(String[] args) {
	HashSet <String> name= new HashSet<String>();
	name.add("A");
	name.add("B");
	name.add("C");
	Iterator <String> ls = name.iterator();
while (ls.hasNext())
		System.out.println(ls.next());

	
	
		 
	}
	
}

