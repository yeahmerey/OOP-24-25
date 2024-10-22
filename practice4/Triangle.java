package practice4;

public class Triangle extends Shape {
	public int height ; 
	public Triangle(int position , Color color , int height) {
		super(position , color) ; 
		this.height = height  ;
	}
	@Override
	public void draw() {
		String empty = "" ; 
		for(int i = 0 ; i < position ; i++) {
			empty += " "; 
		}
		if(color == Color.RED) {
			System.err.println(empty + "   /\\    ");
			System.err.println(empty + "  /  \\   ");
			System.err.println(empty + " /    \\  ");
			System.err.println(empty + "/______\\ ");
		}
		else {
			System.out.println(empty + "   /\\    ");
			System.out.println(empty + "  /  \\   ");
			System.out.println(empty + " /    \\  ");
			System.out.println(empty + "/______\\ ");
		}
	}
	@Override 
	public String toString() {
		return super.toString() + "Triangle starts from position : " + position + " and ends in the position : " + (position + 8) + " , color : " + color + ", the height of shape : 5 } \n height is equal to : " + height;
	}
}
