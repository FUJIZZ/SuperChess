package model;

import java.util.List;

public class Queen extends Piece {

    public Queen(boolean white, int x,int y) {
        super(white, "queen", x, y);
    }

    @Override
    public List<int[]> getPossibleMoves(Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPossibleMoves'");
    }

    
}
