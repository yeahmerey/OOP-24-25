package practice4 ; 

public class Circle extends Shape{
	
	private int radius; 
	public Circle(int position , Color color , int radius) {
		super(position , color);
		this.radius = radius ;
	}
	
	@Override 
	public void draw() {
		String empty = ""; 
		for(int i = 0 ; i < position ; i ++) {
			empty+=" "; 
		}
		if(color == Color.RED) {
			System.err.println(empty + "  .***. ");
			System.err.println(empty + " *     *");
			System.err.println(empty + " *     *");
			System.err.println(empty + "  '***' ");
		}
		else {
			System.out.println(empty + "  .***. ");
			System.out.println(empty + " *     *");
			System.out.println(empty + " *     *");
			System.out.println(empty + "  '***' ");
		}
	}
	@Override
	public String toString() {
		return super.toString() + "Circle starts from position : " + position + " and ends in the position : " + (position + 7) + " , color : " + color + ", the height of shape : 4 }\n Radius : " + radius;
	}
}