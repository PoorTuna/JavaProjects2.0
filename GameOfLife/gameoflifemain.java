
public class gameoflifemain
{

	/**
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		gameoflife lfg = new gameoflife(10);
		System.out.println(lfg );
		
		GraphicMatrixGameOfLife lfgGM = new GraphicMatrixGameOfLife("Graphic Matrix Game Of Life",lfg);
		for (int i = 0 ; i < ___________ ; i++)
		{
			try {
			    Thread.sleep(1000); //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			lfg.oneGeneration();
			System.out.println(lfg. ______________________ );
			lfgGM = new GraphicMatrixGameOfLife("Graphic Matrix Game Of Life",lfg);	
		}
		System.out.println(lfg.countNeighbors(3, 4));
		

		
	}

}
