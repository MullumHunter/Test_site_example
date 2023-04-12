package Enkap_constructor_HashCode_toString_equals;

import java.util.Objects;

//Давай так - напиши пож-та класс Копибара) пусть у нее будет имя) и переопредели методы euqals & hashCode
public class Capybara {
    private final String name;

    public Capybara(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }



    @Override
    public boolean equals(Object o) {
        if(o == this.getClass()) return true;
        Capybara copybara = (Capybara) o;
        return name == copybara.name;
    }

    public String getName() {
        return name;
    }
}
