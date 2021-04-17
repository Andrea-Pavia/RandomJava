import java.util.Scanner;

public class TicTacToe {

	static final String Player1 = "X";
	static final String Player2 = "O";
	
	public TicTacToe()
	{
		String[][] board = new Board().getBoard();
		
		for(String[] x : board)
		{
			for(String y : x)
				System.out.print("[ ]");
			
			System.out.println();
		}
		

		    // String input
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int xMove = 0;
		int yMove = 0;
		String boardInput = "";
		WinningConditions winCon = null;
		for(int i=0; i<9;i++)
		{
			if(i%2==0)
			{
				System.out.println(Player1+ " enter x Coordinate of your move");
				xMove = scanner.nextInt();
				System.out.println(Player1+ " enter y Coordinate of your move");
				yMove = scanner.nextInt();
				boardInput = Player1;
			}
			else
			{
				System.out.println(Player2+ " enter x Coordinate of your move");
				xMove = scanner.nextInt();
				System.out.println(Player2+ " enter y Coordinate of your move");
				yMove = scanner.nextInt();
				boardInput = Player2;
			}
			
			board[xMove][yMove] = boardInput;
			
			for(String[] x : board)
			{
				for(String y : x)
					System.out.print("["+y+"]");
				
				System.out.println();
			}
			if(i>3)
			{
				winCon = new WinningConditions(board, boardInput);
				if(winCon.hasPlayer1Won())
				{
					System.out.println(Player1 + " has won!");
					break;
				}
				if(winCon.hasPlayer2Won())
				{
					System.out.println(Player2 + " has won!");
					break;
				}
			}
		}
		if(!winCon.hasPlayer1Won() && !winCon.hasPlayer2Won())
		{
			System.out.println("Game ended up in a tie");
		}
	}
	
	public static void main (String[] args)
	{
		new TicTacToe();
	}
}
