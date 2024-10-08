package practice1;
import java.util.Scanner; 
public class Problem5 {
	public static void newBalance(int initial , int procent) {
		System.out.print(initial + (initial * procent/100));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter a initial balance and procent in a row : ");
		int i = input.nextInt() , p = input.nextInt() ;
		newBalance(i , p); 
	}
}
