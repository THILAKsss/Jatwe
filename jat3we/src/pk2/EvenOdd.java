package pk2;

public class EvenOdd {
public static void main(String[] args) {
	
	
	int n=23564;
	int r;
	int e=0;
	int o=0;
	
	while (n>0) {
		r = n%10; 
		if(r%2 ==0) {
		  e++;       
		}
		else {
			o++;    
		}
		
		n=n/10;
	}	
	
	System.out.println("The number of even digits are " + e);
	System.out.println(o);
	
	}
	
}

