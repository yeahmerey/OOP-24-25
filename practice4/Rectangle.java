package practice4 ; 

public class Rectangle extends Shape{
	private int width , height ; 
	public Rectangle(int position , Color color, int width , int height) {
		super(position , color); 
		this.width = width ; 
		this.height = height ; 
	}
	@Override
	public void draw() {
		String empty = "" ; 
		for(int i = 0 ; i < position ; i++) {
			empty += " "; 
		}
		if(color == Color.RED) {
			System.err.println(empty + " ______ ");
			System.err.println(empty + "|      |");
			System.err.println(empty + "|______|");
		}
		else {
			System.out.println(empty + " ______ ");
			System.out.println(empty + "|      |");
			System.out.println(empty + "|______|");
		}
	}
	@Override 
	public String toString() {
		return super.toString() + "Rectangle starts from position : " + position + " and ends in the position : " + (position + 8) + " , color : " + color + ", the height of shape : 3 } \n Widht: " + width + ", height : " + height;
	}
} 