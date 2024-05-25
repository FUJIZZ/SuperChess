package model;

import tools.Position;

public class Knight extends Piece {
    
        public Knight(boolean white, Position position) {
            super(white, position, "N");
        }
    
        public boolean isValidMove(Position newPosition, Board board) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
        }
    
}
