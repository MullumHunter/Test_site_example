package Enkap_constructor_HashCode_toString_equals;

public class Penguin {
    private String colour;
    private String name;
    private String skill;
    private int height;

    @Override
    public int hashCode() {
        return 111;
    }

    public Penguin(String colour, String name, String skill, int height) {
        this.colour = colour;
        this.name = name;
        this.skill = skill;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        Penguin penguin = (Penguin) obj;
        return height >= penguin.height;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public int getHeight() {
        return height;
    }
}
