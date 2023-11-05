package pk3;

public class Prime {

	public static void main(String[] args) {
		
		int count=0;
		int num=6;
		for(int i =2;i<num-1;i++) {    //2 to 5
			
		count =0;  
		if(num%i==0) {   
			count++;     
			break;
		}
		
	}
		if(count==0) {
			System.out.println("PRIME");
		}
		else
			System.out.println("COMPOSITE");
		
	}
	
}
