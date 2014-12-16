package ua.artcode;

/**
 *
 */
public class MatrixHelper {

    public static int[][] genMatrix(int rowsSize, int coilsSize){
        int[][] mat = new int[rowsSize][coilsSize];
        for(int i = 0; i < mat.length; i++){ //rows index
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = ArrayHelper.genRandomRange(10,100);
            }
        }
        return mat;
    }

    public static String toString(int[][] mat){
        String res = "";
        for(int i = 0; i < mat.length; i++){ //rows index
            for (int j = 0; j < mat[i].length; j++) {
                res = res + mat[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

    public static int[][] rotate(int[][] mat){
        int[][] res = new int[mat.length][mat.length];
        for(int i = 0; i < mat.length; i++){
            int coilResPos = mat.length - i - 1;
            for(int j = 0; j < mat[i].length; j++){
                res[j][coilResPos] = mat[i][j];
            }
        }
        return res;
    }




}
