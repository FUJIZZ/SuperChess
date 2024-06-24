package view;

import model.Piece;

public class PieceView {

    public void printPiece(Piece piece) {
        System.out.println("Piece: " + piece.getName() + " " + piece.getX() + " " + piece.getY() + " " + piece.isWhite());
    }

    
    
}
