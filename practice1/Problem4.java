package practice1;
import java.util.Scanner;

public class Problem4 {
	public static void Solve(int a , int b , int c) {
		double d = Math.sqrt(b * b - 4 * a * c); 
		if(d < 0) {
			System.out.print("Your D is less than 0 :(");
		}
		else if(d == 0) {
			double x = (-1 * b)  / (2 * a);  
			System.out.print("x1 = " + x + " x2 = " + x);
		}
		else {
			double x1 = (-1 * b + d)  / (2 * a);
			double x2 = (-1 * b - d) / (2 * a);
			System.out.print("x1 = " + x1 + " x2 = " + x2);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a , b , c in a row : ");
		int a = input.nextInt() , b = input.nextInt(), c = input.nextInt() ; 
		Solve(a , b,  c) ;
	}
}
