package task1;

public class purchasingTester {
	public static void main(String[] args) {
		System.out.println(); 
		Electronics laptop = new Electronics("ASUS TUF" , 300000 , 2 , true);
		laptop.description();
		laptop.applyDiscount();
		laptop.buyCustomer();
		System.out.println("Current count in our shop : " + laptop.getCount());  
		System.out.println("Final Price : "+ laptop.calculateFinalPrice());
		laptop.freeShippable();
		laptop.getReturnPolicy();
		System.out.println("Can be returned :" + laptop.canBeReturned());
		laptop.setPopular(false);
		laptop.applyDiscount();
		System.out.println("Final price :" + laptop.calculateFinalPrice()); 
	    System.out.println("------------------------"); 
		//-------------------------------------------------------------///
		Clothes jacket = new Clothes("NewYear jacket - collab. with MShop(Merey mens shop)" , 20000 , 5 , "winter"); 
		jacket.description();
		System.out.println("Current season : " + jacket.getSeason()); 
		jacket.applyDiscount();
		System.out.println("Final price : " + jacket.calculateFinalPrice()); 
		jacket.setSeason("fall") ;
		System.out.println("Changed season to : " + jacket.getSeason()); 
		jacket.applyDiscount();
		System.out.println("Final price : " + jacket.calculateFinalPrice()); 
		jacket.setSeason("summer");
		System.out.println("Changed season to : " + jacket.getSeason()); 
		System.out.println("Final price : " + jacket.calculateFinalPrice()); 
		System.out.println("---------------------");
		//--------///
		Food apple = new Food("Golden Apple from KZ" , 500 , 10 , 2025 , 'g'); 
		apple.description();
		apple.applyDiscount();
		System.out.println("Final price :" + apple.calculateFinalPrice()) ; 
		apple.setStatistic('b');
		apple.applyDiscount();
		System.out.println("Final price : " + apple.calculateFinalPrice()); 
		apple.buyCustomer() ; 
		apple.buyCustomer();
		apple.buyCustomer();
		System.out.println("After purchase count: " + apple.getCount()); 
	}
}
