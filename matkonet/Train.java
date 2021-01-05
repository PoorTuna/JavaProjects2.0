
public class Train
{
	private String source;
	private String dest;
	private int carriageNum;
	
	public Train(String source, String dest, int carriageNum){
		this.source = source;
		this.dest = dest;
		this.carriageNum = carriageNum;
	}
	
	public Train(String source, String dest){
		this.source = source;
		this.dest = dest;
		this.carriageNum = 1;
	}
	
	public boolean addCarriage(){
		if(this.carriageNum <= 20){
			this.carriageNum++;
			return true;
		}
		return false;
	}
	
	public static int addCarriage(Train[] cars){
		int counter = 0 ;
		for (int i = 0 ; i < cars.length ; i++){
			if (cars[i].addCarriage()){
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args)
	{
		Train[] cars = new Train[14];
		for (int i = 0 ; i < cars.length ;i++){
			cars[i] = new Train("russia","israel");
		}
		System.out.println(addCarriage(cars));
	}

}
