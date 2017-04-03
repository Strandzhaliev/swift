package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task1c_ReadAge {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        if (number < 18 && number > 0) {
            System.out.println("NO");
        } else if (number >= 18) {
            System.out.println("YES");
        } else {
            System.out.println("ERROR");
        }
    }
}
