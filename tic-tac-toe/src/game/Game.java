package game;

import java.util.List;
import java.util.Scanner;

public class Game {

	Player p1;
	Player p2;
	List<Move> moves;
	Board board;
	Player winner;

	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.board = new Board(3);
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		Game game = new Game(new Player("Revanth"), new Player("venkat"));
		while (true) {
			Move move = new Move(scan.nextInt(), scan.nextInt(), scan.nextInt());
			game.moves.add(move);
			int result = game.board.makeMove(move);
			if (result == 1) {
				System.out.println("winner is " + game.p1.name);
				break;
			} else if (result == -1) {
				System.out.println("winner is " + game.p2.name);
				break;
			} else if (result == 0) {
				System.out.println("draw!!!");
				break;
			}

		}
	}

}
