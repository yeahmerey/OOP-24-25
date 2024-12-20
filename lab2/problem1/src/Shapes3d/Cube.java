package Shapes3d;

public class Cube extends Shape3D {
	
	private double edge ; 
	
	public Cube(double a) {
		this.edge = a ;
	}
	public void setEdge(double a) {
		this.edge = a ;
	}
	public double getEdge() {
		return edge ;
	}
	@Override
	public double volume() {
		return edge * edge * edge ;
	}
	@Override
	public double surfaceArea() {
		return 6 * edge * edge ; 
	}
	
	@Override 
	public String toString() {
		return super.toString() + "{ Cube , edge = " + edge + " }";   
	}
}
