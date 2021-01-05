
public class TvWeek
{
	
	private TvProgram[] arrProg;
	private int current;
	
	public TvWeek()
	{
		this.current = 0 ;
	}
	public void setTvProgLen(int num)
	{
		this.arrProg = new TvProgram[100];
	}
	public void addTvProgram(TvProgram t1){
		int i = 0;
		while ( ( i < this.arrProg.length ) && ( this.arrProg[i] == null ) )
		{
			i ++;
		}
		this.arrProg[i] = t1;
		
		this.current++;
	}
	
	public int checkifsport(){
		int count = 0;
		for (int i = 0; i < this.arrProg.length ; i++)
		{
			if (this.arrProg[i].getIsSport()) 
				count++;
		}
		return count;
	}
	
	public static void main(String[] args)
	{

	}

}
