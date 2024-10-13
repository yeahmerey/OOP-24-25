package problem4;
import java.util.Scanner;
import practice2.problem1.Student ;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101" , "Object-oriented Programming" , 3 , "Programming Basics");

        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i ++){
            System.out.print("enter student name : ");
            String name = sc.next();
            System.out.print("enter id : ");
            String id= sc.next();
            System.out.print("enter grade : ");
            double grade = sc.nextDouble();

            gradeBook.addStudent(new Student(name , id , grade));

        }
        gradeBook.displayGradeReport();
    }
}