package pk1;

import java.util.Scanner;

public class Logical {
public static void main(String[] args) {
	System.out.println("Enter the age");
	Scanner input = new Scanner(System.in);
       int age=input.nextInt();
	
	
	
	if(age>18  && age<=22) {
		System.out.println("Eligible to vote");
     }
	else if(age!=15){
		System.out.println("Still in adolocense");
	}
	else {
		System.out.println("Not eligible");
	}
	
	
	
}
}
