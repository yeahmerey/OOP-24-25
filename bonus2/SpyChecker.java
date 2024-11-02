package bonus; 
import java.util.Random;
import java.util.*; 
public class SpyChecker {
	private static Random random = new Random() ;
	public static int generateRandomNum() {
		return 1 + random.nextInt(1024); 
	}
	
	public static boolean checkCondition(int key) {
		if(key > 0) {
			return ((key & (key-1)) == 0 ); 
		}
		return false;
	}
	public static void checkSpies(Spy[] people) {  
		Vector<Integer> spies = new Vector<>(); 
		for(Spy person : people) {
			if(person.isSpy()) { 
				spies.add(person.getKeyNumber()); 
			}
		}
		if(spies.size() == 1 || spies.size() == 5) {
			System.out.println("Detected Spies "+ spies.size()+" , and his key is : " + spies); 
		}
		else {
			System.out.println("Not found"); 
		}
	}
}
