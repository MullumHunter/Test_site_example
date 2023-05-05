package OOP;

public class Person extends Human {
    private int age;

    public Person(String name, String surName, int age) {
        super(name, surName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
