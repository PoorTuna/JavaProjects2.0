
public class ForInFor
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int num = 6;
		int spaces = num;

		for(int i = 1 ; i < num ; i++ )
		{
			
			for(int j = 1 ; j <= i ; j++)
			{
				while(spaces > 0)
				{
					System.out.print(" ");
					spaces--;
				}
				System.out.print(j);
				System.out.print(" ");
			}
			spaces = num - i;
			System.out.println("");
		}
		
		
		
	}

}
