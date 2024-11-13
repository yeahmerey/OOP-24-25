package task6;

public class Cat extends Animal{
	
	public Cat(String name , int age) {
		super(name, age); 
	}
	@Override
	public void getSound() {
		System.out.println( "meowwww! :)");  
	}
	
	@Override 
	public String toString() {
		return super.toString() + " - Cat |"; 
	}
	@Override
	public void lastAction() {
		System.out.println("Cat " + getName() + " meowed and asked for food"); 
	}
	@Override
	public void interest() {
		System.out.println("Cat " + getName() + " like to jump of high "); 
	}
	@Override
	public int compareTo(Animal o) {
		if(this.getAge() > o.getAge()) return 1 ; 
		if(this.getAge() < o.getAge()) return -1 ; 
		return 0 ;
	}
}
