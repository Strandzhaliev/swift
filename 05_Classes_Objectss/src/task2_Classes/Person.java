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
        age = -1;
    }

    public Person(String name, int age) {
        this.name = name;
        if (age >= 0 && age <= 150){
            this.age = age;
        }else {
            System.out.println("ERROR: Age in incorrect");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        if(name.equals("No name") && age == -1) {
            return "I am John Doe";
        } else if (age == -1) {
            return String.format("Hello I'm %s name", name);
        } else {
            return String.format("Hello I'm %s name. I am %d years old.", name, age);
        }
                
    }
}
