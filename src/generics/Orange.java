package generics;


public class Orange extends Fruit {
    private static final float WEIGHT = 1.5f;

    public float getWeight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return "апельсин";
    }

}