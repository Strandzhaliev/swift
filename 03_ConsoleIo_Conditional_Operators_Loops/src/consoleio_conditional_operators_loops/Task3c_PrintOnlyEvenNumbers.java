package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task3c_PrintOnlyEvenNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = " ";
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x % 2 == 0) {
                result += x + " ";
            }
        }
        System.out.print(result);
        
    }
}
