import java.util.Scanner;
public class rassiaMain
{

	public static void main(String[] args)
	{
		Scanner in =  new Scanner(System.in);
		rassia r1 = new rassia();
		System.out.println("Please insert the size of the pyramid");
		int lines_num = in.nextInt();
		int space_num = 0;
		
		r1.setnigger();
		System.out.println(r1.getNigger());
	
		for( int y = 0 ; y < lines_num ; y++)
		{
			while ( space_num < lines_num)
			{
				System.out.print(" ");
				space_num ++;
			}
			space_num = y;
			
			for (int x = 0 ; x <= y ; x++)
			{
				System.out.print(" ");
				System.out.print(x);
			}
		
			System.out.println(" ");
		}
		
	}

}
