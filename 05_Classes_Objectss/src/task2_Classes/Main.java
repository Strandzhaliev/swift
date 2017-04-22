package task2_Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] split = input.split(" ");

        Car car = new Car();
        car.brand = split[0];
        car.model = split[1];
        car.yearProduced = Integer.parseInt(split[2]);
        car.horsePower = Integer.parseInt(split[3]);

        System.out.println(car.getInsurancePrice());
    }
}
