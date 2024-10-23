package LibrarySystem;

public class Magazine1 extends LibraryItem{
	
	public int countPage ;
	public int price ; 
	
	public Magazine1(String title , String author , int publicYear , int countPage , int price) {
		super(title , author , publicYear);
		this.countPage =countPage ; 
		this.price = price ; 
	}
	@Override
	public String toString() {
		return super.toString() + " Magazine1 : countOfPage" + countPage ;  
	}
	public void chooseMagazine() {
		if(price < 100 ) {
			System.out.println("Yes , I choose this magazine") ;
		}
		else {
			System.out.println("No");
		}
	}
	public void raisePrice() {
		price +=100 ; 
	}
}
