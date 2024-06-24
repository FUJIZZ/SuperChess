package gui;

import controller.ChessController;
import model.Board;
import tools.ImageLoader;
import view.ChessView;
import view.BoardPanel;
import controller.BoardController;

public class Chess {
    public static void main(String[] args) {
        Board board = new Board();
        ImageLoader imageLoader = new ImageLoader();
        ChessView view = new ChessView(board, imageLoader);
        BoardController boardController = new BoardController(board, view);
    }
}
