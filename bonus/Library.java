package bonus;
import java.util.*;
public class Library {
	public HashMap<String , Book> books = new HashMap<>() ;
	
	public void addNewBook(Book book) {
		books.put(book.getNameOfBook() , book) ;
		System.out.println("Added book : " + book.getNameOfBook()); 
	}
	
	public void takeBook(String name , String reader) {
		Book book = books.get(name); 
		if(book == null) {
			System.out.println("Book " + name + "is not avaiable in the library!"); 
		}
		else {
			book.take(reader);
		}
	}
	
	public void getBackBook(String name) {
		Book book = books.get(name); 
		if(book == null) {
			System.out.println("Book " + name + " is not available in the library");
		}
		else {
			book.returnBack();
		}
	}
	
	public void findBook(String name) {
		Book book = books.get(name); 
		if(book == null) {
			System.out.println("Book " + name + " is not available in the library");
		}
		else {
			if(book.isAccess()) {
				System.out.println("Book " + name + " is available" ); 
			}
			else {
				System.out.println(book.getTakerName() + " is already take the book " + name); 
			}
		}
	}
}
