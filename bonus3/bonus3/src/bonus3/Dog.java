package bonus3;

import java.io.Serializable; 


public class Dog implements Serializable{
	
	private String name ; 
	private int age ; 
	private String color ; 
	
	public Dog(String name , int age , String color) {
		this.name = name ; 
		this.age = age ; 
		this.color = color ; 
	}
	@Override 
	public String toString() {
		return "name : " + name + " , age : " + age + " , color : " + color; 
	}
	public String toDataInfo() {
		return name + "|" + age + "|" + color + "|" ; 
	}
	public static Dog fromDataInfo(String dataString) {
		String[] lines = dataString.split("\\|"); 
		return new Dog(lines[0] , Integer.parseInt(lines[1]), lines[2]); 
	}
}
