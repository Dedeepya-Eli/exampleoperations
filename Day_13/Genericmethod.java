package Day_13;
class vehicle{
	public static<t> void arraylist(t[] array) {
		for (t bikes : array) {
			System.out.print(bikes + " ");
		}
	}
}
public class Genericmethod {
	public static void main(String[] args) {
		Integer[] i = {1,2,3,4,5,6};
		String[] s = {"hi", "hello"};
		
		vehicle.arraylist(i);
		vehicle.arraylist(s);
	}

}
