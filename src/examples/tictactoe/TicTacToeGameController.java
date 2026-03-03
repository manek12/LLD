package examples.tictactoe;

import examples.tictactoe.model.Piece;
import examples.tictactoe.model.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToeGameController {
    private final TicTacToeGame game;

    public TicTacToeGameController(TicTacToeGame game) {
        this.game = game;
    }

    public void startGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean gameOver = false;
        while(!gameOver){
            game.getBoard().displayBoard();
            Player currentPlayer = game.getPlayers().removeFirst();
            System.out.println(currentPlayer.getName() + "'s turn. Please enter row and column like '0,1': ");
            String[] input = br.readLine().split(",");
            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);
            boolean moveDone = makeMove(row, col, currentPlayer.getPiece());
            if(!moveDone){
                game.getPlayers().addFirst(currentPlayer);
            }
            game.getPlayers().addLast(currentPlayer);

            boolean isWinner = WinnerChecker.checkWinner(game.getBoard(), currentPlayer.getPiece());
            if(isWinner){
                System.out.println("Congratulations " + currentPlayer.getName() + "! You have won the game!");
                gameOver = true;
                continue;
            }

            boolean isDraw = WinnerChecker.checkDraw(game.getBoard());
            if (isDraw) {
                System.out.println("It's a draw! No more moves left.");
                gameOver = true;
            }
        }
    }

    private boolean makeMove(int row, int col, Piece piece) {
        if(game.getBoard().getPieces()[row][col] != null){
            System.out.println("This cell is already occupied. Please choose another one.");
            return false;
        }
        game.getBoard().getPieces()[row][col] = piece;
        return true;
    }
}
