package task1;

public abstract class Product {
	
	final String name ; 
	private int price ; 
	private int count  ;
	
	public Product(String name , int price , int count) {
		this.name = name ; 
		this.price = price ; 
		this.count = count ; 
	}
	
	public void setPrice(int price) {
		this.price = price ; 
	}
	public int getPrice() {
		return price ; 
	}
	public void setCount(int count) {
		this.count = count;
	}   
	public int getCount() {
		return count;
	}
	public void buyCustomer() {
		this.count -= 1; 
	}
	public boolean isAvailable() {
		return (count > 0) ; 
	}
	
	public abstract int calculateFinalPrice(); 
	public abstract void description();

	
	
}
