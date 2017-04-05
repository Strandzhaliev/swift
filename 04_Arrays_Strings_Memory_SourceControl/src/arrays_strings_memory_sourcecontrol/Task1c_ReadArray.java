package arrays_strings_memory_sourcecontrol;

import java.util.Scanner;

public class Task1c_ReadArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = s.nextInt();
        }
        for (int x : array) {
            System.out.printf("%d,",x);
        }
    }
}
