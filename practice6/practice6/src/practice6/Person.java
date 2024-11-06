package practice6;

public class Person implements CanHavePizza {
	
	private String name ; 
	private int age ;
	public boolean isHappy ; 
	{
		isHappy = true ; 
	}
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name ; 
		this.age = age ; 
	}
	@Override 
	public void eatPizza() {
		System.out.println((isHappy && age >= 5 && age <=60) ? "Take my money , i can eat :) !" : "I'm not gonna eat") ;
	}
	public boolean pay() {
		return true ;
	}
	public String getName() {
		return this.name ; 
	}
	@Override 
	public String toString() {
		return "name : " + this.name + "'s Happy :" + this.isHappy;
	}
}
