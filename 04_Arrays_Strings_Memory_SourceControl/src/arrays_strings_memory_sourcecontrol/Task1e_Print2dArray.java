package arrays_strings_memory_sourcecontrol;

import java.util.Arrays;

public class Task1e_Print2dArray {

   public static void main(String[] args) {
       int col = 4;
       int row = 4;
       int counter = 1;
       int [][] matrix = new int[col][row];
       for (int i = 0; i < col; i++) {
           for (int k = 0; k < row; k++) {
               matrix[i][k] = counter;
               counter++;
               System.out.print(" " + matrix[i][k]);
           }
           System.out.println();
       }
        
    }
}
