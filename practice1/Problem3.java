package practice1;

import java.util.Scanner;
public class Problem3 {
	public static void Result(int grade){
		if(grade >= 95) {
			System.out.print("Your grade is A");
		}
		else if(grade < 95 & grade >=90) {
			System.out.print("Your grade is A-");
		}
		else if(grade < 90 & grade >=85) {
			System.out.print("Your grade is B+");
		}
		else if(grade < 85 & grade >=80) {
			System.out.print("Your grade is B-");
		}
		else {
			System.out.print("Your grade less than B- :(");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade : ");
		int grade = input.nextInt(); 
		Result(grade); 
	}
}
