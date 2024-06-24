package view;

import controller.BoardController;
import model.Piece;

public class BoardView {

    public void printPiece(Piece piece) {
        if(piece == null) {
            System.out.print(". ");
        } else {
            System.out.print(piece.getName().charAt(0) + " ");
        }
    }

    public void printBoard(BoardController boardController) {
        System.out.println("Board: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                printPiece(boardController.getPiece(i, j));
            }
            System.out.println();
        }
    } 
    
}
