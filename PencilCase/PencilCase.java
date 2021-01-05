
public class PencilCase
{
private int pencil_count;
private int pen_count;	
	
public PencilCase(int pencil_count , int pen_count)	
{
this.pen_count = pen_count;
this.pencil_count = pencil_count;
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

public void setPencilCount(int pencil_count)
{
	this.pencil_count = pencil_count;
}

public void setPenCount(int pen_count)
{
	this.pen_count = pen_count;
}


}
