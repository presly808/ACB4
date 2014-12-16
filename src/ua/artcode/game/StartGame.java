package ua.artcode.game;

import ua.artcode.ArrayHelper;

import java.util.Scanner;

/**
 * Created by admin on 09.12.2014.
 */
public class StartGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input field size");
        int size = sc.nextInt();

        char[][] field = SeaFieldUtils.genField(size);

        int targetI = ArrayHelper.genRandomRange(0,size);
        int targetJ = ArrayHelper.genRandomRange(0,size);

        int userI = -1;
        int userJ = -1;

        int range = size - 1;

        do {

            System.out.println(SeaFieldUtils.showField(field));

            System.out.println("Input i 0-" + range);
            userI = sc.nextInt();

            System.out.println("Input j 0-" + range);
            userJ = sc.nextInt();

         } while (!SeaFieldUtils.shoot(field, targetI, targetJ, userI, userJ));


        System.out.println(SeaFieldUtils.showField(field));

    }
}
