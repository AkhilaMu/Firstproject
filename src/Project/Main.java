package Project;
public class Main {
	
public static int check() {
	int a=2;
	try {
		a=a/0;
		//int b[] = new int [2];
		return a;
		
	}catch (Exception e) {
		System.out.println("zero");
		return a;
		
	}finally {
		System.out.println("finally block always excutable");
		return 300;
	}
	
}
	public static void main(String[] args) { 	
	System.out.println(check());
	}
}
		
		
	
		
	
	
		 
	
	



