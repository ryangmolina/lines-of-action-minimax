package loa.core.player;

import loa.core.Game;
import loa.core.board.Board;
import loa.core.board.Move;
import loa.core.board.Piece;

public abstract class Player {

    Player(Piece side, Game game) {
        this.side = side;
        this.game = game;
    }

    public Piece side() {
        return side;
    }

    public Board getBoard() {
        return game.getBoard();
    }

    public Game getGame() {
        return game;
    }

    private Piece side;

    private Game game;

    public abstract Move makeMove();

}
