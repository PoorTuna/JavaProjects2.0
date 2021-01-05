import java.util.Scanner;
import java.util.Random;
public class bagroot
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = 101;
		int sumOfLeftOvers3 = 0;
		int advancedLeftOvers3 = 0 ;
		
		while ( n > 100 )
		{
			System.out.println("Please enter a number that is below 100");
			n = in.nextInt();
			if ( n > 100)
			{
				System.out.println("Invalid number");
			}	
		}
		
		for (int i = 0 ; i < n ;  i++)
		{
			if (i % 3 == 0)
			{
				sumOfLeftOvers3 += i;
			}
		}
		System.out.println("The sum of left overs 3 is : " + sumOfLeftOvers3);
		
		Random rnd = new Random();
		int[] c = new int[19];

		for (int i = 0; i < c.length ; i ++)
		{
			c[i] = rnd.nextInt(100);
			System.out.println(c[i] + " , " + i );
		}
		
		for (int y = 0 ; y < c.length ; y ++ )
		{
			for ( int x = 0 ; x < c[y] ; x ++ )
			{
				if (x % 3 == 0)
				{
					advancedLeftOvers3 += x;
				}
			}
			c[y] = advancedLeftOvers3;
			System.out.println(c[y] + " , " + y);
			
			advancedLeftOvers3 = 0;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
