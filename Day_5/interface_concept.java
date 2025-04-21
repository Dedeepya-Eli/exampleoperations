package Day_5;
interface vehicle{
	void strat();
	
}
class mg implements vehicle{
	public void strat() {
		System.out.println("car is strated");
	}
		
	
}
public class interface_concept {
	public static void main(String[] args) {
		mg g=new mg();
		g.strat();
	}

}
