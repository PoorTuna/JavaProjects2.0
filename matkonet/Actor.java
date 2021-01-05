public class Actor
{
	private String id;
	private String gender;
	private int numFilms;
	
	
	public Actor(String id,String gender,int numFilms)
	{
		this.id = id;
		this.gender = gender;
		this.numFilms = numFilms;
	}
	
	public void addFilm()
	{
		this.numFilms++;
	}
	public int getNumFilms()
	{
		return this.numFilms;
	}
	
	public int compare( Actor other)
	{
		if (this.numFilms > other.numFilms)
		{
			return 1;
		}
		else if(this.numFilms == other.numFilms)
		{
			return 0;
		}
		else{
			return -1;
		}
		
	}
	
	public static void main(String[] args)
	{
		
	Actor[] actArr = new Actor[37];
	System.out.println();
		
	}

}
