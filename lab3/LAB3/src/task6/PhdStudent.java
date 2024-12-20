package task6;

public class PhdStudent extends Person implements Comparable<PhdStudent> {
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
	public Object clone() throws CloneNotSupportedException{
		return (PhdStudent) super.clone() ; 
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
	@Override
	public void lastAction() {
		System.out.println("PhD Student " + getName() + " has just finished his diploma defense. ") ;
	}
	public void interest() {
		System.out.println("PhD Student " + getName() + " like to read the article");
	}
	@Override
	public int compareTo(PhdStudent o) {
		if(this.getGpa() > o.getGpa()) return 1 ; 
		if(this.getGpa() < o.getGpa()) return -1 ; 
		return 0;
	} 
}