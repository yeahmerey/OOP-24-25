package problem5;
import java.util.* ;
public class DragonLaunch {
	public static Vector<Person> v = new Vector<Person>(); 
	public static void kidnap(Person p) {
		v.addElement(p);
	}
	public static boolean willDragonEatOrNot() {
		if(v.size()%2 == 1) {
			return true ; 
		}
		int bcnt = 0 ;
		int leaves = 0 ;
		for(Person current : v) {
			if(current.gender == Gender.B) {
				bcnt++ ; 
			}
			if(bcnt == 0 && current.gender == Gender.B) {
				return true ; 
			}
			else if(bcnt > 0 && current.gender == Gender.B) {
				leaves+=2;
				bcnt--; 
			}
		}
		return v.size() - leaves != 0 ; 
	}
}
