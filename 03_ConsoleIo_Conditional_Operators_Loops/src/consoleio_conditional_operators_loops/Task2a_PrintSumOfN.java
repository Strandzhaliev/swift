package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        int num = sc.nextInt();

        while (counter <= num) {
            sum += counter++;
        }
        System.out.println(sum);

    }
}
