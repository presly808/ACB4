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

    public static int minIndex(int[] mas){
        int minI = 0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[minI] > mas[i]){
                minI = i;
            }
        }
        return minI;
    }

    public static int maxIndex(int[] mas){
        int maxI = 0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[maxI] < mas[i]){
                maxI = i;
            }
        }
        return maxI;
    }

    public static void swap(int[] mas, int i, int j){
        int temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;
    }

    // 8 - 80
    // 8 + 0..72 = 8 .. 80
    public static int genRandomRange(int left, int right){
        return left + (int)(Math.random() * (right - left));
    }
	
}
