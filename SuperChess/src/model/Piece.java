package model;

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

    public abstract boolean isValidMove(Board board);

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInsideBoard(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
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
