package task2_Classes;

public class Car {

    String mark;
    String model;
    int kw;
    int year;

    public Car(String newMark, String newModel, int newKw, int newYear) {
        this.mark = newMark;
        this.model = newModel;
        this.kw = newKw;
        this.year = newYear;
    }

    public void setName(String name) {
        this.mark = name;
    }

    public String getMark() {
        return mark;
    }

    public void setModel(String name) {
        this.model = name;
    }

    public String getModel() {
        return model;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public int getKw() {
        return kw;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int insuranceCategory() {
        int y = 2017;
        int result = y - year;
        if (result > 0 && result < 8) {
            System.out.println("Kat1");
        } else if (result > 8 && result <= 15) {
            System.out.println("Kat2");
        } else if (result > 15 && result <= 25) {
            System.out.println("Kat3");
        } else if (result > 25) {
            System.out.println("Kat4");
        }

        return 0;
    }

    public static void main(String[] args) {
        Car car = new Car("audi", "a4", 131, 1986);

        car.insuranceCategory();
    }
}
