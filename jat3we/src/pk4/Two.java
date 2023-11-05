package pk4;

public class Two {
public static void main(String[] args) {
	
	int add[][] = {
			
     		{4,5,6},   //  add[0][0]  add[0][1]  add[0][2]
			{8,9,11},  //  add[1][0]  add[1][1]  add[1][2]
			{9,45,23}  //  add[2][0]
			
	};
	
	
//	System.out.println(add.length);
	for( int i=0; i<add.length;i++) {
		
		for(int j=0;j<add.length;j++)
		{
			System.out.print(add[i][j]+" "); //add[1][0] add[1][1]  add[1][2]
		}
		
		System.out.println();
		
	}
	
	
	
	
}
	
}
