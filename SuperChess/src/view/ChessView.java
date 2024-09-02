package view;

import model.Board;
import tools.Constant;
import tools.ImageLoader;

import javax.swing.JFrame;
import java.awt.Dimension;

public class ChessView extends JFrame {

    private Board board;
    private ImageLoader imageLoader;

    public ChessView(Board board, ImageLoader imageLoader) {
        this.board = board;
        this.imageLoader = imageLoader;
        initUI();
        
    }

    private void initUI() {
        setTitle("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        BoardPanel boardPanel = new BoardPanel(board, imageLoader);
        boardPanel.setPreferredSize(new Dimension(Constant.WINDOWS_WIDTH, Constant.WINDOWS_HEIGHT));
        add(boardPanel);
    
        pack();
        Dimension size = getSize();
        int widthWithInsets = Constant.WINDOWS_WIDTH + (size.width - boardPanel.getWidth());
        int heightWithInsets = Constant.WINDOWS_HEIGHT + (size.height - boardPanel.getHeight());
        setSize(widthWithInsets, heightWithInsets);

        setLocationRelativeTo(null);
        setVisible(true);
        System.out.println(this.getWidth() + " " + this.getHeight());
    }

    public void refresh() {
        repaint();
    }

    

    

}
