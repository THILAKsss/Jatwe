package pk5;

import java.util.Scanner;

public class Space {
public static void main(String[] args) {
	
	System.out.println("Please enter a string");
	Scanner input = new Scanner(System.in);
	String s = input.next();
	//System.out.println(s.length());
     
	for(int i=0;i<=s.length()-1;i++) {
		System.out.print(s.charAt(i)+ " "); 
	}
	
	
}
}
