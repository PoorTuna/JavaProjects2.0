
public class bnode<T>
{

		private T value;
		private bnode<T> Right;
		private bnode<T> Left;
		
		public bnode(){
			this.value = null;
			this.Right = null;
			this.Left = null;
		}
		public bnode(T val){
			this.value = val;
			this.Right = null;
			this.Left = null;
		}
		
		public void setRight(bnode<T> Right){
			this.Right = Right;
		}
		
		public void setLeft(bnode<T> Left){
			this.Left = Left;
		}
		
		public void setValue(T val){
			this.value = val;
		}
		
		public bnode<T> getRight(){
			return this.Right;
		}
		public bnode<T> getLeft(){
			return this.Left;
		}
		public T getValue(){
			return this.value;
		}
		
		
		public static bnode<Integer> firstLeft(bnode<Integer> pos){
			while(pos.getLeft() != null){
				pos = pos.getLeft();
			}
			return pos;
		}
		
		public static bnode<Integer> firstRight(bnode<Integer> pos){
			while(pos.getRight() != null){
				pos = pos.getRight();
			}
			return pos;
		}
		
		public static boolean what(bnode<Integer> pos){
			bnode<Integer> left = firstLeft(pos);
			bnode<Integer> right = firstRight(pos);
			int sum = left.getValue() + right.getValue();
			
			left = left.getRight();
			right = right.getLeft();
			
			while( (left != right) && (left.getRight() != right) && (right.getValue() + left.getValue() == sum) ){
				left = left.getRight();
				right = right.getLeft();
			}
			if (left == right){
				return right.getValue() == sum;
			}
			
			if (left.getRight() == right)
			{
				return left.getValue() + right.getValue() == sum;
			}
			return false;
			
		}
		//ניתן להחליף את שלושת השורות האחרונות מכיוון שהמקרים היחידים שיכולים להיות במערך הזה הם שהמערך לא זוגי ואז התנאי הראשון מטפל בזה ושני המקרים האחרים הם שסכום שמאל וימין לא שווים וסכום שמאל וימין כן שווים כמו בכולם והתנאי == מטפל בכך.
		public static void main(String[] args)
		{

		}

	
}