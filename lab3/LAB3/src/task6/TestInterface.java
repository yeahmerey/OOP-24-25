package task6;

import java.util.Collections;
import java.util.* ; 
public class TestInterface {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println();
		Dog d = new Dog("Barsik" , 2) ;
		Dog d1 = new Dog("Cooper" , 3) ; 
		Dog d2 = new Dog("Charlie" , 1) ; 
		d.lastAction() ; 
		d.interest();
		List<Dog> dogs = new ArrayList<>() ; 
		dogs.add(d) ; dogs.add(d1) ; dogs.add(d2) ; 
		Collections.sort(dogs);
		System.out.println("--After sort by Age--");
		for(Dog dog : dogs) {
			System.out.print(dog.getName() + " ") ; 
		}
		System.out.println() ; 
		//---------------//
		PhdStudent p = new PhdStudent("Berlin" , 23 , 3.51); 
		PhdStudent p1 = new PhdStudent("Moscow" , 25 , 3.02); 
		PhdStudent p2 = (PhdStudent) p.clone();  
		PhdStudent p3 = new PhdStudent("Almaty" , 16 , 3.15); 
		List<PhdStudent> phdler = new ArrayList<>() ;
		phdler.add(p); phdler.add(p1) ; phdler.add(p2) ; phdler.add(p3) ; 
		Collections.sort(phdler);
		for(PhdStudent phd : phdler) {
			System.out.println(phd.getGpa() + " " + phd.getName()); 
		}
		p.lastAction(); 
		p.interest(); 
	}
}
