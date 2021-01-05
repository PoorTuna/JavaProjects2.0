
public class Attack
{
	private String target;
	private String attackType;
	private int volume;
	private boolean isActive;
	
	public Attack(){
		this.target = null;
		this.attackType = null;
		this.volume = 0;
		this.isActive = false;
	}
	public Attack(String target,String AttackType){
		this.target = target;
		this.attackType = AttackType;
		this.volume = 0;
		this.isActive = false;
	}
	public Attack(String target,String AttackType,int volume){
		this.target = target;
		this.attackType = AttackType;
		this.volume = volume;
		this.isActive = false;
	}
	
	public Attack(String target){
		this.target = target;
		this.attackType = null;
		this.volume = 0;
		this.isActive = false;
	}
	
	public String getTarget(){
		return this.target;
	}
	public String getAttackType(){
		return this.attackType;
	}
	public int getVolume(){
		return this.volume;
	}
	public boolean getActive(){
		return this.isActive;
	}
	public void incVolume(){
		this.volume++;
	}
	public void activate(){
		this.isActive = true;
	}
	
	public static void monitorAttacks()
	{
	    Attack attack1 = new Attack();
	    Attack attack2 = new Attack("Johnny");
	    Attack attack3 = new Attack("Jennifer", "Trojan horses");
	    attack3.incVolume();
	    attack2.activate();
	    System.out.println("First attack: " + attack1);
	    System.out.println("Second attack: " + attack2);
	    System.out.println("Third attack: " + attack3);
	}
	
	public static Attack combineAttacks(Attack a1, Attack a2){
		if( a1.getTarget().equals(a2.getTarget()) && a1.attackType.equals(a2.attackType) && a1.getActive() == a2.getActive()){
			return new Attack(a1.(),a1.getAttackType(),a1.getVolume() * a2.getVolume());
		}
		
		return null;
	}

	public static void main(String[] args)
	{
		Attack a1 = combineAttacks(new Attack("xd","xd",10),new Attack("xdd","xd",50));
		if (a1 != null){
		System.out.println(a1.getVolume());
		}
		else{
			System.out.println(a1);
		}
	}

}
