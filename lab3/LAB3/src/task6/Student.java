package task6;

public class Student extends Person implements Comparable<Student>{
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
	public Object clone() throws CloneNotSupportedException{
		Student cloned = (Student) super.clone();
		cloned.courseYear = this.courseYear ; 
		return cloned ; 
	}
	@Override
	public void lastAction() {
		System.out.println("A student " + getName() + " got 40 marks in OOP") ; 
	}

	@Override
	public void interest() {
		System.out.println("Student " + getName() + " like to get to know a intelligent person in his field") ; 
		
	}

	@Override
	public int compareTo(Student o) {
		if(this.getCourseYear() > o.getCourseYear()) return 1 ; 
		if(this.getCourseYear() < o.getCourseYear()) return -1 ; 
		return 0;
	}
}
