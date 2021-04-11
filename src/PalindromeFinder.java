import java.util.Scanner;

public class PalindromeFinder
{
	
	public PalindromeFinder()
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Eneter word to analyze: ");
		String enteredWord = in.next();
						
		boolean ispalendrone = true;
		for(int i=0; i<enteredWord.length(); i++)
		{
			if(!enteredWord.substring(i, i+1).equals(enteredWord.substring(enteredWord.length()-1-i, enteredWord.length()-i)))
			{
				ispalendrone = false;
				break;
			}
		}
		
		if(ispalendrone)
			System.out.println(enteredWord + " is a palindrome");
		else
			System.out.println(enteredWord + " is not a palindrome");
	}
	
	public static void main(String[] args)
	{
		new PalindromeFinder();
	}
	
	
}