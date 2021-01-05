
public class allnumbers
{
	public static int lastOddValue(int[] arrayNum){
		int lastval = -1;
		for ( int i = 0 ; i < arrayNum.length ; i++){
			if ( arrayNum[i] %2 != 0){
				lastval = arrayNum[i];
			}
		}
		return lastval;
	}
	public static void main(String[] args)
	{
		int[] sex = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(lastOddValue(sex));
	}
}
