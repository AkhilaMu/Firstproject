package Project;
import java.util.ArrayList;
import java.util.ListIterator;;

public class Main {

	public static void main(String[] args) {
	ArrayList <String> lst = new ArrayList<String>();
	lst.add("hari");
	lst.add("akhila");
	lst.add("arya");
	lst.add("Naana");
	ListIterator<String> li = lst.listIterator();
	 while (li.hasNext())
		 System.out.println(li.next());
	 System.out.println("------------------------   ");
	 while(li.hasPrevious())
		 System.out.println(li.previous());
	} 
	
}

