import java.util.*;
public class KalmarMain
{

	public static void main(String[] args)
	{int event_count = 0 ,action , type = 0, pencil_count = 0, pen_count = 0;
	Scanner in = new Scanner(System.in);
	Kalmar k1 = new Kalmar(0,0);
	Kalmar k2;
		while ((k1.getPencilCount() <= 0) || (k1.getPenCount() <= 0))
		{
			System.out.println("Please enter the number of Pencils [Above 0].");
			pencil_count = in.nextInt();
			System.out.println("Please enter the number of Pens [Above 0].");
			pen_count = in.nextInt();
			if ((pen_count) > 0 && (pencil_count > 0))
			{
				k1.setPencils(pencil_count);
				k1.setPens(pen_count);
			}
			else
			{
				System.out.println("One or more of the inputs were invalid, please try again.");
			}
		}
			
		while ((k1.getPencilCount() > 0) && (k1.getPenCount() > 0) && (type != 3))
		{
			System.out.println("Please choose [1] for Pen || [2] for pencil || [3] to End.");
			type = in.nextInt();
			
			if (type == 1)
			{
				System.out.println("Please choose [1] to add a Pen || [2] to remove a Pen.");
				action = in.nextInt();
				if (action == 1)
				{
					k1.addPen();
					event_count += 1;
				}
				else if (action == 2)
				{
					k1.removePen();
					event_count += 1;
				}
				else
				{
					System.out.println("Invalid Action.");
				}
			}
			
			else if (type == 2)
			{
				System.out.println("Please choose [1] to add a Pencil || [2] to remove a Pencil.");
				action = in.nextInt();
				if (action == 1)
				{
					k1.addPencil();
					event_count += 1;
				}
				else if (action == 2)
				{
					k1.removePencil();
					event_count += 1;
				}
				else
				{
					System.out.println("Invalid Action.");
				}
			}
			else if (type == 3)
			{
				System.out.println("End of program....");
			}
			else
			{
				System.out.println("Invalid Type.");
			}
			
		}
			
		System.out.println("Number of Pens = " + k1.getPenCount() + ", " + "Number of Pencils = " + k1.getPencilCount() + ", " + "Number of Events = " + event_count);	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}


