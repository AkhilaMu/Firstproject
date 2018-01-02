package First;

import java.util.Scanner;

public class Class1 {
	
	/*
	 * my first program
	 */

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a string");
		String s1= s.nextLine();
		//String name="akhila";
		switch (s1) {
		case "akhila":
			System.out.println("its my name");
			break;
		case "hari":
			System.out.println("its my husbnads name");
			break;
		default:
			System.out.println("its my babys name");
			
		}
		
		
	}

}
