package day_1;

import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
        DisplayMenu();
		System.out.println(" choose your vote:");
	    int vote = scr.nextInt();
	    switch(vote) {
	    case 1:
	    	JSP();
	    	break;
	    case 2:
	    	TDP();
	    	break;
	    case 3:
	    	BJP();
	    	break;
	    case 4:
	    	YSR();
	    	break;
	    case 5:
	    	NOTA();
	    	break;
	    }
		scr.close();
	}

	private static void DisplayMenu() {
		// TODO Auto-generated method stub
		System.out.println("\t1 JSP"+ "\n"+"\t2 TDP"+"\n"+"\t3 BJP"+"\n"+"\t4 YSR"+"\n"+"\t5 NOTA");
	}

	private static void NOTA() {
		// TODO Auto-generated method stub
		System.out.println("NOTA");
	}

	private static void YSR() {
		// TODO Auto-generated method stub
		System.out.println("YSR");
	}

	private static void BJP() {
		// TODO Auto-generated method stub
		System.out.println("BJP");
	}

	private static void TDP() {
		// TODO Auto-generated method stub
		System.out.println("TDP");
	}

	private static void JSP() {
		// TODO Auto-generated method stub
		System.out.println("JSP");
	}

	
}
