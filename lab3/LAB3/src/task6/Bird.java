package task6;

public class Bird extends Animal {
	public Bird(String name , int age) {
		super(name , age) ; 
	}
	@Override
	public void getSound() {
		System.out.println("Coo-coo-coo!") ;
	}
	@Override
	public String toString() {
		return super.toString() + " - Bird |"; 
	}
	@Override
	public void lastAction() {
		System.out.println("Bird " + getName() + " is has just flown and landed") ; 
	}
	@Override
	public void interest() {
		System.out.println("Bird " + getName() + " loves to sing" ); 
	}
	@Override
	public int compareTo(Animal o) {
		if(this.getAge() > o.getAge()) return 1 ; 
		if(this.getAge() < o.getAge()) return -1 ;
		return 0;
	}
	
}
