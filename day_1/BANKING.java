package day_1;

import java.util.Scanner;

public class BANKING {
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
        options();
		System.out.println("choose a option:");
		int a =scr.nextInt();
		switch(a) {
		case 1:
			deposite();
			break;
		case 2: 
			withdraw();
		case 3:
			availablebalance();
		case 4:
			minimumbalance();
			break;
		case 5:
			pinchange();
			break;
		case 6:
			services();
			break;
		default:
			invalid();
		}
		scr.close();
	}

	private static void invalid() {
		// TODO Auto-generated method stub
		System.out.println("invalid option");
	}

	private static void services() {
		// TODO Auto-generated method stub
		System.out.println("services");
	}

	private static void pinchange() {
		// TODO Auto-generated method stub
		System.out.println("pin change");
	}

	private static void minimumbalance() {
		// TODO Auto-generated method stub
		System.out.println("minimum balance");
	}

	private static void availablebalance() {
		// TODO Auto-generated method stub
		System.out.println("available balance");
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("with draw");
	}

	private static void deposite() {
		// TODO Auto-generated method stub
		System.out.println("deposite");
	}

	private static void options() {
		// TODO Auto-generated method stub
		System.out.println("\t1 deposite"+"\n"+"\t2 withdraw"+"\n"+"t3 available balance"+"\n"+"\t4 minimum balnace"+"\n"+"\t5 pin change"+"\n"+"\t6 srevices");
	}

}
