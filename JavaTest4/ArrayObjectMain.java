
public class ArrayObjectMain
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayObject[] a1 = new ArrayObject[10];
		
		for(int i = 0 ; i < a1.length ; i++)
		{
			a1[i] = new ArrayObject();
			a1[i].setNumber(i);
		}
		
		for(int i = 0 ; i < a1.length ; i++)
		{
			System.out.println(a1[i].getNumber());
		}
	}

}
