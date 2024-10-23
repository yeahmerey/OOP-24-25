package Character;
import java.util.*; 
public class Test {
	public static void main(String[] args) {
		HashSet<Character> characterSet = new HashSet<>(); 
		
		Character ch1 = new Character("SpongeBob" , 0); 
		Character ch2 = new Character("Deadpool" , 8);
		Character ch3 = new Character("Deadpool" , 8); 
		SpiderMan spiderman1 = new SpiderMan("Tobey" , 6 , 9); 
		SpiderMan spiderman2 = new SpiderMan("Andrew" , 7 , 9); 
		SpiderMan spiderman3 = new SpiderMan("Tom" , 9 , 10); 
		SpiderMan spiderman4 = new SpiderMan("Tobey" , 6 , 9); 
		
		characterSet.add(ch1); 
		characterSet.add(ch2);
		characterSet.add(ch3);//dublicat 
		characterSet.add(spiderman1);
		characterSet.add(spiderman2);
		characterSet.add(spiderman3);
		characterSet.add(spiderman4);//dublicat
		
		for(Character character : characterSet) {
			System.out.println(character); 
		}
		
	}
}
