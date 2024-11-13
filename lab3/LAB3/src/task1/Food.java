package task1;

public class Food extends Product implements Discount{
	private int bbdyear ;///best before date ; 
	private char statistic ; //good , normal , bad ; 
	public Food(String name, int price, int count , int bbd, char statistic) {
		super(name, price, count);
		this.bbdyear = bbd;
		this.statistic = statistic ; 
		
	}
	public void setStatistic(char s) {
		this.statistic = s; 
	}
	@Override
	public int calculateFinalPrice() {
		return getPrice();  
	}
	@Override
	public void description() {
		System.out.println("It is food :) ~~~~ - name : " + name + " , price : " + getPrice() + ", best before date : " + bbdyear); 
	}
	@Override
	public void applyDiscount() {
		if(canApplyDiscount()) {
			System.out.println("Today discount for this food - " + name) ;  
			int newPrice = getPrice() - (getPrice() * discountPersentage / 100) ; 
			setPrice(newPrice); 
		}
		else {
			System.out.println("Today not have discount for - " + name) ;
		}
	}
	@Override
	public boolean canApplyDiscount() {
		if((bbdyear > 2024 && bbdyear < 2026 ) || statistic == 'b') {
			return true; 
		}
		else {
			return false ; 
		}
	}
	
}
