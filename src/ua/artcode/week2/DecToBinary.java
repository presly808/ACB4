package ua.artcode.week2;

import java.util.Scanner;

public class DecToBinary {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int dec = scanner.nextInt();
		
		int div = dec;
		int mod = 0;
		
		String bin = "";
		
		while(div > 0){
			mod = div % 2;
			bin = mod + bin;
			div = div / 2;
		}
		
		System.out.println(dec + " = " + bin);
		
	}
}
