package problem4;

public class Test {
	public static void main(String[] args) {
		
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0); 
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a, b) ; 
		Circuit g = new Parallel(c , d); 
		Circuit h = new Series(g,e); 
		Circuit circuit = new Parallel(h , f);
		circuit.applyPotentialDiff(8);
		double R = circuit.getResistance();
		double I = circuit.getPower(); 
		double U = circuit.getPotentialDiff() ;
		System.out.println("resistance" + R + " | power :" + I + " | U :  " + U); 
		/*
		Resistor r1 = new Resistor(100); 
		Resistor r2 = new Resistor(150); 
		Resistor r3 = new Resistor(300); 
		
		Parallel p = new Parallel(r1, r3) ;
		Series s = new Series(p , r3); 
		s.applyPotentialDiff(8);
		System.out.println(s.getResistance() + "Ом");
		System.out.println(r1.getPotentialDiff() + "В");
		System.out.println(r1.getPower() + "Вт");
	*/}
}
