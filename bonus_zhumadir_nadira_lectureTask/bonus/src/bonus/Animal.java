package bonus;

public abstract class Animal {
	private String name ; 
	private int age ; 
	
	public Animal(String name , int age) {
		this.name = name ; 
		this.age = age;  
	}
	
	public abstract void makeSound(); 
	public void sleep() {
		System.out.println(this.name + " is sleeping. "); 
	}	
}
