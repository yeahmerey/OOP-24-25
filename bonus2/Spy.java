package bonus;

public class Spy extends Person{
	private boolean spyTrue ; 
	
	public Spy(int key) {
		super(key);
		this.spyTrue = SpyChecker.checkCondition(key); 
	}
	public boolean isSpy() {
		return spyTrue; 
	}
	@Override 
	public String toString() {
		return super.toString() + (spyTrue ? "Spy!": " NOT SPY::"); 
	}
}
