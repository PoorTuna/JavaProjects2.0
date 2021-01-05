
public class binaryQuestion
{

	
	public static boolean isgoingup(BinNode<Integer> b1){
		if (b1.getLeft() == null && b1.getRight() == null){
			return true;
		}
		else{
			if (b1.getLeft() != null){
			if (b1.getValue() < b1.getLeft().getValue()){
				return isgoingup(b1.getLeft());
				
				}
			}
			else if( b1.getRight() != null){
			if (b1.getValue() < b1.getRight().getValue()){
				return isgoingup(b1.getRight());
			}}
			return false;
		}
	}
	public static void main(String[] args)
	{
		BinNode<Integer> b1 = new BinNode<Integer>(new BinNode<Integer>(new BinNode<Integer>(4),2,new BinNode<Integer>(4)),1,new BinNode<Integer>(5));
		BinNode<Integer> b2 = b1.getLeft().getLeft();
		System.out.println(isgoingup(b1));
	}

}
