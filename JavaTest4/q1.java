
public class q1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		int[] a = {2,19,3,27,14};
		int[] b = {0,2,6,6,1,2,10,17,17,3};
		int[] a2 = {2,12,3,27,20}; 
		
		int count = 0, count2 = 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if (a[i] != b[i*2] + b[i*2+1])
					{
					a[i] = -1;
					}
			else
			{
				count++;
			}
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			if (a2[i] != b[i*2] + b[i*2+1])
					{
					a2[i] = -1;
					}
			else
			{
				count2++;
			}
		}
		System.out.println(count2);


		System.out.println(a.length-count);
		System.out.println(a.length - count2);
	}

}
