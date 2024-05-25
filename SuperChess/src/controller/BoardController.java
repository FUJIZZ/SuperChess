package controller;

import view.BoardView;
import model.*;
import tools.Position;

public class BoardController {
    private Board board;
    private BoardView boardView;

    public BoardController(Board board, BoardView boardView) {
        this.board = board;
        this.boardView = boardView;

        initBoard();
    }

    private void initBoard() {
        // Initialize the board
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                board.getBoard()[i][0] = new Rook(true, new Position(i, 0));
                board.getBoard()[i][1] = new Knight(true, new Position(i, 1));
                board.getBoard()[i][2] = new Bishop(true, new Position(i, 2));
                board.getBoard()[i][3] = new Queen(true, new Position(i, 3));
                board.getBoard()[i][4] = new King(true, new Position(i, 4));
                board.getBoard()[i][5] = new Bishop(true, new Position(i, 5));
                board.getBoard()[i][6] = new Knight(true, new Position(i, 6));
                board.getBoard()[i][7] = new Rook(true, new Position(i, 7));

                board.getBoard()[7 - i][0] = new Rook(false, new Position(7 - i, 0));
                board.getBoard()[7 - i][1] = new Knight(false, new Position(7 - i, 1));
                board.getBoard()[7 - i][2] = new Bishop(false, new Position(7 - i, 2));
                board.getBoard()[7 - i][3] = new Queen(false, new Position(7 - i, 3));
                board.getBoard()[7 - i][4] = new King(false, new Position(7 - i, 4));
                board.getBoard()[7 - i][5] = new Bishop(false, new Position(7 - i, 5));
                board.getBoard()[7 - i][6] = new Knight(false, new Position(7 - i, 6));
                board.getBoard()[7 - i][7] = new Rook(false, new Position(7 - i, 7));
            }
            else {
                for (int j = 0; j < 8; j++) {
                    board.getBoard()[i][j] = new Pawn(true, new Position(i, j));
                    board.getBoard()[7 - i][j] = new Pawn(false, new Position(7 - i, j));
                }
            }
        }

    }   

    

    // Getter and setters

    public Board getBoard() {
        return board;
    }

    public Piece getPiece(int x, int y) {
        return board.getBoard()[x][y];
    }

    public void setPiece(int x, int y, Piece piece) {
        board.getBoard()[x][y] = piece;
    }




    
}
