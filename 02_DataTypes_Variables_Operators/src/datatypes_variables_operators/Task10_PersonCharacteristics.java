package datatypes_variables_operators;

public class Task10_PersonCharacteristics {

    public static void main(String[] args) {

        String name = "Georgi";
        String lastName = "Georgiev";
        int ageBorn = 1982;
        double weigh = 80.5;
        float height = 180.5f;
        String profession = "teacher";
        int age = 2017 - ageBorn;

        System.out.println(name + " " + lastName + " is " + age + " years old."
                + " His weight is " + weigh + " and he is " + height + " sm tall."
                + " He is a " + profession + ".");
    }
}
