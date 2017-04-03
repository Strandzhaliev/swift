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

    }
}
