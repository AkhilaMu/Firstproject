package First;

import java.util.Scanner;

public class Class1 {
	
	/*
	 * my first program
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "akhila";
		float decimal_value= 4;
		System.out.println(str);
		System.out.println(decimal_value);
		*/
		Scanner scn = new Scanner (System.in);
		System.out.println("enter interger value");
		int entered_value = scn.nextInt();
		System.out.println("entered value is :" + entered_value);
		Scanner scn1 = new Scanner (System.in);
		System.out.println("enter string");
		String str= scn1.nextLine();
		System.out.println("entered string is  :" + str);
		
	}

}
