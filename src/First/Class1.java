package First;

import java.util.Scanner;

public class Class1 {
	
	/*
	 * my first program
	 */

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("enter 2 values");
		int first_value = scn.nextInt ();
		int second_value = scn.nextInt();
		int c = first_value + second_value;
		System.out.println("added value is :" + c); 
		
	}

}
