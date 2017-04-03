package consoleio_conditional_operators_loops;

public class Task4b_PrintZFigure {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 2; j < n; j++) {
            for (int k = 0; k < n - j; k++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
