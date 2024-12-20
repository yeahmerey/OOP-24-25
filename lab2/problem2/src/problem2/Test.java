package problem2;

public class Test {
	public static void main(String[] args) { 
		King k = new King(new Position('a', 1));
	    System.out.println(k.isLegalMove(new Position('b', 2)));
	    System.out.println(k.isLegalMove(new Position('a', 1))); 
	    
	    Rook r = new Rook(new Position('a', 1));
	    System.out.println(r.isLegalMove(new Position('a', 1)));
	    System.out.println(r.isLegalMove(new Position('b' , 2))) ;
	    
	    Bishop b = new Bishop(new Position('a', 1));
	    System.out.println(b.isLegalMove(new Position('c', 3)));
	    System.out.println(b.isLegalMove(new Position('b',4)));
	
	    Queen q = new Queen(new Position('a', 1));
	    System.out.println(q.isLegalMove(new Position('c', 3)));
	    System.out.println(q.isLegalMove(new Position('c',2))); 

	    Knight kn = new Knight(new Position('a', 1));
	    System.out.println(kn.isLegalMove(new Position('b', 3)));
	    System.out.println(kn.isLegalMove(new Position('b' , 4))); 
	    //---///
	    Piece p1 = new Pawn(new Position('a' ,3));
	    //Pawn p2 = new Piece(new Position('b', 4); 
	    //--// ; 
	    
	    Pawn p = new Pawn(new Position('a', 2));
	    System.out.println(p.isLegalMove(new Position('a', 3)));
	    System.out.println(p.isLegalMove(new Position('b', 2)));
	    System.out.println(p.isLegalMove(new Position('a',4))); 
	}
}
