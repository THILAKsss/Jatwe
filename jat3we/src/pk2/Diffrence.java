package pk2;

public class Diffrence {

	public void display() {
		System.out.println(2+3);
	}
	
	public int fun() {
		int a=8;
		int b=8;
		return (a+b);
	}
	public int fun2() {
		return 100;
	}
	
	
	public static void main(String[] args) {
		Diffrence d = new Diffrence();
		d.display();
		
		int v=d.fun();
		System.out.println(v);
		System.out.println(v+d.fun2());
	}
	
}
