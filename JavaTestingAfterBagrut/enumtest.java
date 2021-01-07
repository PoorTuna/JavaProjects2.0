enum str_list{
	man,
	ptds,
	lmao,
	ayo
	
}
public class enumtest
{

	
	public static void main(String[] args){

		String[] str_list1 = {"1-","-","3-","-","5-","-","7-","-","9-"};
		
		for( str_list i : str_list.values()){
			System.out.println(i);
		}
	}
}
