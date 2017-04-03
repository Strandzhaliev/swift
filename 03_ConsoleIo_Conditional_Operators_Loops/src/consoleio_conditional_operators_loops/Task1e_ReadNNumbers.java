package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task1e_ReadNNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entered broi number: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            int x = scan.nextInt();
            System.out.println(x);

        }

    }
}
