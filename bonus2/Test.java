package bonus;

public class Test{
	public static void main(String[] args) {
		Spy[] people = new Spy[5] ;
		for(int i = 0 ; i < people.length ; i++) {
			int randomKey = SpyChecker.generateRandomNum(); 
			people[i] = new Spy(randomKey);
			System.out.println(people[i]); 
		}
		SpyChecker.checkSpies(people);
		SpyChecker1.checkSpies(people);
	}	
}





