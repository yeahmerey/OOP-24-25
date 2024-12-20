package practice6;
public class Student extends Person implements CanHavePizza , CanHaveRetake{
	
	private double gpa ; 
	private int retakeCount ; 
	
	{
		retakeCount = 0 ; 
	}
	public void setRetakeCount(int retakeCount) {
		this.retakeCount = retakeCount ; 
	}
	public Student() {
	}
	public Student(String name , int age , double gpa) {
		super(name , age) ;
		this.gpa = gpa ; 
		isHappy = (gpa > 3.0); 
	}
	public double getGpa() {
		return gpa ; 
	}
	public void setGpa(double gpa) throws Exception{
		if(gpa < 0) {
			throw new Exception("Gpa cannot be negative!"); 
		}
		this.gpa = gpa ; 
	}
	@Override
	public void eatPizza() {
		if(isHappy && retakeCount == 0) {
			System.out.println("Student can eat pizza :) !!!"); 
		}
		else {
			System.out.println("Student cannot eat pizza : ( !"); 
		}
	}
	@Override
	public boolean retakeCheck() {
		return (retakeCount > 0);  
	}
	@Override 
	public void retakeStatus() {
		System.out.println((retakeCheck())? (getName() + " have retake :(") : (getName() + " don't have retake :)")); 
	}
	@Override
	public String toString() {
		return super.toString() + ", gpa = " + this.gpa; 
	}
}