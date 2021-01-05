import java.util.*;
public class FormMain
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Form f1 = new Form();
		int count = 0 ; 
		int check = 0 ;
		
		
		f1.setNumbers();
		
		System.out.println("Please set the size [Rigged].");
		f1.setSize(5);
		
		System.out.println("Please set the prize.");
		String prize = in.nextLine();
		f1.setPrize(prize);
		
		System.out.println("Size is : " + f1.getSize());
		System.out.println("Prize is : " + f1.getPrize());
		
		System.out.println("//////////////");
		System.out.println("Test - numbers are : " + f1.getNumbers());
		
		while ( count < 10 || check == f1.getSize())
		{
			System.out.println("Please guess a number!");
			int number = in.nextInt();
			if (f1.isGoodGuess(number) == true )
			{
				check ++ ;
			}

			count ++ ; 
		}
		
		if ( check == 1)
		{
			System.out.println("Hurray you won the lottery! [a prize of : " + f1.getPrize() + " Shmekels! ]");
		}
		
		else
		{
			System.out.println("Loser, perhaps next time!");
		}
		
	}

}
