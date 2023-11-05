package pk3;

public class Over {
	public void display() {
		System.out.println("No arg method");
	}
	public void print(int a) {
		System.out.println("Integer");
	System.out.println(8+9);
	}
	public void print(int a, int b) {
		System.out.println("two int arguments");
		System.out.println(7-0);
	}
	
	public void print(float f, char c) {
		System.out.println("float, char method");
	}
	public void print(char c, float f) {
		System.out.println("character , float method");
	}
	//method overloading
	public static void main(String[] args) {
		Over o = new Over();
		o.print(1000);  //Integer
		o.print('v', 99.9f);     //character , float method
		o.print(63.7f, 'b');     //float char method
		o.print(4, 7);           //two int arg
	
		
}
}
