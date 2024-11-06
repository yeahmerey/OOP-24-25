package bonus;

public class Test {
	public static void main(String[] args) {
		Bird b = new Bird("Birdgul" , 1) ; 
		b.makeSound();
		b.fly();
		b.walk() ;
		
		Dog d = new Dog("Boris" , 2); 
		d.makeSound();
		d.walk(); 
		d.swim();
		
		Fish f = new Fish("Fishbek", 4) ;
		f.makeSound();
		f.swim();
	}
}
