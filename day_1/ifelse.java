package day_1;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the age:");
	    int age=scr.nextInt();
	    if (age >= 18 && age <= 100) {
		System.out.println("eligible");
	   }else {
		System.out.println("not eligible");
	}
    scr.close();
}
}
