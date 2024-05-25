package tools;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Position position) {
        return this.x == position.getX() && this.y == position.getY();
    }

    public boolean isInsideBoard() {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }


    // Getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
