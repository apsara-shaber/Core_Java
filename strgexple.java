package funtionnmethods;

import java.util.Scanner;

public class strgexple {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter ur name");
		String name = scan.next();
		
		String personlizdmsg=mygreet(name);
		System.out.println(personlizdmsg);
	}
	static String mygreet(String name) {
		String message="Hello "+name;
		return message;
	}
	
	static String greet( ) {
		String greeting ="how r you";
		return greeting;
	}
	

}
