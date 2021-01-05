public class gameoflife
{

	private boolean[][] lfgame;
	
	// 	Construtors  -  בנאים

	public  gameoflife( int size )
	{
		this.lfgame = new boolean[size][size];
	}
	
	//  Copy Constructor  -   בנאי מעתיק
	//   קבלת מטריצה והעתקתה
	public  gameoflife( gameoflife lfgm )
	{
		this.lfgame = lfgm.lfgame;
	}
	
	
	//     Set + Get  -  קביעה ואיחזור
	
	//	Get Length of Square Matrix
	public int getMatrixLength()
	{
		return this.lfgame.length;
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
		int sumNeighbors = 0;
		if ( (y > 0 && y < this.lfgame.length - 2) && (x > 0) && (x < this.lfgame.length - 2))
			{
		if (this.lfgame[x-1][y-1] == true) // Left Bottom Diagonal side
		{
			sumNeighbors += 1;
		}
		if (this.lfgame[x+1][y+1] == true) // Right Top Diagonal side
		{
			sumNeighbors += 1;
		}
		if (this.lfgame[x-1][y+1] == true) // Left Top Diagonal side
		{
			sumNeighbors += 1;
		}
		if (this.lfgame[x+1][y-1] == true) // Right Bottom Diagonal side
		{
			sumNeighbors += 1;
		}
		if (this.lfgame[x+1][y] == true) // Right side
		{
			sumNeighbors += 1;
		}
		if (this.lfgame[x-1][y] == true) // Left side
		{
			sumNeighbors += 1;
		}
		if (this.lfgame[x][y-1] == true) // Top side
		{
			sumNeighbors += 1;
		}
		if (this.lfgame[x-1][y+1] == true) // Bottom side
		{
			sumNeighbors += 1;
		}
			}
		/// Corners and Borders
		
		if (x == this.lfgame.length - 1) // Right Corner
		{
			if (y == 0) //  // Right top corner
			{
					if (this.lfgame[x-1][y] == true) // Left side
					{
						sumNeighbors += 1;
					}
					if (this.lfgame[x-1][y-1] == true) // Right bottom diagonal
					{
						sumNeighbors += 1;
					}
					if (this.lfgame[x][y-1] == true) // Bottom Side 
					{
						sumNeighbors += 1;
					}	
						
			}
			
			if ((y > 0) && (y < this.lfgame.length - 1))  // // Right middle corner
			{
				if (this.lfgame[x-1][y-1] == true) // Left Bottom Diagonal side
				{
					sumNeighbors += 1;
				}
				if (this.lfgame[x-1][y+1] == true) // Left Top Diagonal side
				{
					sumNeighbors += 1;
				}

				if (this.lfgame[x-1][y] == true) // Left side
				{
					sumNeighbors += 1;
				}
				if (this.lfgame[x][y-1] == true) // Top side
				{
					sumNeighbors += 1;
				}
				if (this.lfgame[x-1][y+1] == true) // Bottom side
				{
					sumNeighbors += 1;
				}	
			}
			
			if (y == this.lfgame.length - 1) //  // Right bottom corner
			{
					if (this.lfgame[x-1][y] == true) // Left side
					{
						sumNeighbors += 1;
					}
					if (this.lfgame[x-1][y + 1] == true) // Right top diagonal
					{
						sumNeighbors += 1;
					}
					if (this.lfgame[x][y + 1] == true) // Top Side 
					{
						sumNeighbors += 1;
					}	
						
			}
		}	// Top Border
			if ((x > 0 && x < this.lfgame.length - 1) && (y == 0))
				{
			if(this.lfgame[x+1][y] == true) //right
			{
				sumNeighbors += 1;
			}
			if(this.lfgame[x-1][y] == true) //left
			{
				sumNeighbors += 1;
			}
			if(this.lfgame[x][y+1] == true) //bottom
			{
				sumNeighbors += 1;
			}
			if(this.lfgame[x+1][y-1] == true) //bottom right
			{
				sumNeighbors += 1;
			}
			if(this.lfgame[x-1][y-1] == true) //bottom left
			{
				sumNeighbors += 1;
			}
				}
			// Bottom border
			if (((x > 0) && (x < this.lfgame.length - 1))  && (y == this.lfgame.length - 1))
			{
				if (this.lfgame[x][y + 1] == true) // Top Side 
				{
					sumNeighbors += 1;
				}	
					
				if (this.lfgame[x-1][y+1] == true) // Left Top Diagonal side
				{
					sumNeighbors += 1;
				}
				
				if (this.lfgame[x-1][y + 1] == true) // Right top diagonal
				{
					sumNeighbors += 1;
				}
				
				if (this.lfgame[x-1][y] == true) // Left side
				{
					sumNeighbors += 1;
				}
				
				if (this.lfgame[x+1][y] == true) // Right side
				{
					sumNeighbors += 1;
				}

				
				if(x == 0) // Left Corner
				{
					if(y == 0) //top left corner
					{
						if(this.lfgame[x][y+1] == true) //bottom
						{
							sumNeighbors += 1;
						}
						if(this.lfgame[x+1][y] == true) //right
						{
							sumNeighbors += 1;
						}
						if(this.lfgame[x+1][y-1] == true) //bottom right
						{
							sumNeighbors += 1;
						}
						
					if(y == this.lfgame.length - 1) //bottom left corner
					{
						if(this.lfgame[x][y-1] == true) //top
						{
							sumNeighbors += 1;
						}
						if(this.lfgame[x+1][y] == true) //right
						{
							sumNeighbors += 1;
						}
					}
					if(this.lfgame[x+1][y-1] == true) //top right
					{
						sumNeighbors += 1;
					}
					
					if ((x == 0) && ((y < this.lfgame.length - 1) && (y > 0))) // left  middle corner
					{
						if(this.lfgame[x][y-1] == true) //top side
						{
							sumNeighbors += 1;
						}
						if(this.lfgame[x][y+1] == true) //bottom side
						{
							sumNeighbors += 1;
						}
						if(this.lfgame[x+1][y] == true) //right side
						{
							sumNeighbors += 1;
						}
						if(this.lfgame[x+1][y-1] == true) //top right diagonal 
						{
							sumNeighbors += 1;
						}
						if(this.lfgame[x+1][y-1] == true) //bottom right diagonal
						{
							sumNeighbors += 1;
						}
					}
		        
					}
				}
				
				
			
			
			
		}
		return sumNeighbors;
	}
	
	//    הגדרת דור אחד
	public void oneGeneration()
	{
		for (int x = 0 ; x < this.lfgame.length ; x++)
		{
			for (int y = 0 ; y < this.lfgame.length ; y++)
			{
				
			}
		}
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
}
