package view;

import model.Piece.PieceType;

public class PieceView {

    public void printPiece(PieceType pieceType) {
        System.out.println("Piece: " + pieceType.toString());
    }
    
}
