
public class TvProgram
{
	private int code;
	private int day;
	public boolean isSport;
	
	
	public TvProgram(int code,int day,boolean isSport){
		this.code = code;
		this.day = day;
		this.isSport = isSport; 
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	public void setDay(int day)
	{
		this.day = day; 
	}
	public void setisSport(boolean isSport)
	{
		this.isSport = isSport;
	}
	
	public int getCode(){
		return code;
	}
	public int getDay(){
		return this.day;
	}
	public boolean getIsSport(){
		return this.isSport;
	}
	
	public static void main(String[] args)
	{

	}

}
