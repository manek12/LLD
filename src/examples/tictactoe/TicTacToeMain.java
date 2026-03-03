package examples.tictactoe;

import examples.tictactoe.factory.PieceFactory;
import examples.tictactoe.model.Board;
import examples.tictactoe.model.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class TicTacToeMain {
    public static void main(String[] args) throws IOException {
        Board board;
        Deque<Player> players;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Tic Tac Toe!");
        try{
            System.out.println("Tell me the size of the board:");
            int boardSize = Integer.parseInt(br.readLine());
            board = new Board(boardSize);

            System.out.println("Tell me the first player name for piece (X) :");
            Player player1 = new Player(br.readLine(), PieceFactory.createPiece("X"));
            System.out.println("Tell me the second player name for piece (O) :");
            Player player2 = new Player(br.readLine(), PieceFactory.createPiece("O"));
            players = new ArrayDeque<>();
            players.add(player1);
            players.add(player2);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        TicTacToeGame game = new TicTacToeGame(players, board);
        TicTacToeGameController gameController = new TicTacToeGameController(game);
        gameController.startGame();
        System.out.println("Game over! Thanks for playing.");
    }
}
