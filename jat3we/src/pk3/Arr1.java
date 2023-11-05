package pk3;

public class Arr1 {
public static void main(String[] args) {
	
	int[] smart= new int[5];
	smart[0]= 46;
	smart[1]=54;
	smart[2]=78;
	smart[4]=88;
	 
	 int[] ar = {3,7,66,44,90,88};
	 
	 //System.out.println(smart.length);
	 
	 for(int i=0;i<=ar.length-1;i++) {
		 System.out.print(ar[i]+ " ");
	 }
	 
	 System.out.println();
	 //advanced for loop
	 for(int b: ar ) {
		 System.out.print(b+" ");
	 }
	 
	
}
}
