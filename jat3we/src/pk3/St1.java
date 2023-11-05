package pk3;
public class St1 {
	String name;
	int amount;
	static int wheels=4;  // static is only for class variable not for local variable
	
	public static void main(String[] args) {
		St1 ob = new St1();
	ob.name="BMW";
	ob.amount=50;
	
	St1 ob1= new St1();
	ob1.name="Fiat";
	ob1.amount =100;
	
	System.out.println(ob.name+ " " +ob.amount);
	System.out.println(ob1.name+ " " +ob1.amount);
	System.out.println(wheels);
	
	Pr p = new Pr();
 	p.normal=20;
   
 	
 	Pr.a=5000;
	
	
	
	
	
}
}
