package Day_2;

import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		
		int ch;
		do {
			DisplayMenu();
			ch=Integer.parseInt(scr.next());
			switch(ch) {
			case 1:
				Addition();
				break;
			case 2:
				Subtraction();
				break;
			case 3:
				System.exit(0);
				break;
				default:
					System.out.println("invalid");
			}
		}while(ch>0);
	}

	private static void Subtraction() {
		// TODO Auto-generated method stub
		
	}

	private static void Addition() {
		// TODO Auto-generated method stub
		

	}

	private static void DisplayMenu() {
		// TODO Auto-generated method stub
		System.out.println("enter your choose:");
		System.out.println("\t1 addition");
		System.out.println("\t2 subtraction");
	}
}
