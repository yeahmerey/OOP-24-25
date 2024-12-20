package task4;
import java.util.Date;
import java.util.Objects;
public class Employee extends Person implements Comparable<Employee>{
	private double salary ; 
	private Date hireDate ;
	private String nationalInsurance ; 
	private String nationalInsuranceNumber;  
	
	public Employee(String name , double salary , Date hireDate , String nationalInsurance , String nationalInsuranceNumber) {
		super(name) ; 
		this.setSalary(salary) ; 
		this.setHireDate(hireDate) ; 
		this.setNationalInsurance(nationalInsurance);
		this.setNationalInsuranceNumber(nationalInsuranceNumber) ; 
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getNationalInsurance() {
		return nationalInsurance;
	}

	public void setNationalInsurance(String nationalInsurance) {
		this.nationalInsurance = nationalInsurance;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	@Override 
	public int compareTo(Employee e) {
		if(this.salary > e.salary) return 1 ; 
		if(this.salary < e.salary) return -1 ; 
		return 0 ; 
	}
	@Override
	public boolean equals(Object obj) {
		if(!(super.equals(obj))) return false ; 
		Employee e = (Employee) obj ; 
		return this.salary == e.salary && this.hireDate == e.hireDate && Objects.equals(nationalInsurance , e.nationalInsurance)  && Objects.equals(this.nationalInsuranceNumber, e.nationalInsuranceNumber);  
	}
	@Override
	public String toString() {
		return super.toString() + ", salary : " + salary + ", hire date : " + hireDate + ", national insurance :" + nationalInsurance + ", national insurance number : " + nationalInsuranceNumber ; 
	}
	@Override 
	public int hashCode() {
		return super.hashCode() + (int) salary + hireDate.hashCode() + nationalInsurance.hashCode() + nationalInsuranceNumber.hashCode() ;
	}
	@Override 
	public Object clone() throws CloneNotSupportedException{
		Employee e12 = (Employee) super.clone() ; 
		e12.hireDate = (Date) this.hireDate.clone() ; 
		return e12;  
	}
}
