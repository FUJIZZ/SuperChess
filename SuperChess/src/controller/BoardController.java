package controller;

import view.ChessView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.*;

public class BoardController {
    private Board board;
    private ChessView view;

    public BoardController(Board board, ChessView view) {
        this.board = board;
        this.view = view;
        initController();
    }

    public void setPiece(int x, int y, Piece piece) {
        board.getBoard()[x][y] = piece;
    }

    private void initController() {
        System.out.println("Board controller initialized");
        view.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleMouseClick(e);
            }
        });
    }

    private void handleMouseClick(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getY() + " " + e.getX());
        int x = (e.getY()-34) / 100;
        int y = (e.getX()) / 100;
        System.out.println("Board mouse clicked at: " + x + " " + y);

        // Check we selected a piece and we clicked on a possible move square
        if(board.isPieceSelected() && board.isPossibleMoveSquare(x, y) ) {
            board.movePieceTo(x, y);
        // Check if we clicked on a piece
        } else if (board.getPieceAt(x, y) != null) {
            board.selectPiece(x, y);
        // Check if we clicked on an empty square
        } else {
            board.resetSelection();
        }
        view.repaint();
    }

    

    // Getter and setters

    public Board getBoard() {
        return board;
    }

    public Piece getPiece(int x, int y) {
        return board.getBoard()[x][y];
    }
    
}
