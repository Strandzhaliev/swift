
package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task3b_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            sum+=number;
           
        }
        System.out.println(sum);
        
    }
}
