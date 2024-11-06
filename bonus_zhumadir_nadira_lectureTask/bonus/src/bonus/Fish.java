package bonus;

public class Fish extends Animal implements CanSwim {
	public Fish(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("Fish is silent") ; 
	}
	@Override
	public void swim() {
		System.out.println("Fish can swim in ocean");
	}
}
