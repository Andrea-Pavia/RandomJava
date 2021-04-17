
public class WinningConditions {

	boolean player1Win = false;
	boolean player2Win = false;
	
	static final String BLANK = " ";
	
	public WinningConditions(String[][] board, String player)
	{		
		if(
			(isSamePlayer(board[0][0],board[0][1]) && isSamePlayer(board[0][1],board[0][2]))
			|| (isSamePlayer(board[1][0], board[1][1]) && isSamePlayer(board[1][1], board[1][2]))
			|| (isSamePlayer(board[2][0], board[2][1]) && isSamePlayer(board[2][1],board[2][2]))
			
			|| (isSamePlayer(board[0][0], board[1][0]) && isSamePlayer(board[1][0],board[2][0]))
			|| (isSamePlayer(board[0][1], board[1][1]) && isSamePlayer(board[1][1],board[2][1]))
			|| (isSamePlayer(board[0][2], board[1][2]) && isSamePlayer(board[1][2],board[2][2]))
			
			|| (isSamePlayer(board[0][0], board[1][1]) && isSamePlayer(board[1][1],board[2][2]))
			|| (isSamePlayer(board[0][2], board[1][1]) && isSamePlayer(board[1][1],board[2][0])))
		{
			if(player.equals(TicTacToe.Player1))
				player1Win = true;
			else
				player2Win = true;
		}
	}
	
	public boolean hasPlayer1Won()
	{
		return player1Win;
	}
	
	public boolean hasPlayer2Won()
	{
		return player2Win;
	}
	
	private boolean isSamePlayer(String firstCheck, String secondCheck)
	{
		return(firstCheck.equals(secondCheck) && !firstCheck.equals(BLANK));
	}
}
