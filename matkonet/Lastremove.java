import unit4.collectionsLib.*;
public class Lastremove
{

	public static Integer LastAndRemove(Stack<Integer> a1){
		Stack<Integer> temp = new Stack<Integer>();
		while(a1.isEmpty() == false){
			temp.push(a1.pop());
			
		}
		int value = temp.pop();
		while(temp.isEmpty() == false){
			a1.push(temp.pop());
		}
		return value;
	}
	public static void main(String[] args)
	{
		Stack<Integer> a1 = new Stack<Integer>();
		a1.push(10);
		a1.push(5);
		a1.push(3);
		System.out.println(LastAndRemove(a1));
	}

}
