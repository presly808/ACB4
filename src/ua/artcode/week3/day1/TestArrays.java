package ua.artcode.week3.day1;

public class TestArrays {

	public static void main(String[] args) {
		int[] mas = new int[5];
		mas[0] = 12;
		mas[1] = 22;
		mas[2] = 33;
		mas[3] = 56;
		mas[4] = 11;
		
		int num = mas[2];
		
		mas[3] = mas[0];
		
		byte[] byteMas = new byte[2];// byte , byte
		
		double[] nums = {2.4, 1.1, 4.5, 67.2};
		
		int size = nums.length;
		System.out.println(size);
		
		System.out.println(mas[0]);
		System.out.println(mas[1]);
		System.out.println(mas[2]);
		System.out.println(mas[3]);
		System.out.println(mas[4]);
		
		
	}

}
