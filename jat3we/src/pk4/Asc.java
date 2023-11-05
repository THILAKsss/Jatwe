package pk4;

import java.util.Arrays;

public class Asc {
public static void main(String[] args) {
	
	int [] d = {8,3,6,5,2};  
	int temp=0;
	
	for(int i=0;i<d.length;i++) {
		
		for(int j =i+1;j<d.length;j++)
		{
			if(d[i]>d[j]) {
				temp=d[i];
				d[i]=d[j];
				d[j] =temp;      
			}
			
		}
		
	}
	
	System.out.println(Arrays.toString(d));
	
}
}
