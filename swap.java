package funtionnmethods;

public class swap {
	public static void main(String[]args) {
		int a= 10;
		int b= 20;
		
		/*
		 * int temp=a; // 10= 0 a=b; // 20=0 b= temp;
		 */
		swap(20,10);
		System.out.println(a+" "+b);
		
		
		String name="Nivetha";
		changeName(name);
		System.out.println(name);
		
	}
	
	static void changeName(String name) {
		name="Viji";
	}
	
	
	static void swap(int a, int b ) {
		int temp=a;
		a=b;
		b=temp;
	}
	
			
	

}
