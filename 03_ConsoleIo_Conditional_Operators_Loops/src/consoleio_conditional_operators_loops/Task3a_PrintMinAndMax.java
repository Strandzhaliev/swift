package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task3a_PrintMinAndMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String count = "";
        while (n > 0) {
            int x = sc.nextInt();
            count += x;
            if (x == n);
            break;

        }
        System.out.println(count);
    }
}
