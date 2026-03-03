package examples.tictactoe.model;

public class PieceX implements Piece {
    PieceType pieceType;

    public PieceX() {
        pieceType = PieceType.X;
    }

    @Override
    public PieceType getPieceType() {
        return pieceType;
    }
}
