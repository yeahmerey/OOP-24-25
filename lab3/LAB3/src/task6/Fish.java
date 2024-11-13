package task6;

public class Fish extends Animal{
	public Fish(String name , int age) {
		super(name , age); 
	}
	@Override
	public void getSound() {
		System.out.println("Glugg-glugg-glugg!");  
	}
	@Override
	public String toString() {
		return super.toString() + " - Fish |"; 
	}
	@Override
	public void lastAction() {
		System.out.println("Fish " + getName() + " has just been hooked") ;
	}
	@Override
	public void interest() {
		System.out.println("Fish " + getName() + " like to learn more about life in the earth"); 
	}
	@Override
	public int compareTo(Animal o) {
		if(this.getAge() > o.getAge()) return 1 ; 
		if(this.getAge() < o.getAge()) return -1 ;
		return 0;
	}
}
