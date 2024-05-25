package model;

import tools.Position;

public class Pawn extends Piece {

    public Pawn(boolean white, Position position) {
        super(white, position, "P");
    }

    @Override
    public boolean isValidMove(Position newPosition, Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }
    
}
