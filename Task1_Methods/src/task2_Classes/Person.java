package task2_Classes;

public class Person {

    String name;
    int age;

    public Person() {
        this.name = "No name";
        this.age = -1;
    }

    public Person(String newName) {
        this.name = newName;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            System.out.println(age);
        } else {
            System.out.println("ERROR");
        }
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        System.out.println("Hello I'm " + getName() + ". I'm " + getAge()
                + "years old.");

        return "I am John Doe";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 12;
        person.name = "Petar";
        person.introduce();
    }

}
