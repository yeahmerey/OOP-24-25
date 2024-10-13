package problem4;
import practice2.problem1.Student; 
import java.util.* ; 
public class GradeBook {
	private Course course ; 
	private List<Student> students; 
	
	public GradeBook(Course course) {
		this.course = course ; 
		this.students = new Array<>() ; 
	}
	public void addStudent(Student student) {
		students.add(student) ; 
	}
	public void displayMessage() {
		System.out.println("Welcome to the gradebook for " + course.toString());
	}
	public void displayGradeReport() {
        classAverage();
        bandw();
        barChart();
    }
    public void classAverage(){
        double sum = 0 ;
        for(Student student : students){
            sum += student.getGrade() ;
        }
        double average = sum / students.size() ;
        System.out.println("The average grade is " + average);
    }
    public void bandw(){
        if(students.isEmpty())return;
        Student b = students.get(0);
        Student w = students.get(0);
        for(Student student : students){
            if(student.getGrade() < w.getGrade()){
                w = student;
            }
            if(student.getGrade() > b.getGrade()){
                b =student;
            }
        }
        System.out.println("the best is" + b.getGrade());
        System.out.println("the worst is" + w.getGrade());
    }
    private void barChart(){
        int[] grdistribution = new int[11];
        for(Student student : students){
            int ind = (int) student.getGrade() / 10 ;
            grdistribution[ind]++;
        }
        System.out.println("Grades distribution:");
        for(int i = 0 ; i < grdistribution.length ; i++){
            if(i == 10){
                System.out.print("100: ");
            }
            else{
                System.out.printf("%02d-%02d: " , i * 10 , i * 10 + 9 );
            }
            for(int j = 0 ; j < grdistribution[i] ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
