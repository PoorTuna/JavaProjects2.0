import unit4.collectionsLib.*;
public class Pole
{
	private Node<Ring> n1;
	public Pole()
	{
		this.n1 = new Node<Ring>(new Ring("L",0));
	}
	
	public Node<Ring> getPole(){
		return this.n1;
	}
	
	public void add(Ring D){
		Node<Ring> temp = new Node<Ring>(D);
		temp.setNext(this.n1);
		this.n1 = temp;
	}
	
	public Ring remove(){
		Ring value = this.n1.getInfo();
		this.n1 = this.n1.getNext();
		return value;
	}
	
	public boolean isEmpty(){
		if (this.n1.getInfo() == null)
			return true;
		else
			return false;
	}
	
	public void sort(){
		boolean check = true;
		Node<Ring> poleptr = this.n1;
		while (check){
			check = false;
			if (poleptr.getNext() == null){
				poleptr = this.n1;
				if (poleptr.getInfo().getSize() == "L" && poleptr.getNext().getInfo().getSize() == "S"){
					check = true;
					Ring temp = poleptr.getInfo();
					poleptr.setInfo(poleptr.getNext().getInfo());
					poleptr.getNext().setInfo(temp);
					
					poleptr = poleptr.getNext();
					
				}
			}
			
		}
		
		// זמן הריצה של התוכנית היא O(n) מכיוון שהתכנית רצה על המערך את כמות הפעמים של האורך שלה.
	}
	public static void main(String[] args)
	{
		Pole p1 = new Pole();
		System.out.println(p1.getPole().getInfo().getColor());
	}

}
