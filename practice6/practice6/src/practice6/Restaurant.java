package practice6;

public class Restaurant {
	public boolean servePizza(CanHavePizza eater) {
		if(eater instanceof Person) {
			Person p = (Person) eater ; 
			return p.pay(); 
		}
		return false; 
	}
}
