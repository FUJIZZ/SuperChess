package model;

import java.util.List;

public class Knight extends Piece {
    
        public Knight(boolean white, int x, int y) {
            super(white, "knight", x, y);
        }

        @Override
        public List<int[]> getPossibleMoves(Board board) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getPossibleMoves'");
        }
    
}
