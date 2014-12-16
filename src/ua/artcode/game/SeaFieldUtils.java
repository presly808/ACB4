package ua.artcode.game;

/**
 * Created by admin on 09.12.2014.
 */
public class SeaFieldUtils {


    public static char[][] genField(int size){
        char[][] field = new char[size][size];
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                field[i][j] = '#';
            }
        }
        return field;
    }

    public static String showField(char[][] field){
        String strField = "";
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                strField += field[i][j] + " ";
            }
            strField += "\n";
        }
        return strField;
    }


    public static boolean shoot(char[][] field, int pointI, int pointJ, int userI, int userJ){
        field[userI][userJ] = '*';

        if(pointI == userI && pointJ == userJ){
            System.out.println("You win");
            return true;
        }

        String hint = "";
        if(pointI < userI){
            hint += "UP-";
        } else if(pointI > userI){
            hint += "DOWN-";
        }

        if(pointJ < userJ){
            hint += "LEFT";
        } else if(pointJ > userJ){
            hint += "RIGHT";
        }

        System.out.println(hint);

        return false;
    }

}
