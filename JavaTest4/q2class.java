import java.util.Arrays;
public class q2class
{
	private char[] decipheredWord = new char[0];
	private String newWord;
	
	public String decipherWord(String sentence) 
	{
		char[] letters = new char[sentence.length()];
		
		for ( int i = 0 ; i < letters.length ; i++)
		{
			letters[i] = sentence.charAt(i);
		}
		
		this.decipheredWord = new char[letters[0]];
		
		for ( int i = 0 ; i < this.decipheredWord.length ; i ++)
		{
			this.decipheredWord[i] = ' ';
			System.out.println(this.decipheredWord[i]);
		}
		
		
		for(int x = 1 ; x < letters.length; x += 2)
		{
			System.out.println(letters[0]);
			if (this.decipheredWord[x] == ' ')
			{
				this.decipheredWord[(int)(letters[x])-1] = letters[x+1]; 
			}
		}
		
		for(int x = 0 ;  x < this.decipheredWord.length ; x++)
		{
			newWord += this.decipheredWord[x]; 
		}
		
		return newWord;
	}
	
}
