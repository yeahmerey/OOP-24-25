package task1;

interface SeasonalDiscount extends Discount{
	int discountPersentage = 30; 
	void setSeason(String season) ; 
	String getSeason() ; 
}
