package employeeSalarySort;

import java.util.Scanner;

public class Employee {

    String name;
    double salary;
    String position;
    String department;
    int age;
    String email;

    public Employee(String NewName, double NewSalary, String NewPosition,
            String NewDepartment, int NewAge, String NewEmail) {
        this.name = NewName;
        this.salary = NewSalary;
        this.position = NewPosition;
        this.department = NewDepartment;
        this.age = NewAge;
        this.email = NewEmail;
    }

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Not valid salary");
        }

    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("ERROR");
        }
    }

    public void setEmail(String email) {
        if (email == null) {
            this.email = "   ";
        } else {
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        
    }
}
