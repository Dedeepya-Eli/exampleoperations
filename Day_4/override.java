package Day_4;
class institute{
	String name;
	String location;
	void branch() {
		System.out.println("branches");
	}
	String canteen() {
		return "num";
		
	}
	
}
class college extends institute{
	@Override
	void branch() {
		System.out.println("no.of branches");
	}
}

public class override {
	public static void main(String[] args) {
		institute i=new institute();
		i.branch();
		
	}

}
