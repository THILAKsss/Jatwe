package pk5;

import java.util.Scanner;

public class RevwithChararray {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println(s);
				char[] c=s.toCharArray();  
				String e =""; 
				
				for (int i=c.length-1;i>=0;i--) {
					e=e+c[i];
				}
				if(e.equalsIgnoreCase(s)) {
					System.out.println("Pal");
				}
				else
				{
					System.out.println("not");
				}
}
}

