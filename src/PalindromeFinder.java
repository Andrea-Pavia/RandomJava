import java.util.Scanner;

public class PalindromeFinder
{
	
	public PalindromeFinder()
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Eneter word to analyze: ");
		String firstWord = in.next();
						
		boolean ispalendrone = true;
		for(int i=0; i<firstWord.length(); i++)
		{
			if(!firstWord.substring(i, i+1).equals(firstWord.substring(firstWord.length()-1-i, firstWord.length()-i)))
			{
				ispalendrone = false;
				break;
			}
		}
		
		if(ispalendrone)
			System.out.println(firstWord + " is a palindrome");
		else
			System.out.println(firstWord + " is not a palindrome");
	}
	
	public static void main(String[] args)
	{
		new PalindromeFinder();
	}
	
	
}