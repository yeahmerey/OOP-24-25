package problem2;

public abstract class Piece {
	Position currentPosition ; 
	
	public Piece(Position cur) {
		this.currentPosition = cur;  
	}
	public static boolean rightMove(Position nextPosition) {
		return nextPosition.letter >= 'a' && nextPosition.letter <= 'h' && nextPosition.number >= 1 && nextPosition.number <=8 ; 
	}
	public abstract boolean isLegalMove(Position nextPosition); 
}
