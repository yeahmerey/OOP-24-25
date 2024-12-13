package bonusTask;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		System.out.println(); 
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Input world size : x = ");
		int row = sc.nextInt() ;
		System.out.print("Input world size : y = ");
		int col = sc.nextInt() ; 
		
		MinecraftWorld world = new MinecraftWorld(row , col) ; 
		
		System.out.print("Input slime coordinates : (x y) = ");
	    int slimeX = sc.nextInt(); 
	    int slimeY = sc.nextInt();
	    System.out.print("Input slime's experience :");
	    int e = sc.nextInt() ; 
	    Slime slime = new Slime(slimeX , slimeY , e); 
	    world.placeEntity(slimeX, slimeY, 1);
	    
	    System.out.println("Input food's coordinates : (x y) = "); 
	    int foodX = sc.nextInt() ; 
	    int foodY = sc.nextInt() ;
	    Food food = new Food(foodX , foodY); 
	    world.placeEntity(foodX, foodY, 2);
	    
	    System.out.println("Minecraft World  :") ;
	    world.displayWorld();
	    
	    boolean reachable = world.isFoodReachable(slime, food) ;
	    
	    if(reachable) {
	    	System.out.println("Slize can reachable food"); 
	    }
	    else {
	    	System.out.println("Slize cannot reachable food") ; 
	    }
	    
	}
}
