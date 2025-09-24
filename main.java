package funtionnmethods;
import java.util.*;
public class main {
	
	
	 public static void main(String[]args) {
			/*
			 * int ans =sum2(); System.out.println(ans);
			 */
	int ans= sum3(20,30);
	System.out.println(ans);
	
		 
	 } 
	 // return the value
	 // pass the value of num when u are caling the method in main(
	 static int sum3(int a, int b) {
		 int sum=a+b;
		 return sum;
	 }
	 
	 
	 
	 
	 
	 
	 
	 static int sum2() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter ur 1st num");
		 int n1= scan.nextInt();
		 System.out.println("2nd num");
		 int n2 = scan.nextInt();
		 int sum =n1+n2;
		 return sum;// funtion will over here
		// System.out.println("this will new ext");
		 
	 }
	 static void sum() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter ur 1st num");
		 int n1= scan.nextInt();
		 System.out.println("2nd num");
		 int n2 = scan.nextInt();
		 int sum =n1+n2;
		 System.out.println("the sum ="+ sum);
	 }



}
// access modifer(will look into in oops)
// return statement

// function - its a block of code , it will run once its called