package family;

public class Child extends Parent
{
	public static void main(String[] args)
	{
		Child c = new Child();
		System.out.println(c.eyeColor);
		c.sayHi();
	}
	
	public void sayHi(){
		System.out.println("Bye");
	}
	

}
