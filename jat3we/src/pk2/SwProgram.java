package pk2;

import java.util.Scanner;

public class SwProgram {

public static void main(String[] args) {
	
	System.out.println("Enter a number");
	Scanner input = new Scanner(System.in); 
	int n = input.nextInt();
	
	switch(n) {
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3: 
		System.out.println("Tuesday");
		break;
	default:
		System.out.println("Please enter the correct number");
	}
	
	
	
			
}
	
}
