package task6 ; 

import java.util.Objects;

public abstract class Animal implements LastAct , Interests , Comparable<Animal> {
	
	private String name ;
	private int age ; 
	
	public Animal(String name , int age) {
		this.name = name ; 
		this.age = age ;
	}
	
	public abstract void getSound(); 
	public String getName() {
		return this.name ; 
	}
	public int getAge() {
		return this.age ; 
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true ;
		if(obj == null || getClass()!=obj.getClass()) return false ;
		Animal a = (Animal) obj ;
		return age == a.age && Objects.equals(name, a.name);  
	}
	@Override
	public int hashCode() {
		return Objects.hash(name , age); 
	}
	@Override
	public String toString() {
		return "Animal { name = " + name + " , age = " + age + "}"; 
	}
}
