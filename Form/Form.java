import java.util.*;
public class Form
{
	int SIZE = 5;
	
	Scanner in = new Scanner(System.in);
	
	//////////////////////////Variables:
	
	private String Prize;
	private int[] Numbers;
	private boolean[] guessedNumbers;
	
	//////////////////////////Constructor:
	
	public Form()
	{
		this.SIZE = 5 ;
		this.Numbers = new int[this.SIZE];
		this.guessedNumbers = new boolean[11];
		this.Prize = "N/A";
	}
	
	public Form(String par)
	{
		this.Prize = par;
		this.guessedNumbers = new boolean[0];
	}
	
	
	//////////////////////////Actions:
	
	public void setNumbers()
	{
		Random rnd = new Random();
		for(int i = 0 ; i < this.SIZE ; i++)
		{
			this.Numbers[i] = rnd.nextInt(99) + 1 ;
		}
	}
	
	public void setSize(int size)
	{
		this.SIZE = size;
	}
	
	public void setPrize(String prize)
	{
		this.Prize = prize;
		if (this.Prize == "")
		{
			this.Prize = "N/A" ;
		}
	}
	
	public String getNumbers()
	{
		String list = "";
		int index = 0;
		while ( index < this.SIZE )
		{
			list += this.Numbers[index] + " , " ;
			index++;
		}
		index = 0 ;
		return list;
	}
	
	public int getSize()
	{
		return this.SIZE;
	}
	
	public String getPrize()
	{
		return this.Prize;
	}
	

	
	
	public boolean isGoodGuess(int number)
	{
		int check = 0;
		int index = 0;
			if ( (number == this.Numbers[index]) && (this.guessedNumbers[index] == false ) ) 
			{
				check = 1 ;
				this.guessedNumbers[index] = true;
			}
			
			else
			{
				this.guessedNumbers[index] = false ;
				check = 0 ;
			}
		if (check == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean[] getGussedNumbers()
	{
		int index =  0 ;
		return this.guessedNumbers;
	}
	
	
	
}
