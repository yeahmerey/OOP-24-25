package problem1 ;
public class Animal {
	protected String name ; 
	protected int age ; 
	protected String color ; 
	
	public Animal(){
	}
	
	public Animal(String name , int age , String color) {
		this.name = name ; 
		this.age = age ; 
		this.color = color; 
	}
	public String voice() {
		return "I can say"; 
	}
	
	public String toString() {
		return "name : " + name + ", age : " + age + ", Color" + color ; 
	}
}
