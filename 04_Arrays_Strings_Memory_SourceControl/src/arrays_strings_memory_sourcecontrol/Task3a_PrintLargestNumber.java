package arrays_strings_memory_sourcecontrol;

import java.util.Scanner;

public class Task3a_PrintLargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        for (int i = 0; i < num; i++) {

            int x = sc.nextInt();
            if (x > max) {
                max = x;

            }
        }
        System.out.println(max);

    }
}
