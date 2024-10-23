package Shapes3d;
import java.util.* ; 
public class Runner {
	public static void main(String[] args) { 
		//Cylinder	
		Cylinder cylinder = new Cylinder(3,5); 
		System.out.println(cylinder.toString()); 
		System.out.println("Volume of cylinder : " + cylinder.volume());
		System.out.println("Surface area of cylinder : " + cylinder.surfaceArea()); 
	
		//Sphere
		Sphere sphere = new Sphere(5); 
		System.out.println(sphere.toString()); 
		System.out.println("Volume of sphere : " + sphere.volume()); 
		System.out.println("Surface area of sphere : " + sphere.surfaceArea()); 
		
		//Cube
		Cube cube = new Cube(3); 
		System.out.println(cube.toString()) ;
		System.out.println("Volume of cube : " + cube.volume()); 
		System.out.println("Surface area of cube : " + cube.surfaceArea()); 
	
	}
}
/*
для бесконечный инпутта можно использовать switch case :
while(run){
	options System.out.println() ;
	int n = sc.nextInt() ;
	switch(n){
		case 1 : 
			double r = sc.nextDouble ; 
			double h = sc.nextDouble ;
			Cylinder c = new Cylinder(r,h); 
	}
 */