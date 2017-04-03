package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task3d_PrintReversedSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            result = x + " " + result;
        }
        System.out.println(result);

    }
}
