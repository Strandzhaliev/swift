package dateDifference;

public class SwiftDate2 {

    int year;
    int month;
    int day;

    public SwiftDate2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    boolean isLeapYear() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    int getCentury() {
        return year / 100 + 1;
    }

    public int getDaysDifference(SwiftDate2 other) {

        int x = this.getDaysFromBeginningOfTime();
        int y = other.getDaysFromBeginningOfTime();

        if (x < y) {
            return y - x + 1;
        } else {
            return x - y + 1;
        }
    }

    private int getDaysFromBeginningOfTime() {
        int x = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

        switch (month - 1) {
            case 11:
                x += 30;
            case 10:
                x += 31;
            case 9:
                x += 30;
            case 8:
                x += 31;
            case 7:
                x += 31;
            case 6:
                x += 30;
            case 5:
                x += 31;
            case 4:
                x += 30;
            case 3:
                x += 31;
            case 2:
                x += 28;
                if (isLeapYear()) {
                    x += 1;
                }
            case 1:
                x += 31;
        }

        x += day;

        return x;
    }

    String getInfo() {
        return "";
    }
}
