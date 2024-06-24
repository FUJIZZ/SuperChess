package model;

public class Pawn extends Piece {

    private boolean hasMoved;

    public Pawn(boolean white, int x, int y) {
        super(white, "pawn", x, y);
        this.hasMoved = false;
    }

    @Override
    public boolean isValidMove(Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }
    
}
