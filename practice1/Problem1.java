package practice1; 
import java.util.Scanner ;

public class Problem1{
    public static void printName(String name){
    	System.out.print("+"); 
    	for(int i = 0 ;i < name.length() ; i++) {
    		System.out.print('-');
    	}
    	System.out.println('+');
    	System.out.println('|' + name + '|');
    	System.out.print("+"); 
    	for(int i = 0 ;i < name.length() ; i++) {
    		System.out.print('-');
    	}
    	System.out.println('+');
    }
    public static void main(String[] args){
    	System.out.print("Enter name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        printName(name);
    }
}