
public class BinNode<T>
{

	private BinNode<T> left;
	private BinNode<T> right;
	private T value;
	
	public BinNode(T value){
		this.value = value;
	}
	public BinNode(BinNode<T> left, T x,BinNode<T> right){
		this.left = left;
		this.value = x;
		this.right = right;
	}
	public void setLeft(BinNode<T> left){
		this.left = left;
	}
	
	public void setRight(BinNode<T> right){
		this.right = right;
	}
	
	public BinNode<T> getLeft(){
		return this.left;
	}
	
	public BinNode<T> getRight(){
		return this.right;
	}
	
	public T getValue(){
		return this.value;
	}
	
	public boolean hasLeft(){
		return this.left != null;
	}
	
	public boolean hasRight(){
		return this.right != null;
	}
	
	public String toString(){
		return this.value.toString();
	}
	
	public static <T> int isLeaf(BinNode<T> tree,BinNode<T> pos){
		if (tree == null)
			return 0;
		else{
			if ( tree == pos){
				if (tree.hasLeft() == tree.hasRight() == false)
					return 1;
			}
				return isLeaf(tree.getLeft(),pos) + isLeaf(tree.getRight(),pos);
			}
		}
	

	public static void main(String[] args){
		
	}

}