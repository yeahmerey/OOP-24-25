package problem5;

public class PhdStudent extends Person{
	private double gpa ; 
	
	public PhdStudent(String name , int age , double gpa) {
		super(name , age); 
		this.gpa = gpa; 
	}
	public void setGpa(int gpa) {
		this.gpa = gpa ; 
	}
	public double getGpa() {
		return gpa ;
	}
	
	@Override
	public void assignPet(Animal animal) {
		if(!(animal instanceof Dog)) {
			super.assignPet(animal);
		}
	}
	@Override
	public String getOccupation() {
		return "Phd Student of KBTU" ; 
	}
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == false) return false; 
		PhdStudent p = (PhdStudent) obj ; 
		return p.getGpa() == this.gpa ; 
	}
	@Override
	public String toString() {
		return super.toString() + " PhdStudent { gpa = " + gpa + "}"; 
 	}
}