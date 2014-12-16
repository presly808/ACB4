package ua.artcode.week4.day1;

import java.lang.*;
import java.util.Arrays;

import ua.artcode.MatrixHelper;

/**
 *
 */
public class TestMatrix {

    public static void main(String[] args) {
        int[][] matSquare = {
                {1,2,3},
                {4,5,6},
                {6,7,8}
        };

        int[][] mat = {
                {1,2,3},
                {4,2},
                {2}
        };

        int[][] genMat = MatrixHelper.genMatrix(4,3);

        System.out.println(MatrixHelper.toString(genMat));

    }


}
