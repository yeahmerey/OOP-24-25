package practice6;

public class Test {
	public static void main(String[] args) {
			
		Cat barsik = new Cat("Barsik") ;
		Person person  = new Person("Merey", 18); 
		Student student = new Student("Amir" , 17 , 3.1);
		
		
		Restaurant r = new Restaurant() ; 
		System.out.println(r.servePizza(barsik));
		System.out.println(r.servePizza(person)); 
		
		barsik.eatPizza();
		student.eatPizza();
		person.eatPizza(); 
		
		try {
			student.setGpa(-1); 
		}catch(Exception e) {
			System.err.println(e.getMessage()); 
		} 
		System.out.println("Retake status :"); 
		student.retakeStatus();
		
		/*
		try {
			student.setGpa(-1);
		} catch (Exception e) {
			System.err.println(e.getMessage()); 
		}*/
		
		//if(student.getGpa() < 0 ) {
		//	throw new ArithmeticException("it is not possible") ;
		//}
	}
}
