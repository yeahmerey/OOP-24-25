package Character;

import java.util.Objects;

public class Character {
	
	private String name ; 
	private int power ;
	
	public Character(String name , int power) {
		this.name = name ; 
		this.power = power ; 
	}
	
	public String getName() {
		return name ;
	}
	public int getPower() {
		return power ;
	}
	public String powerDefinition() {
		return "Character helps " ; 
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true; 
		if(obj == null || getClass()!=obj.getClass()) return false ;
		Character character = (Character) obj ;
		return power == character.power && Objects.equals(name, character.name);	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name , power); 
	}
	*/
	public String toString() {
		return "Character [Name :" + name + " , power : " + power + "]" ;
	}
}


