package examples.tictactoe;

import examples.tictactoe.model.Board;
import examples.tictactoe.model.Player;

import java.util.Deque;

public class TicTacToeGame {
    private final Deque<Player> players;
    private final Board board;

    public TicTacToeGame(Deque<Player> players, Board board) {
        this.players = players;
        this.board = board;
    }

    public Deque<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }
}
