package pk4;

import java.util.Arrays;

public class Ar1 {
public static void main(String[] args) {
	
	
	int[] arr = new int[7];   // type 1
	
	arr[0]=90;
	arr[1]=100;
	arr[2]=78;
	arr[3]=90;
	arr[4]=88;
	arr[5]=66;
	
	
	
	System.out.println(arr.length);
	
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);     //TYPE 1
//	}
		
//	System.out.println(Arrays.toString(arr));  //TYPE 2
	
	for(int x:arr) {
		System.out.print(x+" ");           //TYPE 3
	}
	
	
}
}
