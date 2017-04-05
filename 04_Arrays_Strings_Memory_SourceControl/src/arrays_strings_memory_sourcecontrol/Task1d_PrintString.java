package arrays_strings_memory_sourcecontrol;

import java.util.Scanner;

public class Task1d_PrintString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        char[] ch = line.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

    }

}
