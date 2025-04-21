package day_1;

import java.util.Scanner;

public class nested_if {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter height");
		double height= scr.nextDouble();
		System.out.println("enter weight");
		double weight= scr.nextDouble();
		if (height>= 5.5 && height<=6.2) {
		if (weight>= 50 && weight <= 90) {
			System.out.println(" eligible");
			
		}else {
			System.out.println(" not eligibe");
		}
		}
		else {
			System.out.println("error");
		}
		scr.close();
		}
			
		}
		
		
		


