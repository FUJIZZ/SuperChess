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
        System.out.println("Mouse clicked at: " + e.getX() + " " + e.getY());
        int col = e.getY() / 100;
        int row = e.getX() / 100;
        board.setSelectedX(col);
        board.setSelectedY(row);
        System.out.println("Board mouse clicked at: " + col + " " + row);
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
