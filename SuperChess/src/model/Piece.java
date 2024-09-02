package model;

import java.util.List;

public abstract class Piece {

    private String name;
    private boolean isWhite;
    private int x;
    private int y;
    
    public Piece(boolean isWhite, String name, int x, int y) {
        this.isWhite = isWhite;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public abstract List<int[]> getPossibleMoves(Board board);

    protected boolean isInsideBoard(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    protected boolean isSameTeam(Piece piece) {
        return piece != null && piece.isWhite() == isWhite;
    }

    protected boolean canMoveTo(int x, int y, Board board){
        return isInsideBoard(x, y) && board.getPieceAt(x, y) == null;
    }

    protected boolean canCaptureTo(int x, int y, Board board) {
        return isInsideBoard(x, y) && board.getPieceAt(x, y) != null && !isSameTeam(board.getPieceAt(x, y));
    }
    // Getters and Setters

    public boolean isWhite() {
        return isWhite;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
