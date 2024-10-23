package Shapes3d;

public class Sphere extends Shape3D {
	private double radius ; 
	public Sphere(double r) {
		this.radius = r ; 
	}
	public void setRadius(double radius) {
		this.radius = radius ; 
	}
	public double getRadius() {
		return radius ; 
	}
	@Override 
	public double volume() {
		return (4 / 3) * Math.PI * radius * radius * radius ; 
	}
	@Override 
	public double surfaceArea() {
		return 4 * Math.PI * radius * radius ; 
	}
	@Override
	public String toString() {
		return super.toString() + "{ Sphere , radius = " + radius + " }"; 
	}
}
