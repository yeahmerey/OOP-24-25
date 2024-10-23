package LibrarySystem;

public class Runner {
	public static void main(String[] args) { 
		Magazine1 m = new Magazine1("Balaqai" , "Daryn" , 2024 , 80 , 10 ); 
		System.out.println(m.toString());
		m.chooseMagazine(); 
		m.raisePrice(); 
		m.chooseMagazine();
	}
}
