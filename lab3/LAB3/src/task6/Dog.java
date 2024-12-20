package task6;

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
	@Override
	public void lastAction() {
		System.out.println("Dog " + getName() + " just barked at someone !") ; 
	}
	@Override
	public void interest() {
		System.out.println("Dog " + getName() + " likes to play with the soccer ball"); 
	}
	@Override
	public int compareTo(Animal o) {
		if(this.getAge() > o.getAge())return 1 ; 
		if(this.getAge() < o.getAge())return -1 ; 
		return 0;
	}
}
