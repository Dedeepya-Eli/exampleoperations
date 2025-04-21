package Day_5;
abstract class bike{
	String name;
	abstract void start();
	
}
class ktm extends bike{
	void start() {
		System.out.println("ktm is strating");
	}
}
public class abstraction_concept {
	public static void main(String[] args) {
		ktm k=new ktm();
		k.start();
	}

}
