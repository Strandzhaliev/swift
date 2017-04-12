package task1_Methods;

public class Task1b_AreEqual {

    static boolean areaEqulas(int a, int b) {
        if (a == b) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
        return true;
    }

    public static void main(String[] args) {
        areaEqulas(12, -52);
    }
}
