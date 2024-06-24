package view;

import javax.swing.JPanel;
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
                Piece piece = board.getPiece(row, col);
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
            g2.setStroke(new BasicStroke(5));
            g2.drawRect(col * 100, row * 100, 100, 100);
            System.out.println("Piece selected");
        }
        
    }


    
}
