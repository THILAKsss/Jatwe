package pk3;

public class ConsPar {

	int a;
	int b;
	
	public ConsPar(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	
	
	
	public void add() {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		ConsPar c = new ConsPar(10,120);
		c.add();
	
		
	}
	
}
