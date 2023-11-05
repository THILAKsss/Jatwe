package pk5;

import java.util.Scanner;

public class Rev {
public static void main(String[] args) {
	
	System.out.println("Enter any string to be reversed");
	Scanner input = new Scanner(System.in);
	String s= input.next();
	String rev="";              
	for(int i=s.length()-1;i>=0;i-- ) {
		   rev=rev+s.charAt(i);  
	}
	System.out.println(rev);
	
	if(s.equals(rev)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
