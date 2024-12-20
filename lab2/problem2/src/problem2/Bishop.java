package problem2;

public class Bishop extends Piece{
	public Bishop(Position currentPosition) {
		super(currentPosition); 
	}
	
	public static boolean move(Position currentPosition , Position nextPosition) {
		if(currentPosition.letter == nextPosition.letter && currentPosition.number == nextPosition.number) {
			return false; 
		}
		int l = Math.abs(currentPosition.letter - nextPosition.letter); 
		int n = Math.abs(currentPosition.number - nextPosition.number); 
		return l == n ;  
	}
	@Override 
	public boolean isLegalMove(Position nextPosition) {
		return rightMove(nextPosition) && move(this.currentPosition , nextPosition); 
	}
}

