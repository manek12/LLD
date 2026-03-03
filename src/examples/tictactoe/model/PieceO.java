package examples.tictactoe.model;

public class PieceO implements Piece {
    PieceType pieceType;

    public PieceO() {
        pieceType = PieceType.O;
    }

    @Override
    public PieceType getPieceType() {
        return pieceType;
    }
}
