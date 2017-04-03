package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task2f_PrintMirrorNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse = 0;
        int n;
        while (number != 0) {
            n = number % 10;
            reverse = reverse * 10 + n;
            number = number / 10;
        }
        System.out.println(reverse);

        int n1 = 4;
        int[][] arr = new int[n1][n1];

        int ind = 1;
        int ii = 0;
        int jj = 1;

        //  while(true) {
        while (jj >= 0) {
            arr[ii][jj] = ind;
            ii++;
            jj--;

        }

        ii++;
        jj++;

        while (ii <= 0) {
            arr[ii][jj] = ind;
            ind++;
            ii--;
        }
        // }
    }
}
