
public class RandomCube
{
	private int[] Contestants = new int[6];
	private int rolledNumber = -1 ;
	private int winner = -1;
	
	public RandomCube()
	{
		for (int i = 0 ; i < this.Contestants.length; i++)
		{
			this.Contestants[i] = 0;
		}
	}
	
	public void rollCube(int number)
	{
		this.rolledNumber = number;
	}
	
	public void updateCounter()
	{
		this.Contestants[this.rolledNumber] += 1;
		
	}
	
	public Boolean checkWinner()
	{
		for(int i = 0 ; i < this.Contestants.length ; i ++)
		{
			if ((this.Contestants[i] >= 2))
			{
				this.winner = i;
				return true; 
			}
		}
		return false;
		
	}
	public int getWinner()
	{
		return this.winner;
	}
}
