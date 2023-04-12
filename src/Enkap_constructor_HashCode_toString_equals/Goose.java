package Enkap_constructor_HashCode_toString_equals;

import java.util.Objects;

public class Goose {
    private String colour;
    private String name;
    private String skill;
    private int height;

    public Goose(String colour, String name, String skill, int height) {
        this.colour = colour;
        this.name = name;
        this.skill = skill;
        this.height = height;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == this)return  false;
        if(!(obj instanceof Goose))return false;
        Goose goose = (Goose) obj;
        return height >= goose.height;
    }


//    @Override
//    public boolean equals(Object obj) {
//        if (getClass() != obj.getClass())
//            return false;
//        Goose goose = (Goose) obj;
//        return height >= goose.height;
//    }

    @Override
    public String toString() {
        return "Определенно это птица" + name;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }


    public int getHeight() {
        return height;
    }

    public String getSkill() {
        return skill;
    }
}
