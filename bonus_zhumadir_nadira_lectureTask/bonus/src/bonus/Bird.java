package bonus;

public class Bird extends Animal implements CanFly , CanWalk{
	
	public Bird(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("Bird is chirping!"); 
	}
	@Override
	public void fly() {
		System.out.println("Bird can fly in air") ;
	}
	@Override
	public void walk() {
		System.out.println("Bird can walk "); 
	}
}
