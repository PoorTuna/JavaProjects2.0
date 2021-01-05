
public class Movie
{
	private String name;
	private int len;
	
	public Movie(){
		this.name = null;
		this.len = 0;
	}
	public Movie(String name, int length){
		this.name = name;
		this.len = length;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getLength(){
		return this.len;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLength(int len){
		this.len = len;
	}
	public static String shortestMovie(Movie[] m1){
		Movie shortest = new Movie("",Integer.MAX_VALUE);
		for (int i = 0; i < m1.length ; i++){
			if (shortest.getLength() > m1[i].getLength()){
				shortest.setLength(m1[i].getLength());
				shortest.setName(m1[i].getName());
			}
			
		}
		return shortest.getName();
	}
	
	public static void main(String[] args)
	{
		Movie[] m1 = new Movie[10];
		
		for ( int i = 0 ; i < m1.length ; i++){
			m1[i] = new Movie("xd" + i ,i);
		}
		System.out.println(shortestMovie(m1));
	}
	

}
