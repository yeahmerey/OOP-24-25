package Shapes3d;

import java.util.* ; 

public class Cylinder extends Shape3D {
	
	private double radius , height ; 
	
	public Cylinder(double r , double h) {
		this.radius = r;  
		this.height = h ; 
	}
	public void setRadius(double radius) {
		this.radius = radius ; 
	}
	public void setHeight(double height) {
		this.height = height ; 
	}
	public double getRadius() {
		return radius ; 
	}
	public double getHeight() {
		return height ; 
	}
	@Override 
	public double volume() {
		return Math.PI * radius * radius * height ;  
	}
	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height ; 
	}
	@Override
	public String toString() {
		return super.toString() + "{ Cylinder , radius = " + radius + " , height = " + height + " }" ; 
	}
}
