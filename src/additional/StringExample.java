package additional;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String key1 = "name ";
		System.out.println("Input name");
		
		String value1 = sc.next();
		
		String key2 = " age ";// create variable
		System.out.println("Input age");
		int value2 = sc.nextInt();
		
		String key3 = " salary ";
		double value3 = 3000;
		char currSign = '$';
		
		String res = key1 + value1 + key2 + value2 + key3 + value3 + currSign;
		
		String res1 = key1 + " Vasia " + key2 + 30 + key3 + 3000.0;
		
		System.out.println(res);
	}

}
