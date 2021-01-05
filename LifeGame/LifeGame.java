	import java.util.Random;

	public class LifeGame
	{

		private boolean[][] lfgame;
		private int size;
		
		public  GameOfLife( int size )
		{
			this.size = size;
		}
		
		//  Copy Constructor  -   בנאי מעתיק
		//   קבלת מטריצה והעתקתה
		public  GameOfLife( GameOfLife lfgm )
		{
			this.size = lfgm.size;
		}
		
		
		//     Set + Get  -  קביעה ואיחזור
		
		//	Get Length of Square Matrix
		public int getMatrixLength()
		{
			return this.size;
		}
		
		
		// ********* One Item in Matrix Methods **********
		
		//  Set value at position p in Matrix
		public void setMatrixValue(int x , int y)
		{
			this.lfgame[x][y] = true;
		}
		
		//	Get value from position p in Matrix
		public boolean getMatrixValue(int x , int y)
		{
			return this.lfgame[x][y];
		}
		

		//  ספירת השכנים לתא מסויים
		public int countNeighbors(int x , int y)
		{
			
		}
		
		//    הגדרת דור אחד
		public void oneGeneration()
		{
			
		}
		
		//  toString
		public String  toString()
		{
			String s = "\n***  Life Game  ***\n\n    ";
			for (int j=1 ; j < this.lfgame[0].length-1 ; j++)
				s += j + "   " ;
			s += "\n" ;
			for (int i=1 ; i < this.lfgame.length-1 ; i++)
			{
				s += "\n"+i + ":  ";
				for (int j=1 ; j < this.lfgame[i].length-2 ; j++)
					if (this.lfgame[i][j])
							s += "X" + " , ";
						else
							s += " " + " , ";
				
				if (this.lfgame[i][this.lfgame[i].length-2])
					s += "X";
				else
					s += " ";
		
			}
			return s+"\n";
		}
		
		public static void main(String[] args)
		{
			GameOfLife lfg = ____________________________________________;
			System.out.println(lfg. ______________________ );
			
			GraphicMatrixGameOfLife lfgGM = 
				new GraphicMatrixGameOfLife(
	"Graphic Matrix Game Of Life",lfg);
			for (int i = 0 ; i < ___________ ; i++)
			{
				try {
				    Thread.sleep(1000); //1000 milliseconds is one second.
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				______________.oneGeneration();
				System.out.println(lfg. ______________________ );
				lfgGM = new GraphicMatrixGameOfLife(
	"Graphic Matrix Game Of Life",lfg);	
			}
			System.out.println(lfg.countNeighbors(3, 4));
			

			
		}

	}


}
