package task1;

public class Electronics extends Product implements Discount , Returnable , Shippable{
	private boolean popular ; 
	public Electronics(String name , int price , int count , boolean popular) {
		super(name , price , count) ; 
		this.popular = popular ;
	}
	
	@Override 
	public boolean canApplyDiscount() {
		return (getPrice() > 500000 || !(popular)) ? true : false ; 
	}
	@Override
	public int calculateFinalPrice() {
		return getPrice(); 
	}	
	@Override
	public void description() {
		System.out.println("It is electronics ! - name :" + name + ", price :" + getPrice()) ;
	}
	@Override 
	public void applyDiscount() {
		if(canApplyDiscount()) {
			System.out.println("We can add discount for this product") ; 
			int newPrice = getPrice() - (getPrice() * discountPersentage / 100);
			setPrice(newPrice); 
		}
		else {
			System.out.println("We cannot add discount !"); 
		}
	}
	@Override 
	public boolean canBeReturned() {
		if(getPrice() > 100000 || (popular)) {
			return true ; 
		}
		else {
			return false;  
		}
	}
	@Override
	public void getReturnPolicy() {
		System.out.println("Electronic devices should not be broken!") ; 
	}
	@Override 
	public void freeShippable() {
		if(getPrice() > minPriceForShip) {
			System.out.println("Wowww , we can do delivery freeee : )") ;
		}
		else {
			System.out.println("Your device is not large than min price for delivery :( , you neeed pay 500 KZT !"); 
		}
	}

	public boolean isPopular() {
		return popular;
	}

	public void setPopular(boolean popular) {
		this.popular = popular;
	}
}
