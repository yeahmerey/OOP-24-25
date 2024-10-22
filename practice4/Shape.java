package practice4 ; 

public abstract class Shape{
	
	public int position ; 
	public Color color ;
	
	public Shape(int position , Color color) {
		this.color = color ; 
		this.position = position ; 
	}
	
	public abstract void draw() ; 
	
	public String toString() {
		return "Shape{ " ; 
	}
}