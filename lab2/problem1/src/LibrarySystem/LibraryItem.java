package LibrarySystem;

public abstract class LibraryItem {
	
	private String title; 
	private String author ; 
	private int publicationYear ; 
	
	public LibraryItem(String title , String author , int publicYear) {
		this.title = title ; 
		this.author = author ; 
		this.publicationYear = publicYear; 
	}
	
	public void setTitle(String title) {
		this.title = title ; 
	}
	public void setAuthor(String authorName) {
		this.author = authorName ; 
	}
	public void setPublicationYear(int publicYear) {
		this.publicationYear = publicYear ; 
	}
	public String getTitle() {
		return title ; 
	}
	public String getAuthor() {
		return author ; 
	}
	public int getPublicationYear() {
		return publicationYear ; 
	}
	
	public String toString() {
		return "Item : { title = " + title + " , author = " + author + " ,publication Year = " + publicationYear + "}" ;  
	}
}
