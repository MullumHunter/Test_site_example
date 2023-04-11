package Boxes_fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class Storage {
    private final ArrayList<Box<?>> boxes;

    public Storage(Box<?>... boxes) {
        this.boxes = new ArrayList<>(Arrays.asList(boxes));
    }

    public void swapBoxes(int boxA, int boxB) {
        if (boxA < 0 || boxA >= boxes.size() || boxB < 0 || boxB >= boxes.size()) ;
        Box<?> temp = boxes.get(boxA);
        boxes.set(boxA, boxes.get(boxB));
        boxes.set(boxB, temp);
    }

    public void boxesInStorage() {
        for (int i = 0; i < boxes.size(); i++) {
            System.out.println("Коробка " + i + ": " + boxes.get(i));
        }
    }


}
