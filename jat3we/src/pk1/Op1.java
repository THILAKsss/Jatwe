package pk1;

import java.util.Scanner;

public class Op1 {
public static void main(String[] args) {
	
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the value");
	int age=input.nextInt();
	
	
	if(age>18) {
		System.out.println("Eligible to vote");
	}
	else if(age==18) {
		System.out.println("Exactly upto the age to drive");
	}
	else {
		System.out.println("not eligible");
	}
	
}
}

