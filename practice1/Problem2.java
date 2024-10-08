package practice1;

import java.util.Scanner; 

public class Problem2 {
	public static void Result(int a) {
		System.out.println("Area is equal to : "  + a * a) ;
		System.out.println("Perimeter is equal to : " + 4 * a) ; 
		System.out.println("Lenght of diagonal is equal to : " + Math.sqrt(2) * a) ; 
	}
	public static void main(String[] args) {
		System.out.print("Enter a : ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(); 
		Result(a); 
	}

}
