package bonusTask;

public class Slime {
	private final int x  ;
	private final int y ; 
	private final int experience; 
	
	public Slime(int x , int y , int e) {
		this.x = x ; 
		this.y = y ; 
		this.experience = e; 
	}
	public int getX() {
		return x ; 
	}
	public int getY() {
		return y ; 
	}
	public int getExperience() {
		return experience ; 
	}
	public String toString() {
		return "Slime's x : " + x + " , Slime's y : " + y +" and experience equal to " + experience ; 
	}
}
