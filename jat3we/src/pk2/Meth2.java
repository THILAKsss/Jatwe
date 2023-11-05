package pk2;

public class Meth2 {
	
	public int mul() {  //with rt, without arg
		int a=88;
		int b=10;
		System.out.println(a*b);
		return a;
	}
	
	public float div(float x, int y) {
		System.out.println(x/y);
		return (x/y);
	}
	
	
	
public static void main(String[] args) {
	Meth2 m2 = new Meth2();
	int ans = m2.mul();
	System.out.println("The answer that i got is "+ans);
	
	System.out.println(m2.div(8.8f, 8));
	
}

}
