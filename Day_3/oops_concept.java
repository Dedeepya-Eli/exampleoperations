package Day_3;

class dog {
	String Colour;
	String Breed;
	int age;
	double Height;
	boolean gender;

	void eating() {
		System.out.println("dog-eating");
	}

	void running() {
		System.out.println("dog-running");
	}

	void barking() {
		System.out.println("dog-barking");
	}

	void sleeping() {
		System.out.println("dog-sleeping");
	}

	void playing() {
		System.out.println("dog-playing");
	}
}


public class oops_concept {
	public static void main(String[] args) {
		dog d = new dog();
		d.Colour = "black";
		d.Breed = "lab";
		d.age = 10;
		d.Height = 7;
		d.gender = true;
		System.out.println(d.Colour);
		System.out.println(d.Breed);
		System.out.println(d.age);
		System.out.println(d.Height);
		System.out.println(d.gender);
		d.eating();
		d.running();
		d.barking();
		d.playing();
		d.sleeping();
	}

}
