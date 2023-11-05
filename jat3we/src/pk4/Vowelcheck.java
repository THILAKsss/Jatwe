package pk4;

import java.util.Scanner;

public class Vowelcheck {
	public static void main(String[] args) {
        int n,count=0;
        Scanner obj = new Scanner(System.in);
        n=obj.nextInt(); 
        obj.nextLine();
        String str[]=new String[n];
        for (int i=0;i<n;i++)
           str[i]= obj.nextLine();
        //str[i]= obj.next();
       System.out.println("======");
        for(int i=0;i<n;i++){
            if(str[i].contains("a")||str[i].contains("e")||str[i].contains("i")||str[i].contains("o")||str[i].contains("u")) {
            	count++;
            	System.out.println(str[i]);
            }
        }
        
        if(count==n)
        	System.out.println("yes"+count);
        else
        	System.out.println("no"+count);
    }
//space is not included with next()
}
