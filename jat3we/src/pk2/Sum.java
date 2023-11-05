package pk2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		  
		int sum =0;
		int r=0;
		
		while(n>0) {
			
			r=n%10;      //3%10
			sum =sum+r;   //
			n= n/10;   //0. 
			
		}
		
		System.out.println(sum);
		
	}
	
	
}


