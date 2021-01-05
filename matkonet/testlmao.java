public class testlmao
{

	public static int goOverBinary(BinNode<Integer> I){
		if (I == null){
			return 0;
		}
		else{
			return goOverBinary(I.getLeft()) + goOverBinary(I.getRight()) + 1;
		}
	}
	public static <T> int isLeaf(BinNode<T> tree,BinNode<T> pos){
		if (tree == null)
			return 0;
		else{
			if ( tree == pos){
				if (tree.hasLeft() == false && tree.hasRight() == false)
					return 1;
			}
				return isLeaf(tree.getLeft(),pos) + isLeaf(tree.getRight(),pos);
			}
		}
	
	public static void main(String[] args)
	{
		String a1 = "lmao";
		String a2 = "lmao";
		//System.out.println(a1.equals(a2));
		BinNode<Integer> b1 = new BinNode<Integer>(new BinNode<Integer>(new BinNode<Integer>(3),2,new BinNode<Integer>(4)),1,new BinNode<Integer>(5));
		BinNode<Integer> b2 = b1.getLeft().getLeft();
		System.out.println(isLeaf(b1,b2));
		//System.out.println(b2.getValue());
		//System.out.println(goOverBinary(b1));
		//Object o1 = new Object();
	}

}
