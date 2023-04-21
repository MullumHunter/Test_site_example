package generics;


public class Apple extends Fruit {

    private static final float WEIGHT = 1.0f;

    public float getWeight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return "яблоко";
    }
}

