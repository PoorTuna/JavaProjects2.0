
public class Kalmar
{
	private int pen_count = 0;
	private int pencil_count = 0;
	
	public Kalmar(int pen , int pencil)
	{
		this.pen_count = pen;
		this.pencil_count = pencil;
	}
	
	public void addPen()
	{
		this.pen_count += 1;
	}
	
	public void addPencil()
	{
		this.pencil_count += 1;
	}
	
	public void removePen()
	{
		this.pen_count -= 1;
	}
	
	public void removePencil()
	{
		this.pencil_count -= 1;
	}
	
	public int getPencilCount()
	{
		return this.pencil_count;
	}
	
	public int getPenCount()
	{
		return this.pen_count;
	}
	
	public void setPens(int pens)
	{
		this.pen_count = pens;
	}
	
	public void setPencils(int pencil)
	{
		this.pencil_count = pencil;
	}
}
