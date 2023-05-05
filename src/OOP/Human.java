package OOP;

import java.util.Objects;

public class Human {
    private final String name;
    private final String surName;

    public Human(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "This Human name is " + name + " and surname is " + surName;
    }
}
