package Character;

import java.util.Objects;

public class C {
	
	private String name ; 
	private int power ;
	
	public C(String name , int power) {
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
	//equals ; //hashcode 
	
	public boolean equals(Object obj) {
		if(this == obj) return true; 
		if(obj == null || getClass() != obj.getClass()) return false; 
		C ch = (C) obj ; 
		return power == ch.power && Objects.equals(ch.name, name) ; 
	}
	
	public int hashCode() {
		return Objects.hash(name , power) ;
	}
	public String toString() {
		return "Character [Name :" + name + " , power : " + power + "]" ;
	}
}


