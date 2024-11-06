package bonus;

public class Dog extends Animal implements CanWalk , CanSwim{
	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("Dog is barking!"); 
	}
	@Override
	public void walk() {
		System.out.println("DOg can walk"); 
	}
	@Override
	public void swim() {
		System.out.println("Dog can swim") ;
	}
}
