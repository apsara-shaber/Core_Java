package funtionnmethods;

public class overlaing {
// two functions having same name, different parameter
	public static void main(String[] args) {
		//fun(3,4);
		//fun("hi coder");
		int ans=sum(3,5,1);
		System.out.println(ans);
	}
	static int  sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		return a+b-c;
	}
	
	
	static void fun(int a) {
		System.out.println("1st one");
		System.out.println(a);
		
	}
	static void fun(String name) {
		System.out.println("2nd one");
		System.out.println(name);
		
	}
	
	
}
