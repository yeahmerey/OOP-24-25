package problem4;

public class Series extends Circuit{
	private Circuit c1 ; 
	private Circuit c2 ; 
	
	public Series(Circuit c1 , Circuit c2) {
		this.c1 = c1 ; 
		this.c2 = c2 ; 
	}
	
	@Override
	public double getResistance() {
		return c1.getResistance() + c2.getResistance() ; 
	}
	@Override 
	public double getPotentialDiff() {
		return c1.getPotentialDiff() + c2.getPotentialDiff(); 
	}
	@Override
	public void applyPotentialDiff(double V) {
		double total = getResistance() ;
		double v1 = V * (c1.getResistance() / total); 
		double v2 = V * (c2.getResistance() / total) ; 
		c1.applyPotentialDiff(v1); 
		c2.applyPotentialDiff(v2); 
	}
}
//R(total) = R1 + R2
//V1 = V(total) * (R1) / R(total); 