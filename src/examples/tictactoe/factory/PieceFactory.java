package examples.tictactoe.factory;

import examples.tictactoe.model.Piece;
import examples.tictactoe.model.PieceO;
import examples.tictactoe.model.PieceType;
import examples.tictactoe.model.PieceX;

public class PieceFactory {

    public static Piece createPiece(String pieceTypeStr) {
        PieceType pieceType = PieceType.valueOf(pieceTypeStr);
        return switch (pieceType) {
            case X -> new PieceX();
            case O -> new PieceO();
            default -> throw new IllegalArgumentException("Invalid piece type: " + pieceTypeStr);
        };
    }
}
