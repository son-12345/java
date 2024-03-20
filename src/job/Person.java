package job;

import java.util.Scanner;

public abstract class Person {
    String name;
    String email;
    int salary;

    public Person() {
        System.out.println("Creating a Person");
    }

    public Person(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        System.out.println("Creating Person with parameters");
    }
    public abstract int getBonus();
    //public abstract void input();
    public abstract void display();

}

