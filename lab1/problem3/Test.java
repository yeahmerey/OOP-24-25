package problem3;
import java.util.* ; 
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t1 = input.nextInt(); 
		char s1 = input.next().charAt(0);
		Temperature temp = new Temperature(t1 , s1);
		System.out.println("Temperature in F: " + temp.toFahrenheit(t1, s1)  + " , Temperature in C : " + temp.toCelsius(t1, s1)); 
	}
}
