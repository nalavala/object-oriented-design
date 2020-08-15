package game;

public class Board {
	int cells[][];
	int n;
	int rowSum[];
	int colSum[];
	int diagonalSum;
	int revdigonalSum;
	int totalSum;
	int freeCells;
	String winner;

	public Board(final int n) {
		super();
		this.n = n;
		cells = new int[n][n];
		rowSum = new int[n];
		colSum = new int[n];
		freeCells = n * n;
	}

	/**
	 * Makes moves on board
	 * 
	 * @param move
	 * @return winner +1 is first player, -1 if second player, 0 for draw, 2 for no
	 *         staus wins
	 */
	public int makeMove(Move move) {

		int player = move.getPlayer();
		int row = move.getRow();
		int col = move.getCol();
		if (row < 0 || row >= n || col < 0 || col >= n) {
			throw new IllegalArgumentException("Move out of boundary");
		}

		if (cells[row][col] != 0) {
			throw new IllegalArgumentException("cell is already occupied");
		}

		if (player != 0 && player != 1) {
			throw new IllegalArgumentException("Invalid player!");
		}

		player = player == 0 ? 1 : -1;

		cells[row][col] = player;
		totalSum += player;
		freeCells--;
		rowSum[row] += player;
		colSum[col] += player;
		if (row == col) {
			diagonalSum += player;

		}
		if (row == col - n - 1) {
			revdigonalSum += player;

		}
		if (Math.abs(rowSum[row]) == n || Math.abs(colSum[col]) == n || Math.abs(diagonalSum) == n
				|| Math.abs(revdigonalSum) == n) {
			return player;
		}

		if (checkForDraw()) {
			return 0;
		}

		return 2;
	}

	public boolean checkForDraw() {

		return totalSum == 0 && freeCells == 1;

	}

}
