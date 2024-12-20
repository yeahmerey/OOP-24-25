package LibrarySystem;

public class Magazine extends LibraryItem {
	
	private int numberOfPages ;
	private double price ; 
	
	public Magazine(String title , String authorName , int publicYear , int pageCount , double price) {
		super(title , authorName , publicYear); 
		this.numberOfPages = pageCount ;
		this.price = price ;
	}
	
	public void setNumberOfPage(int numberOfPages){
		this.numberOfPages = numberOfPages ;
	}
	public int getNumberOfPages() {
		return numberOfPages ; 
	}
	public void setPrice(double price) {
		this.price = price ; 
	}
	public double getPrice() {
		return price ; 
	}
	public String chooseMagazine() {
		if((getPublicationYear() > 2020 || numberOfPages < 100) && price < 100) {
			return  "I choose this Magazine" ; 
		}
		else {
			return "I not choose this Magazine , it is so old or very long and price is very high :( " ;  
		}
	}
	public void raisePrice() {
		System.out.println( getAuthor() + " raised the price to " + getPrice()) ; 
	}
	@Override 
	public String toString() {
		return super.toString() + " Magazine { number of Pages : " + numberOfPages + " }";  
	}
}
