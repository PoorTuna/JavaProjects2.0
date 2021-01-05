import unit4.collectionsLib.*;
public class Names
{
	
	public static Node<String> convertNames(Node<Character> lst){
		Node<String> str = new Node<String>(null);
		Node<String> temp = str;
		String name = "";
		while(lst.getNext() != null){
			if( lst.getInfo().equals("*")){
				temp.setInfo(name);
				name = "";
				temp = temp.getNext();
			}
			name += lst.getInfo();
			lst = lst.getNext();
		}
		return str;
	}
	public static void main(String[] args)
	{

	}

}
