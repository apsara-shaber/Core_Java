package ARRAYY;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Arrays;

public class Arrrydsa {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// array of primitives;
		int arr[]= new int[4];
		
		arr[0]= 84;
		arr[1]=82;
		arr[2]=33;
		arr[3]=99;
		
		System.out.println(arr[2]);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();
			
}
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+ " ");
	
}
//		
//		
	 for(int num:arr) {
		 System.out.print(num+" ");
	 }
		
		
		
		// array of object
		
		

		String str[]=new String[4];
	for(int i=0;i<str.length;i++)
	{
		str[i]= scan.next();
	}
	
	str[1]="nivi";// changing the original object
	
System.out.println(Arrays.toString(str));
		
		
      	//int arr[] = new int[5];
		//array of primitives
//		arr[0]=99;
//		arr[1]=26;
//		arr[2]=67;
//		arr[3]=75;
//		arr[4]=24;
		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]= scan.nextInt();// to showcase array with bracket & comas
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
//		String str[]=new String[4];
//		for(int i=0;i<str.length;i++)
//		{
//			str[i]= scan.next();
//		}
//		
//		System.out.println(Arrays.toString(str));// its a string
		
		
		// multidimensionl arrays./...........
		
		
//		2D array are matrics
		/*	1 2 3
			4 5 6 
			7 8 9*/
			
//			int arrd [][]= new int[3][];
//			
//			int arr[][]= {
//					{1,2,3},//0th index
//					{4,6},//1st index
//					{7,8,9,44}//2nd index-
//			};
//			//input
//			for(int i=0;i<arrd.length;i++)
//			{
//				//arr[i]=scan.nextInt();
//			}

		
	}

}
