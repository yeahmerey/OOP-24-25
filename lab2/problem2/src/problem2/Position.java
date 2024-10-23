package problem2;

public class Position {
	public char letter ; 
	public int number ; 
	
	public Position(char letter , int number) {
		if(letter >= 'a' && letter <='h' && number >=1 && number <= 8 ){
			this.letter = letter ; 
			this.number = number ; 
		}
		else {
			this.letter = 'w' ;
			this.number = 0 ; 
		}
	}
}
