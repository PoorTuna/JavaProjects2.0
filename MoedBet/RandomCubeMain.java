import java.util.Random;
public class RandomCubeMain
{

	public static void main(String[] args)
	{
		RandomCube c1 = new RandomCube();
		Random rnd = new Random();
		

		while (!(c1.checkWinner()))
		{
			int number = rnd.nextInt(6);
			c1.rollCube(number);
			c1.updateCounter();
		}
		System.out.println("we found a winner: " + (int)(c1.getWinner() + 1));
		
		
	}

}
