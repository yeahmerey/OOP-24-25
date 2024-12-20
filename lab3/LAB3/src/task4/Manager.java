package task4;
import java.util.* ; 
public class Manager extends Employee{
	private Vector<Employee> employees ; 
	private double bonus ;
	{
		this.setEmployees(new Vector<Employee>()) ; 
	}
	public Manager(String name, double salary, Date hireDate, String nationalInsurance,String nationalInsuranceNumber , double bonus) {
		super(name, salary, hireDate, nationalInsurance, nationalInsuranceNumber);
		this.setBonus(bonus) ; 
	}
	
	public Vector<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Vector<Employee> employees) {
		this.employees = employees;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void addToTeam(Employee e) {
		employees.add(e); 
	}
	@Override
	public int compareTo(Employee another) {
		if(super.compareTo(another)== 0 && another instanceof Manager) {
			Manager otherManager = (Manager) another ; 
			if(this.bonus == otherManager.bonus) {
				return 0 ; 
			}
			if(this.bonus > otherManager.bonus) {
				return 1 ; 
			}
			if(this.bonus < otherManager.bonus) {
				return -1 ; 
			}
		}
		return super.compareTo(another) ;
	} 
	@Override 
	public Object clone() throws CloneNotSupportedException{
		Manager cloned = (Manager) super.clone() ; 
		Vector<Employee> newV = new Vector<>(); 
		
		for(Employee e : this.employees) {
			newV.add(e) ; 
		}
		cloned.employees = newV ; 
		return cloned ; 
	}
	@Override 
	public String toString() {
		return "Manager { name  = " + getName() + ", salary = " + getSalary() + ", hire date = " + getHireDate()  + " , national insurance number :" + getNationalInsuranceNumber() + ", employees = " + employees + " , bonus = " + bonus + "}";  
	}
	@Override 
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false ; 
		Manager m = (Manager) obj ; 
		return m.bonus == bonus && employees.equals(m.employees); 
	}
}