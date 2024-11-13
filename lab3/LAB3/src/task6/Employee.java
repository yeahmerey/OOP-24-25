package task6;

public class Employee extends Person implements Comparable <Employee>{
	private int experienceYear ; 
	
	public Employee(String name , int age , int experienceYear) {
		super(name , age); 
		this.experienceYear = experienceYear; 
	}
	
	public void setExperienceYear(int year) {
		this.experienceYear = year;  
	}
	public int getExperienceYear() {
		return experienceYear ; 
	}
	@Override
	public String getOccupation() {
		return "Employee is doing community service , with work experience :" + getExperienceYear();  
	}
	public String toString() {
		return super.toString() + " Employee{ experience year : " + experienceYear +"}"; 
	}

	@Override
	public void lastAction() {
		System.out.println("Employee " + getName() + " finished work very soon") ; 
	}
	public void interest() {
		System.out.println("Employee " + getName() + " love doing their job very highly"); 
	}
	@Override
	public int compareTo(Employee o) {
		if(this.getExperienceYear() > o.getExperienceYear()) return 1 ; 
		if(this.getExperienceYear() < o.getExperienceYear()) return -1 ; 
		return 0;
	}
	@Override 
	public Object clone() throws CloneNotSupportedException{
		Employee cloned = (Employee) super.clone() ; 
		cloned.experienceYear = this.experienceYear ; 
		return cloned ; 
	}
}


