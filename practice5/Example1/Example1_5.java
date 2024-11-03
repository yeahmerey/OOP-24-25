public class Example1_5
{
    public static void main(String[] args)
    {
	int     denominator, numerator, ratio;


	numerator   = 5;
	//denominator = 2; 
    denominator = 0 ;
    if(denominator == 0){
        throw new ArithmeticException("Den is zero"); 
    }
    ratio = numerator / denominator ; 
    System.out.println("Done."); // Don't move this line
    }
}
