package problem2;

public class Queen extends Piece{
	public Queen(Position currentPosition) {
		super(currentPosition); 
	}
	public static boolean move(Position currentPosition , Position nextPosition) {
		if(currentPosition.letter == nextPosition.letter && currentPosition.number == nextPosition.number) {
			return false; 
		}
		return Bishop.move(currentPosition, nextPosition) || Rook.move(currentPosition, nextPosition);  
	}
	@Override
	public boolean isLegalMove(Position nextPosition) {
		return rightMove(nextPosition) && move(this.currentPosition , nextPosition); 
	}
}
