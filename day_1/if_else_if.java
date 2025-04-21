package day_1;

import java.util.Scanner;

public class if_else_if {
	public static void main(String[] args) {
		System.out.println("enter the cgpa:");
		Scanner scr= new Scanner(System.in);
		double cgpa= scr.nextDouble();
		if (cgpa>= 9.0 && cgpa <= 10) {
			System.out.println("grade A");
		}else if (cgpa >= 8.0 && cgpa <= 8.9) {
			System.out.println(" grade B");
			
		}else if (cgpa >= 7.0 && cgpa <= 7.9) {
			System.out.println("grade C");
			
		}else if (cgpa>= 6.0 && cgpa<= 6.9) {
			System.out.println("grade D");
			
		}else {
			System.out.println(" failed");
		}
		scr.close();
	}

}
