package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task2g_PrintSumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        System.out.println(sum);
    }
}
