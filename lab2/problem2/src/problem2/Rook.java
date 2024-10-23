package problem2;

public class Rook extends Piece{
	public Rook(Position currentPosition) {
		super(currentPosition); 
	}
	public static boolean move(Position currentPosition ,Position nextPosition ) {
		if(currentPosition.letter == nextPosition.letter && currentPosition.number == nextPosition.number) {
			return false; 
		}
		return (currentPosition.letter == nextPosition.letter && currentPosition.number != nextPosition.number)
			|| (currentPosition.letter != nextPosition.letter && currentPosition.number == nextPosition.number); 	
	}
	@Override
	public boolean isLegalMove(Position nextPosition) {
		return rightMove(nextPosition) && move(this.currentPosition , nextPosition);
	}
}
