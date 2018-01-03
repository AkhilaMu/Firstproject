package First;

public class Class1 {
	
	/*
	 * my first program
	 */

	public static void main(String[] args) {
		String [] myarray = {"akhila","hari","arya"};
		String str="hello family";
		int lenght = str.length();
		System.out.println(lenght);
		String uppercase = str.toUpperCase();
		String lowercase = str.toLowerCase();
		System.out.println(lowercase);
		System.out.println(str.indexOf("h"));
		
		/*int index=0;
		while (index<6) {
			System.out.println(index);
			index++;
		}
		
		for (int index=0; index<6;index++) {
		System.out.println(index);
		}
		*/
		for (String index : myarray) {
			System.out.println(index);
		}
	}}
		
		
		
	


