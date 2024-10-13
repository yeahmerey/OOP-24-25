package problem2;

public class StarTriangle {
	int width ; 
	public StarTriangle(int width) {
		this.width = width ; 
	}
	public String toString() {
		String triangle = ""; 
		for(int i = 0 ; i < width ; i++) {
			for(int j = 0 ; j < i + 1 ; j++) {
				triangle +="[*]";
			}
			triangle+="\n";
		}
		return triangle ; 
	}
}
