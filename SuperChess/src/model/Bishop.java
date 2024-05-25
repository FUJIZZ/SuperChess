package model;

import tools.Position;

public class Bishop extends Piece{
    
        public Bishop(boolean white, Position position) {
            super(white, position, "B");
        }
    
        public boolean isValidMove(Position newPosition, Board board) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
        }
    
}
