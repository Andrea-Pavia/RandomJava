import java.util.Arrays;

public class Board {

	private String[][] board;
	
	public Board()
	{
		board = new String[3][3];
		for(int i = 0; i < board.length; i++)
			Arrays.fill(board[i], " ");
	}
	
	public String[][] getBoard()
	{
		return this.board;
	}
}
