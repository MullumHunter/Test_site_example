package oop;

public class Turtle {

    private final String suitColor;
    private final int power;

    public Turtle(String suitColor) {
        this.suitColor = suitColor;
        this.power = (int) (Math.random() * 5) + 3;
    }

    public String getSuitColor() {
        return suitColor;
    }

    public int getPower() {
        return power;
    }

}
