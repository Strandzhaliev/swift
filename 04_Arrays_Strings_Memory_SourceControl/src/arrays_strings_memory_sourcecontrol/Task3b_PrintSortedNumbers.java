package arrays_strings_memory_sourcecontrol;

import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintSortedNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        for (int a : array) {
            System.out.println(a);
        }
        

    }
}
