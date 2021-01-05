
public class Program
{
	private int num;
	private int sum;
	public Program(){
		this.num = 0;
		this.sum = 0;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public int higherthenNum(Actor[] actArr)
	{
		for (int i = 0 ; i < actArr.length ; i++)
		{
			if ( this.num < actArr[i].getNumFilms() )
			{
				sum++;
			}
		}
		return sum;
	}
		
	public static void main(String[] args)
	{
		Actor[] actArr = new Actor[37];
		for (int i = 0 ; i < 37 ; i++)
		{
			actArr[i] = new Actor("1","M",i);
			
		}
		Program p1 = new Program();
		p1.setNum(10);
		System.out.println(p1.higherthenNum(actArr));
	}

}
