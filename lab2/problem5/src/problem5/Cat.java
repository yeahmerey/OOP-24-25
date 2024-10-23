package problem5;

public class Cat extends Animal{
	
	public Cat(String name , int age) {
		super(name, age); 
	}
	@Override
	public void getSound() {
		System.out.println( "meowwww! :)");  
	}
	@Override 
	public String toString() {
		return super.toString() + " - Cat |"; 
	}
}
