package practice4 ;

public class testShape{
	public static void main(String[] args) {
		System.out.println(); 
		
		Circle c = new Circle(10, Color.WHITE , 5) ; 
		c.draw();
		System.out.println(c.toString()); 
		
		Rectangle r = new Rectangle(4 , Color.RED , 5 , 3) ;
		r.draw();
		System.out.println(r.toString());
		
		Triangle t = new Triangle(8 , Color.WHITE, 5); 
		t.draw();
		System.out.println(t.toString()); 
	}
}