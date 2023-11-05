package pk3;

public class ConsAdd {
	 int a;
	  int b;  //instance variable
		
	  public ConsAdd(){
		a=10;
		b=50;
		 }
	  public void meth1() {
		  int c;  //local variable
		  c=a+b;
		  System.out.println("The sum is " + c);
	  }
	  
	public static void main(String [] args) {
			ConsAdd ob =new ConsAdd();
			ob.meth1();
}
}