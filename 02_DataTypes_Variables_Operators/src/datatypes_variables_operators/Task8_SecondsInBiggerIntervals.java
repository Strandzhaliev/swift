package datatypes_variables_operators;

public class Task8_SecondsInBiggerIntervals {

    public static void main(String[] args) {

        int seconds = 1800;
        int hour;
        int min;
        int day;

        System.out.println(seconds + " секунди:");
        min = seconds / 60;
        System.out.println(min + " минути");
        hour = min / 60;

        if (hour > 24) {
            int res = hour - 24;
            System.out.println(res + " часа");
        }
        day = hour / 24;
        System.out.println(day + " дни");

    }
}
