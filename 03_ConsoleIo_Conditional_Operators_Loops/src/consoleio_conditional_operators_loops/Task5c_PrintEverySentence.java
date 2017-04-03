package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task5c_PrintEverySentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for (char ch : str.toCharArray()) {
            System.out.print(ch);
            if (ch == '.' || ch == '!' || ch == '?') {
                System.out.println();
            }
        }
    }
}
