package bonus;

public class Person {
	private int key ; 
	
	public Person(int key) {
		this.key = key ; 
	}
	public int getKeyNumber() {
		return key; 
	}
	public String toString() {
		return "Person's key :" + key ;
	}
}