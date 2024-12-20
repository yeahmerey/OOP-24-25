package task6;
import java.util.Objects; 
import java.util.* ; 
public abstract class Person implements LastAct , Interests , Cloneable{
	private String name ; 
	private int age ; 
	private Vector<Animal> animals = new Vector<Animal>(); 
	public String getName() {
		return this.name ; 
	}
	public int getAge() {
		return this.age ; 
	}
	private HashMap<Animal , Person> transferTo = new HashMap<>();
	private HashMap<Animal , Person> returnFrom = new HashMap<>(); 
	
	public Person(String name , int age) {
		this.name = name ; 
		this.age = age ; 
	}
	
	public void assignPet(Animal animal) {
		animals.add(animal); 
	}
	public void removePet(Animal animal) {
		animals.remove(animal); 
	}
	public boolean hasPet(Animal animal) {
		return animals.contains(animal); 
	}
	public boolean hasPets() {
		return animals.size() > 0; 
	}
	
	public abstract String getOccupation(); 
	public void leavePet(Animal animal,Person person) {
		if(!(person instanceof PhdStudent && animal instanceof Dog) && animals.contains(animal)) {
			animals.remove(animal); 
			person.assignPet(animal);
			transferTo.put(animal , person); 
		}
		else return ; 
	}
	public void returnPetFrom(Animal animal , Person person ) {
		if(person.hasPet(animal)) {
			person.removePet(animal) ;
			assignPet(animal); 
			returnFrom.put(animal, person); 
		}
	}
	public Person whoReturnPet(Animal animal) {
		return transferTo.get(animal);
	}
	public Person whoGavePet(Animal animal) {
		return returnFrom.get(animal); 
	}
	public boolean equals(Object obj) {
		if(this == obj) return true;  
		if(obj == null || getClass()!=obj.getClass()) return false; 
		Person p = (Person) obj ; 
		return age == p.age && Objects.equals(name , p.name); 
	}
	public int hashCode() { 
		return Objects.hash(name , age); 
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone() ; 
	}
	public String toString() {
		return "Name : " + name + ", age = " + age + ", has a animals : " + animals + "]"; 
	}
}