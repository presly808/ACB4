package ua.artcode.week3.day1;

import java.io.Console;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Left range = ");
		int lRange = sc.nextInt();
		System.out.println("Right range = ");
		int rRange = sc.nextInt();
		
		//ternary operator
		
		// int i = if(lRange % 2 != 0) { 
		//               	return (lRange + 1); 
//						} else { 
		//					return lRange;	
		//				}
		
		//		condition           ret if true	   ret if false
		
 		
		for(int i = (lRange % 2 != 0) ? (lRange + 1) : lRange; 
									i <= rRange; i+=2){
			System.out.print(i + " ");
		}
		
		int i = rRange % 2 == 1 ? rRange : rRange - 1;
		while(i >= lRange){
			System.out.print(i + " ");
			i-=2;
		}
		
		
	}

}
