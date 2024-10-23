package problem2;

public class Pawn extends Piece{
	private int countMove = 0 ; 
	
	public Pawn(Position currentPosition) {
		super(currentPosition); 
	}
	public static boolean move(Position currentPosition , Position nextPosition) {
		if(currentPosition.letter == nextPosition.letter && currentPosition.number == nextPosition.number) {
			return false; 
		}
		int n = Math.abs(currentPosition.number - nextPosition.number); 
		return (n == 1 || n == 2) ;
	}
	@Override 
	public boolean isLegalMove(Position nextPosition) {
		int n = Math.abs(currentPosition.number - nextPosition.number); 
		if(countMove == 0) 
			return rightMove(nextPosition) && move(this.currentPosition , nextPosition);
		else {
			return rightMove(nextPosition) && n == 1 ; 
		}
	}
	
}
