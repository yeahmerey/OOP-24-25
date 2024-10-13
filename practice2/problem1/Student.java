package problem1;

public class Student {
	String name ; 
	int id ; 
	int yearOfStudy; 
	static int countOfStudents ; 
	{
		countOfStudents ++ ; 
	}
	public Student(String studentName , int year) {
		this.name = studentName ; 
		this.yearOfStudy = year ; 
		id = countOfStudents ;
	}
	public String getName() {
		return name ;
	}
	public int getId() {
		return id ;
	}
	public void incrTheYearOfStudy() {
		this.yearOfStudy ++ ;
	}
	public String toString() {
		return "name of Student :" + name + ",id is " + id + ", year of study : " + yearOfStudy ;  
	}
}
