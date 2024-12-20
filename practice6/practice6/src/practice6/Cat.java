package practice6;

public class Cat extends Animal implements CanHavePizza{
	private String voice ; 
	{
		voice = "meowww - meowww , prrr , prrr :) !"; 
	}
	public Cat(String name) {
		super(name) ; 
	}
	public String getVoice() {
		return voice ; 
	}
	@Override
	public void breath() {
		System.out.println("Cat " + super.name + " can breathe") ;
	}

	@Override
	public void move() {
		System.out.println("Cat " + super.name + " can move"); 
	}
	@Override
	public void eatPizza() {
		System.out.println((pizzaSize < 25) ? "Yes, cat can eat" : "Nope, because pizza is too big :(");
	}
	@Override 
	public String toString() {
		return super.toString() + " , and cat makes sound : " + this.voice ; 
	}
}
