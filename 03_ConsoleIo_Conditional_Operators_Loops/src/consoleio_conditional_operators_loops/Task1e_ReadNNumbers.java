package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task1e_ReadNNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entered broi number: ");
        int num = scan.nextInt();
        int x = 0;
        //System.out.println(num);
        for (int i = 1; i <= num; i++) {
            x = scan.nextInt();
            x += i;

        }
        System.out.print(x + " ");
//        String draft = " ";
//        while (num > 0) {
//            int x = scan.nextInt();
//            draft += x;
//        }
//        System.out.println(draft);
    }
}
