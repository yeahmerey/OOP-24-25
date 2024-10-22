package bonus;

public class Book {
	private String nameOfBook ; 
	private boolean access ; 
	private String takerName ; 
	
	public Book(String name) {
		this.nameOfBook = name ; 
		this.access = true ; 
		this.takerName = null ; 
	}
	public String getNameOfBook() {
		return nameOfBook ; 
	}
	public boolean isAccess() {
		return access ;
	}
	public String getTakerName() {
		return takerName;  
	}
	
	public void take(String reader) {
		if(access) {
			takerName = reader ; 
			System.out.println(reader + " is took the book " + nameOfBook); 
			access = false; 
		}
		else {
			System.out.println("Book is not aviable , because " + takerName + " has already took the book " + nameOfBook); 
		}
	}
	public void returnBack() {
		if(access) {
			System.out.println("The book " + nameOfBook + " is already available!"); 
		}
		else {
			System.out.println(takerName + " returned the book" + nameOfBook); 
			access = true ;
			takerName = null ; 
		}
	}
}
