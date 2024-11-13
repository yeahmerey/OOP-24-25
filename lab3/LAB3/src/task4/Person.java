package task4;

import java.util.Objects;

public class Person implements Cloneable{
	
	private String name ; 
	
	public Person(String name) {
		this.name = name ; 
	}
	public String getName() {
		return this.name ; 
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;  
		if(obj == null || getClass()!=obj.getClass()) return false; 
		Person p = (Person) obj ; 
		return Objects.equals(name , p.name);
	}
	@Override
	public int hashCode() {
		return name.hashCode() ;
	}
	public String toString() {
		return "name : " + name ;  
	}
}
