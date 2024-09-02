package model;

import java.util.List;

public class King extends Piece {

    private boolean hasMoved;

    public King(boolean white, int x, int y) {
        super(white, "king", x, y);
        this.hasMoved = false;
    }

    @Override
    public List<int[]> getPossibleMoves(Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPossibleMoves'");
    }

    
    
}
