package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task2h_IsPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % n == 0 && n % 1 == 0) {
            if (n >= 1) {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
    }
}
