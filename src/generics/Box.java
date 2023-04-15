package generics;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public void addFruits(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            fruits.add(fruit);
        }
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        } else {
            return fruits.size() * fruits.get(0).getWeight();
        }
    }

    public void transferFruits(Box<T> boxNext) {
        boxNext.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    @Override
    public String toString() {
        return "box " + getWeight() + fruits;
    }
}
