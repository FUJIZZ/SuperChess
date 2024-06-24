package model;

public class King extends Piece {

    private boolean hasMoved;

    public King(boolean white, int x, int y) {
        super(white, "king", x, y);
        this.hasMoved = false;
    }

    public boolean isValidMove(Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }
    
}
