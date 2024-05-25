package model;

import tools.Position;

public class Board {
    private Piece[][] board;

    public Board() {
        // Initialize the board
        this.board = new Piece[8][8];
    }

    public Piece getPiece(Position position) {
        return board[position.getX()][position.getY()];
    }

    // Getter

    public Piece[][] getBoard() {
        return board;
    }
    
}
