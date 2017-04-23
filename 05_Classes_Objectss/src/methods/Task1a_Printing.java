package methods;

public class Task1a_Printing {

    static void printMethod(String name, int age) {
        System.out.printf("%s is %d years old.", name, age);
    }

    public static void main(String[] args) {
        printMethod("Stoian", 23);
    }
}
