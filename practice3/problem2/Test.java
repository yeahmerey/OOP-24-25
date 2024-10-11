package problem2;
import java.util.Scanner ;
import java.util.Vector;
public class Test {
	public static void main(String[] args) {
		System.out.println("If you want : \n *Add person - 1 \n * Add student - 2 \n  * Add staff - 3 \n Info print - 4 \n Exit - 5");
		Vector<Person> people = new Vector<Person>(); 
		Scanner input = new Scanner(System.in); 
		while(true) {
			int type = input.nextInt();
			if(type == 1){
                Person p = new Person("Merey" , "Aktobe");
                people.add(p) ;
                System.out.println("ADD completed!");
            }
            else if(type == 2){
                Person p = new Student("Mike" , "London" , "CSS" , 2 , 3.15);
                people.add(p) ;
                System.out.println("ADD completed!");
            }
            else if(type == 3){
                Person p = new Staff("Amir" , "Qyzylorda" , "125" , 300.5 );
                people.add(p) ;
                System.out.println("ADD completed!");
            }
            else if(type == 4){
                for(Person p : people){
                    System.out.println(p);
                }
            }
            else if(type == 5){
                break ;
            }
			
		}
	}
}
