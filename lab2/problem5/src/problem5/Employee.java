package problem5;

public class Employee extends Person{
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
}


