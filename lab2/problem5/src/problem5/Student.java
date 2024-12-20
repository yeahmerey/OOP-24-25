package problem5;

public class Student extends Person{
	private int courseYear ; 

	public Student(String name , int age , int courseYear) {
		super(name , age) ;
		this.courseYear = courseYear; 
	}
	
	public void setCourseYear(int year) {
		this.courseYear = year ; 
	}
	public int getCourseYear() {
		return courseYear; 
	}
	@Override 
	public String getOccupation() {
		return "student of Kbtu"; 
	}
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj ; 
		return s.courseYear == this.courseYear && super.equals(obj) ; 
	}
	@Override 
	public String toString() {
		return super.toString() + " Student { course year : " + courseYear + "}" ; 
	}
}
