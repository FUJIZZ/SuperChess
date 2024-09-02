package model;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    private boolean hasMoved;

    public Pawn(boolean white, int x, int y) {
        super(white, "pawn", x, y);
        this.hasMoved = false;
    }

    @Override
    public List<int[]> getPossibleMoves(Board board) {
        List<int[]> moves = new ArrayList<>();
        int direction = isWhite() ? 1 : -1;
        int startX = getX();
        int startY = getY();
        //System.out.println("Pawn move start : " + startX + " " + startY);

        // Check if the pawn can move forward
        if (canMoveTo(startX + direction, startY, board)) {
            moves.add(new int[] { startX + direction, startY });
            if (!hasMoved && canMoveTo(startX + 2 * direction, startY, board)) {
                moves.add(new int[] { startX + 2 * direction, startY });
            }
        }

        // Check if the pawn can capture
        if (canCaptureTo(startX + direction, startY + 1, board)) {
            moves.add(new int[] { startX + direction, startY + 1 });
        }

        if (canCaptureTo(startX + direction, startY - 1, board)) {
            moves.add(new int[] { startX + direction, startY - 1 });
        }
        

        return moves;

    }

    public void printPossibleMoves(Board board) {
        List<int[]> moves = getPossibleMoves(board);
        for (int[] move : moves) {
            System.out.println(move[0] + " " + move[1]);
        }
    }

    // Getter
    public boolean getHasMoved() {
        return this.hasMoved;
    }

    
}
