package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task5a_StringWoVowels {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                case 'A':
                case 'o':
                case 'O':
                case 'e':
                case 'E':
                case 'u':
                case 'U':
                case 'i':
                case 'I':
                case 'y':
                case 'Y':
                    break;
                default:
                    System.out.print(c);
                    break;
            }
        }

        System.out.println();

//        String newString = str.replace("o", "");
//        String s2 = newString.replace("e", "");
//        String s3 = s2.replace("a", "");
//        String s4 = s3.replace("y", "");
//        System.out.println(s4);
    }
}
