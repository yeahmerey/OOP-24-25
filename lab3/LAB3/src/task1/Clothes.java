package task1;

public class Clothes extends Product implements SeasonalDiscount{
	
	String season ; 
	
	public Clothes(String name , int price , int count , String season) {
		super(name , price , count) ; 
		this.season = season ; 
	}
	@Override
	public void applyDiscount() {
		if(canApplyDiscount()) {
			System.out.println("Wowww , DISCOUNT - DISCOUNT - DISCOUNT for your " + name) ;
			if(canApplyDiscount() && season.toLowerCase() == "fall") {
				int newPrice =  getPrice() - (getPrice() * SeasonalDiscount.discountPersentage / 100) ; 
				setPrice(newPrice) ; 
			}
			else if(canApplyDiscount() && season.toLowerCase() == "winter") {
				int newPrice =  getPrice() - (getPrice() * Discount.discountPersentage / 100) ; 
				setPrice(newPrice); 
			}
		}
	}
	@Override
	public boolean canApplyDiscount() {
		if(season.toLowerCase() == "winter" ||  season.toLowerCase() == "fall" || getCount() < 3) {
			return true; 
		}
		else {
			return false ; 
		}
	}
	@Override 
	public int calculateFinalPrice() {
		return getPrice() ;
	}
	@Override
	public void description() {
		System.out.println("it is clothes , and name is :" + name + " price is :" +getPrice() + " count is :" + getCount() ) ;
	}
	@Override
	public void setSeason(String season) {
		this.season = season ; 
	}
	@Override 
	public String getSeason() {
		return this.season;  
	}
}
