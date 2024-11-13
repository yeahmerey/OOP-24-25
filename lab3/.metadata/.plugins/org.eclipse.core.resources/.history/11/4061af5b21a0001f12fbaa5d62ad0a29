package problem5;

public class Test {
	public static void main(String[] args) {
		PhdStudent psnt = new PhdStudent("Miras" , 24 , 3.7) ; 
		Employee empl = new Employee("Suliman" , 35 , 5); 
		 
		PersonRegistry.addPerson(psnt); 
		PersonRegistry.addPerson(empl);
		
		Dog dog = new Dog("Barsik" , 2); 
		Cat cat = new Cat("Murka" , 5); 
		
		psnt.assignPet(cat);
		psnt.assignPet(dog);
		psnt.leavePet(cat, empl);
		PersonRegistry.seePersons();
		psnt.returnPetFrom(cat, empl);
		PersonRegistry.seePersons(); 
	}
}
