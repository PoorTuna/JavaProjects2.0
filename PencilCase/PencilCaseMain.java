import java.util.*;
public class PencilCaseMain
{


	public static void main(String[] args)
	{int type = 0 , action ,event_count = 0, pencil_count=0, pen_count=0;
	Scanner in = new Scanner(System.in);
	PencilCase pc1 = new PencilCase(10,5); // 10 = pencil count , 5 = pen count.  [Not actually usable as of now, just to illustrate that you may use the constructor.]
	
	
	while ((pencil_count<=0) || (pen_count<=0))
	{
	System.out.println("Please set the Number of Pencils [above 0].");
	pencil_count = in.nextInt();
	System.out.println("Please set the Number of Pens [above 0].");
	pen_count = in.nextInt();
	if (pencil_count > 0)
	{
		pc1.setPencilCount(pencil_count);
	}
	if (pen_count > 0)
	{
		pc1.setPenCount(pen_count);
	}
	else
	{
		System.out.println("One or more of your inputs were invalid... Please try again.");
	}
	
	}
	
	
	
while (((pc1.getPencilCount() > 0) && (pc1.getPenCount() > 0)) && (type != -1))
{
	System.out.println("please enter [1] for Pencil OR [2] for Pen OR [-1] to End.");
	type = in.nextInt();
	
	if (type == 1)
	{
		System.out.println("please enter [1] to add OR [2] to remove a Pencil");
		action = in.nextInt();
		
		if (action == 1)
		{
			pc1.addPencil();
			event_count +=1;
		}
		if (action == 2)
		{
			pc1.removePencil();
			event_count +=1;
		}
		else
		{
			System.out.println("Invalid Input.");
		}
		
	}
	
	else if (type == 2)
	{
		System.out.println("please enter [1] to add OR [2] to remove a Pen");
		action = in.nextInt();
		
		if (action == 1)
		{
			pc1.addPen();
			event_count +=1;
		}
		if (action == 2)
		{
			pc1.removePen();
			event_count +=1;
		}
	
		else
		{
			System.out.println("Invalid Input.");
		}
		
	}
	
	else if (type == -1)
	{
		System.out.println("End of program...");
	}
	
	else
	{
		System.out.println("Invalid Input");
	}
	
	
}
	        
System.out.println("Pencil Count is= "+ pc1.getPencilCount() + ", "+"Pen Count is= "+pc1.getPenCount()+ ", " +"Number of events=" + event_count);
		
		
		
		
		
		
	}

}
