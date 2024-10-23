package problem5;

public class Bird extends Animal {
	public Bird(String name , int age) {
		super(name , age) ; 
	}
	@Override
	public void getSound() {
		System.out.println("Coo-coo-coo!") ;
	}
	@Override
	public String toString() {
		return super.toString() + " - Bird |"; 
	}
	
}