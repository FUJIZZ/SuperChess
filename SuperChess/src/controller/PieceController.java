package controller;

import model.Piece;
import view.PieceView;

public class PieceController {
    private Piece piece;
    private PieceView pieceView;

    public PieceController(Piece piece, PieceView pieceView) {
        this.piece = piece;
        this.pieceView = pieceView;
    }
}
