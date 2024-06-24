package model;

public class Rook extends Piece {

    private boolean hasMoved;

    public Rook(boolean white, int x, int y) {
        super(white, "rook", x, y);
        this.hasMoved = false;
    }

    public boolean isValidMove(Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }
    
    
}
