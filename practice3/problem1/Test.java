package problem1 ;
public class Test{
	public static void main(String[] args) {
		Cat cat = new Cat("Barsi" , 1 , "white"); 
		
		System.out.println(cat); 
		System.out.println(cat.voice()); 
		System.out.println(cat.voice(5)); 
	}
}