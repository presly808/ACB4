package ua.artcode.week3.day1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Left range = ");
		int lRange = sc.nextInt();
		System.out.println("Right range = ");
		int rRange = sc.nextInt();
		
		//Check various situations
		int size = rRange - lRange; //size of array
		int[] mas = new int[size]; // create array
		
		String mess = "Your range (" + lRange + ", "+ rRange + ")";
		
		System.out.println(mess);
		
		for(int i = 0, j = rRange; i < mas.length; i++, j--){
			mas[i] = j;
		}
		
		String res = "Your array is ";
		for(int i = 0; i < mas.length; i++){
			res = res + mas[i] + " ";
		}
		
		
		
		System.out.println(res);
		
		
		
		
	}

}
