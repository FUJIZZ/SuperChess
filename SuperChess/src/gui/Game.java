package gui;

import model.Board;
import tools.Constant;
import view.BoardView;
import controller.BoardController;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {

    private Board board;

    public Game() {
        setTitle("Chess");
        setSize(Constant.WINDOWS_WIDTH, Constant.WINDOWS_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        run();
    }

    @Override
    public void run() {
        Board board = new Board();
        BoardView boardView = new BoardView();
        BoardController boardController = new BoardController(board, boardView);
        boardView.printBoard(boardController);
    }

    public static void main(String[] args) {
        new Game();
    }

    

}
