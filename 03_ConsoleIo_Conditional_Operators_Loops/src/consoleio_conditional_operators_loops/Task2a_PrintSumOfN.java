package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
