package ua.artcode.week4.day1;

import ua.artcode.ArrayHelper;

import java.util.Scanner;

/**
 *
 */
public class MinMaxTest {

    public static void main(String[] args) {
        int[] mas = ArrayHelper.genMas(10, 100);
        int[] mas1 = mas;
        System.out.println("Before swap");
        ArrayHelper.showArr(mas);

        int minI = ArrayHelper.minIndex(mas);
        int maxI = ArrayHelper.maxIndex(mas);

        ArrayHelper.swap(mas, minI, maxI);
        System.out.println("After swap");
        ArrayHelper.showArr(mas);

    }

}
