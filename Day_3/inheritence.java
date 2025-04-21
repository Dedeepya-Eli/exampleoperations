package Day_3;
class Phones{
	String Colour;
	double Size;
	double Weight;
	String Model;
    void camera(){
		System.out.println("camera quality");
	}
    void playstore() {
    	System.out.println("playstore version");
    }
	void ram() {
		System.out.println("ram size");
	}
	void calender() {
		System.out.println("calender names");
	}
	void calculater() {
		System.out.println("calculator quality");
	}
}
class Oppo extends Phones{
	double Version;
	int Rom;
}
public class inheritence {
	public static void main(String[] args) {
Oppo o=new Oppo();
o.Colour="black";
o.Size=5.8;
o.Weight= 10;
o.Model="f_seies";
o.Version= 10;
o.Rom= 8;
System.out.println(o.Colour);
System.out.println(o.Size);
System.out.println(o.Weight);
System.out.println(o.Model);
System.out.println(o.Version);
System.out.println(o.Rom);
o.camera();
o.playstore();
o.ram();
o.calender();
o.calculater();
	}

}
