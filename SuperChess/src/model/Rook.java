package model;

import java.util.List;

public class Rook extends Piece {

    private boolean hasMoved;

    public Rook(boolean white, int x, int y) {
        super(white, "rook", x, y);
        this.hasMoved = false;
    }

    @Override
    public List<int[]> getPossibleMoves(Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPossibleMoves'");
    }

    
    
}
