package task4 ;
import java.util.*; 
public class HireDateComparator implements Comparator<Employee>{
	@Override 
	public int compare(Employee e1 , Employee e2) {
		return e1.getHireDate().compareTo(e2.getHireDate()); 
	}
}







