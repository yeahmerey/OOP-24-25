package practice1;

import java.util.Scanner;
public class Problem6 {
	public static void Check(String p) {
		String newt = "";
		for(int i = p.length()- 1; i >=0 ;i--) {
			newt+=p.charAt(i);
		}
		if(p.equals(newt)) {
			System.out.print("YES , it is palindrome");
		}
		else {
			System.out.print("NO , it is NOT palindrome");
		}
		//System.out.print(newt + " " +p );
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text to check palindrome : ");
		String text = input.nextLine() ;
		Check(text); 
	}
}
