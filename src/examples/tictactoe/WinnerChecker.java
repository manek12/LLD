package examples.tictactoe;

import examples.tictactoe.model.Board;
import examples.tictactoe.model.Piece;

public class WinnerChecker {
    public static boolean checkWinner(Board board, Piece piece) {
        int size = board.getSize();
        // Check rows
        for(int i=0; i<size; i++) {
            boolean rowWin = true;
            for(int j=0; j<size; j++) {
                if(board.getPieces()[i][j] == null || board.getPieces()[i][j].getPieceType() != piece.getPieceType()) {
                    rowWin = false;
                    break;
                }
            }
            if(rowWin) return true;
        }

        // Check columns
        for(int j=0; j<size; j++) {
            boolean colWin = true;
            for(int i=0; i<size; i++) {
                if(board.getPieces()[i][j] == null || board.getPieces()[i][j].getPieceType() != piece.getPieceType()) {
                    colWin = false;
                    break;
                }
            }
            if(colWin) return true;
        }

        // Check diagonal (top-left to bottom-right)
        boolean diagWin1 = true;
        for(int i=0; i<size; i++) {
            if(board.getPieces()[i][i] == null || board.getPieces()[i][i].getPieceType() != piece.getPieceType()) {
                diagWin1 = false;
                break;
            }
        }
        if(diagWin1) return true;

        // Check diagonal (top-right to bottom-left)
        boolean diagWin2 = true;
        for(int i=0; i<size; i++) {
            if(board.getPieces()[i][size - 1 - i] == null || board.getPieces()[i][size - 1 - i].getPieceType() != piece.getPieceType()) {
                diagWin2 = false;
                break;
            }
        }
        return diagWin2;
    }

    public static boolean checkDraw(Board board) {
        int size = board.getSize();
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board.getPieces()[i][j] == null) {
                    return false; // Found an empty cell, not a draw
                }
            }
        }
        return true; // No empty cells, it's a draw
    }
}
