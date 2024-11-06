package practice6;

public abstract class Animal {
	public String name ; 
	
	public Animal() {
	}
	public Animal(String name) {
		this.name = name ; 
	}
	public String getName() {
		return this.name ; 
	}
	public abstract void breath() ; 
	public abstract void move() ;
	
	@Override
	public String toString() {
		return "name : " + name ; 
	}
	
}
