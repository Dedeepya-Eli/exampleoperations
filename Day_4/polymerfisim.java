package Day_4;

public class polymerfisim {
		int addition(int a,int b){
			return a+b;
		}
		int subtraction(int a, int b) {
			return a-b;
		}
		int multiplication(int a, int b) {
			return a*b;
		}
	
	public static void main(String[] args) {
		polymerfisim p=new polymerfisim();
		System.out.println(p.addition(2, 3));
		System.out.println(p.subtraction(2, 3));
		System.out.println(p.multiplication(2, 3));
	}

}
