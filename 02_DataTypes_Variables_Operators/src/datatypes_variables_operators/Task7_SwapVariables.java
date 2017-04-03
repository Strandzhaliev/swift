package datatypes_variables_operators;

public class Task7_SwapVariables {

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c;

        System.out.println(a + " " + b);

        c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}
