package ua.artcode;

public class ArrayHelper {

	//public static <returnType> <methodName>(<ArgType1> <ArgName1>) 
	//public static <type> <name>()
	//public static <type> <name>(<type> <name>, <type> <name>, <type> <name>)
	
	public static int sum(int a, int b, int c){
		int s = a + b + c;
		return s;
	}
	
	//write method
	public static void showArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] genMas(int size, int range){
		int[] mas = new int[size];
		for(int i = 0; i < mas.length; i++){
			mas[i] = (int)(Math.random() * range);
		}
		return mas;
	}
	
}
