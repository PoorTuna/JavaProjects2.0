import unit4.turtleLib.*;
public class FormTyp
{
private	int sides = 0;
private double size = 0.0;
private int index=0;




//Constructor Default.
FormTyp()
{
this.sides = 0;
this.size = 0.0;
}

//Constructor Copy.
FormTyp(FormTyp para)
{
this.size = para.size;
this.sides = para.sides;
}

//Constructor Straight.
FormTyp(int sides, double size)
{
this.sides = sides;
this.size = size;
}


public void setSides(int sides)
{
this.sides = sides;
}

public void setSize(double size)
{
this.size = size;	
}


public double getSize()
{
	return this.size;	
}

public int getSides()
{
	return this.sides;
}


public void drawShape(int sides, double size)
{
//	Define a turtle:
	Turtle t1 = new Turtle();
	t1.tailDown();

	while(this.index < sides)
	{
		if (sides == 3)
			t1.turnRight(120);
		if (sides == 4)
			t1.turnRight(90);
		if (sides == 5)
			t1.turnRight(72);
		if (sides == 6)
			t1.turnRight(60);
		if (sides == 7)
			t1.turnRight(51.5);
		if (sides == 8)
			t1.turnRight(45);
		t1.moveForward(size);	
		this.index++;
	}
	t1.tailUp();
	t1.moveForward(1000);
	this.index = 0;
}

}