package problem1;

public class Data {
	private double sum ; 
	private double max ; 
	private double count ; 
	public Data() {
		sum = 0 ; max = 0 ; count = 0 ;
	}
	public void addValue(double data) {
		count++; 
		sum += data ; 
		max = (data > max ? data : max);
	}
	public double getAverage() {
		if(count == 0) return 0 ; 
		else return sum / count ; 
	}
	public double getMax() {
		return max; 
	}
}
