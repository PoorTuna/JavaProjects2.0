import java.util.Scanner;
public class classGrades
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numOfStudents = 20;  //in.nextInt();
		double[][] schoolGrades = new double[10][2];
		
		
		for( int x = 0 ; x < 10 ; x++)
		{
			for ( int i = 0 ; i < numOfStudents ; i++)
			{
			System.out.println( "CLASS : [ " + (x + 1) + " ]" + " Please enter the grade in History for student number : " +  (int)(i + 1));
			int grade = in.nextInt();
			schoolGrades[x][0] += grade;
			System.out.println( "CLASS : [ " + (x + 1) + " ]" + "Please enter the grade in CitizenShip for student number : " +  (int)(i + 1));
			grade = in.nextInt();
			schoolGrades[x][1] += grade;
			}
		}
		for(int i = 0 ; i < schoolGrades.length; i ++)
		{
			System.out.println("The average grade in History for class number " + (i + 1) + "is : " + schoolGrades[i][0] / numOfStudents );
			System.out.println("The average grade in CitizenShip class number " + (i + 1) + "is : " + schoolGrades[i][1] / numOfStudents );
		}
		
		
	}

}
