package model;

import tools.Position;

public abstract class Piece {

    private String name;
    private boolean white;
    private Position position;
    
    public Piece(boolean white, Position position, String name) {
        this.white = white;
        this.position = position;
        this.name = name;
    }

    public abstract boolean isValidMove(Position newPosition, Board board);

    // Getters and Setters

    public boolean isWhite() {
        return white;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
}
