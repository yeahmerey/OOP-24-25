package problem5;

public class Dog extends Animal{
	
	public Dog(String name , int age) {
		super(name , age) ;
	}
	@Override
	public void getSound() {
		System.out.println( "af-af-af!!!"); 
	}
	@Override
	public String toString() {
		return super.toString() + " - Dog |"; 
	}
}
