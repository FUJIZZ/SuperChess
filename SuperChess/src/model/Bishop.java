package model;

import java.util.List;

public class Bishop extends Piece{
    
        public Bishop(boolean white, int x, int y) {
            super(white, "bishop", x, y);
        }

        @Override
        public List<int[]> getPossibleMoves(Board board) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getPossibleMoves'");
        }
    
        
    
}
