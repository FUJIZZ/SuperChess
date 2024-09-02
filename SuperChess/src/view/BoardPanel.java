package view;

import javax.swing.JPanel;

import controller.BoardController;
import model.Board;
import model.Piece;
import tools.ImageLoader;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

import java.awt.Color;

public class BoardPanel extends JPanel {
    private Board board;
    private ImageLoader imageLoader;

    public BoardPanel(Board board, ImageLoader imageLoader) {
        this.board = board;
        this.imageLoader = imageLoader;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        drawPieces(g);
        drawSelection(g);
        drawPossibleMoves(g);
    }

    private void drawBoard(Graphics g) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(col * 100, row * 100, 100, 100);
            }
        }
    }

    private void drawPieces(Graphics g) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board.getPieceAt(row, col);
                if (piece != null) {
                    String imageName = (piece.isWhite() ? "white_" : "black_") + piece.getName();
                    BufferedImage image = imageLoader.getImage(imageName);
                    g.drawImage(image, col * 100, row * 100, 100, 100, null);
                }
            }
        }
    }

    private void drawSelection(Graphics g) {
        if(board.isPieceSelected()) {
            int col = board.getSelectedY();
            int row = board.getSelectedX();
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.YELLOW);
            g2.setStroke(new BasicStroke(3));
            g2.drawRect(col * 100, row * 100, 100, 100);
            System.out.println("Piece selected");
        }
        
    }

    private void drawPossibleMoves(Graphics g) {
        if(board.isPieceSelected()) {
            Piece piece = board.getPieceAt(board.getSelectedX(), board.getSelectedY());
            for(int[] move : piece.getPossibleMoves(board)) {
                int col = move[1];
                int row = move[0];
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.GREEN);
                g2.setStroke(new BasicStroke(3));
                g2.drawRect(col * 100, row * 100, 100, 100);
            }
        }
        //printBoard();
    }

    private void printPiece(Piece piece) {
        if(piece == null) {
            System.out.print(". ");
        } else {
            System.out.print(piece.getName().charAt(0) + " ");
        }
    }

    public void printBoard() {
        System.out.println("Board: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                printPiece(board.getPieceAt(i, j));
            }
            System.out.println();
        }
    } 
    
}
