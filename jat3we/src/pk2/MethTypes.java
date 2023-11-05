package pk2;

public class MethTypes {

	int f=90;
	public void xyz(){
       int a=10;
       int b=20;
       System.out.println(a+b);
	}
	public void sub(int c, int d,int o) {
		System.out.println(c-d);
	}
	
	
public static void main(String[] args) {
	
	MethTypes m = new MethTypes();
	int c=m.xyz();
	m.sub(40,20,67);  //20
	
 
	


	
}
}
