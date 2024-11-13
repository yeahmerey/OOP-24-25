package task2;

public class auylTest {
	public static void main(String[] args) {
		System.out.println() ;
		Cow bessie = new Cow("Bessie" , 5) ;
		System.out.println(bessie.info()); 
		bessie.peopleCanMove();
		bessie.canMoveItself();
		
		Fridge f1 = new Fridge(); 
		System.out.println(f1.info());
		f1.peopleCanMove(); 
		//f1.canMoveItself() - "ERROR" :( 
	}
}
