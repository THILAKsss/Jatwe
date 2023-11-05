package pk2;

public class Animal {
	
	
	int a=0; 
	String bite ="YES"   ;        // member or instance var
	public void eat() {
		System.out.println("eat method"); 
	}
	public void bark() { // properties
		System.out.println("bark method");
	}
	public void tail() {
		System.out.println("Tails of animal");
	}
	
	
    public static void main(String[] args) {
	
	 Animal dog = new Animal();
	 dog.bark();
	
}
	
    
}
