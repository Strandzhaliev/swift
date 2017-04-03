package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task2e_PrintFirstDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number;
        // System.out.println(n);
        if (n <= 9) {
            System.out.println(n);
        } else if (n > 10) {
            number = n / 10;
            System.out.println(number);

        }
    }
}
