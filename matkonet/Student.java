
public class Student
{

	private String name = null;
	private int[] arrTest = new int[3];
	
	public Student()
	{
		this.name = null;
		for (int i = 0 ; i < 3 ; i++)
		{
			this.arrTest[i] = 0;
		}
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setTestsGrade(int[] arrTest)
	{
		for (int i = 0 ; i < 3 ; i++)
		{
			this.arrTest[i] = arrTest[i];
		}
	}
	
	public int getAverage()
	{
		return ( this.arrTest[0] + this.arrTest[1] + this.arrTest[2] ) / 3 ;
	}


public static void main(String[] args){
	Student s1 = new Student();
	int[] xd = {1,2,3};
	s1.setName("Rony");
	s1.setTestsGrade(xd);
	System.out.println(s1.getAverage());
	
	

}
	}
