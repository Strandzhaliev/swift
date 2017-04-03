package consoleio_conditional_operators_loops;

import java.util.Scanner;

public class Task2h_IsPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        if (n % n == 0 && n % 1 == 0) {
//            if (n >= 1) {
//                System.out.println(true);
//            }
//        } else {
//            System.out.println(false);
//        }

        if( n == 1 ){
            System.out.println("true and false");
            return;
        }
        
        if( n % 2 == 0) {
            System.out.println("false");
            return;
        } 
        
        for(int i = 3; i * i <= n; i += 2){
            if( n % i == 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
