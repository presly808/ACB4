package ua.artcode.week2;

import java.util.Scanner;

public class MilkRobot {

	public static void main(String[] args) {
		
		System.out.println("START");
		// IN create scanner for console input
		Scanner sc = new Scanner(System.in);

		System.out.println("Input milk price");
		double milkPrice = sc.nextDouble();
		System.out.println("Input money");
		double money = sc.nextDouble();
		System.out.println("Input hour");
		int hour = sc.nextInt();
		String message = "Can't buy";

		if (milkPrice >= money) {
			System.out.println(message);
		} else if (hour >= 8 && hour < 22) {
			System.out.println("Can buy");
		} else {
			System.out.println("All markets are closed");
		}

		System.out.println("END");
	}

}
