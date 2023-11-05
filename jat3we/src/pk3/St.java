package pk3;

public class St {

	int id ;
    int sal;
   static String ceo;
    
   public void disp() {
	   System.out.println(id + ":" + sal + ":" + ceo);
   }
   
   public static void run() {
	   System.out.println("Runs method");
   }
	
public static void main(String[] args)	{
	St raju = new St();
	raju.id=101;
	raju.sal=2000;
	//raju.ceo="ROY";
	
	St ramu = new St();
	ramu.id=201;
	ramu.sal =3000;
//	ramu.ceo="RIA";
	
	St ramani = new St();
	ramani.id=301;
	ramani.sal=5000;
	ramani.ceo="REKA";
	
	ceo="X";
	
	raju.disp();
	ramu.disp();
	ramani.disp();
	
	run();
	
	
	
	
	
}
	
}
