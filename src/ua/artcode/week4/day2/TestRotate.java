package ua.artcode.week4.day2;

import ua.artcode.MatrixHelper;

/**
 * Created by admin on 09.12.2014.
 */
public class TestRotate {


    public static void main(String[] args) {
        int[][] mat = MatrixHelper.genMatrix(5,5);
        System.out.println("Before rotate");
        System.out.println(MatrixHelper.toString(mat));


        System.out.println("After rotate");
        int[][] rotate = MatrixHelper.rotate(mat);
        String x = MatrixHelper.toString(rotate);
        System.out.println(x);


    }
}
