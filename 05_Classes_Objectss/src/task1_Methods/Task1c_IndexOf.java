package task1_Methods;

public class Task1c_IndexOf {

    static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -85, 6};

        System.out.println(indexOf(arr, 14));

    }
}
