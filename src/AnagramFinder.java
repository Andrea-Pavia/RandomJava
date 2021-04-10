import java.util.Scanner;

public class AnagramFinder
{
	
	public AnagramFinder()
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Eneter first word to analyze: ");
		String firstWord = in.next();
		
		System.out.println("Eneter second word to analyze: ");
		String secondWord = in.next();
		
		String possibleAnagram = secondWord;
			
		if(firstWord.length()!=secondWord.length())
		{
			System.out.println(firstWord + " and " + possibleAnagram + " are not anagrams");
			System.exit(0);
		}
		
		for(int i=0; i<firstWord.length(); i++)
		{
			if(secondWord.contains(firstWord.substring(i, i+1)))
			{
				secondWord = secondWord.replaceFirst(firstWord.substring(i, i+1), "");
			}
		}
		
		if(secondWord.length() == 0)
			System.out.println(firstWord + " and " + possibleAnagram + " are anagrams");
		else
			System.out.println(firstWord + " and " + possibleAnagram + " are not anagrams");
	}
	
	public static void main(String[] args)
	{
		new AnagramFinder();
	}
	
	
}