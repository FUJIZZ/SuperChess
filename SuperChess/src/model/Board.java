package model;


public class Board {
    private Piece[][] board;

    private int selectedX = -1;
    private int selectedY = -1;

    private boolean whiteTurn = true;

    public Board() {
        this.board = new Piece[8][8];
        initBoard();
        System.out.println("Board initialized");
    }

    private void initBoard() {
        // Initialize the board
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                board[i][0] = new Rook(true, i, 0);
                board[i][1] = new Knight(true, i, 1);
                board[i][2] = new Bishop(true, i, 2);
                board[i][3] = new Queen(true, i, 3);
                board[i][4] = new King(true, i, 4);
                board[i][5] = new Bishop(true, i, 5);
                board[i][6] = new Knight(true, i, 6);
                board[i][7] = new Rook(true, i, 7);
                
                board[7 - i][0] = new Rook(false, 7 - i, 0);
                board[7 - i][1] = new Knight(false, 7 - i, 1);
                board[7 - i][2] = new Bishop(false, 7 - i, 2);
                board[7 - i][3] = new Queen(false, 7 - i, 3);
                board[7 - i][4] = new King(false, 7 - i, 4);
                board[7 - i][5] = new Bishop(false, 7 - i, 5);
                board[7 - i][6] = new Knight(false, 7 - i, 6);
                board[7 - i][7] = new Rook(false, 7 - i, 7);
            }
            else {
                board[i][1] = new Knight(true, i, 1);
                for (int j = 0; j < 8; j++) {
                    board[i][j] = new Pawn(true, i, j);
                    board[7 - i][j] = new Pawn(false, 7 - i, j);
                }
            }
        }

    }   

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }

    public void movePiece(int oldX, int oldY, int newX, int newY) {
        board[newX][newY] = board[oldX][oldY];
        board[oldX][oldY] = null;
    }

    public boolean isPieceAt(int x, int y) {
        return board[x][y] != null;
    }

    public boolean isSquareSelected() {
        return selectedX != -1 && selectedY != -1;
    }

    public boolean isPieceSelected() {
        return isSquareSelected() && board[selectedX][selectedY] != null;
    }

    public void resetSelection() {
        selectedX = -1;
        selectedY = -1;
    }

    public boolean isWhiteTurn() {
        return whiteTurn;
    }

    // Getter

    public Piece[][] getBoard() {
        return board;
    }

    public int getSelectedX() {
        return selectedX;
    }

    public int getSelectedY() {
        return selectedY;
    }

    // Setter

    public void setSelectedX(int selectedX) {
        this.selectedX = selectedX;
    }

    public void setSelectedY(int selectedY) {
        this.selectedY = selectedY;
    }
    
}
