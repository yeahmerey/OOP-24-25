package problem1;
import java.util.* ; 
public class Analyzer {
	public static void main(String[] args) {
		Data d = new Data();
		Scanner input = new Scanner(System.in);
		while(true) {
			 System.out.print("Enter number(Q to quit): ");
	            String data = input.nextLine();
	            if(data.equals("Q")){
	                break;
	            }
	            else{
	                double d1 = Double.parseDouble(data);
	                d.addValue(d1);
	            }
		}
		System.out.println("Average :" + d.getAverage());
		System.out.println("Maximum : " + d.getMax()); 
	}
}
