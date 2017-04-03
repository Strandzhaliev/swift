package datatypes_variables_operators;

public class Task9_LeapYear {

    public static void main(String[] args) {
        int years = 2016;
        boolean res = ((years % 4 == 0) && (years % 100 != 0)) || ((years % 400 == 0));
        System.out.println(years + " " + res);

    }
}
