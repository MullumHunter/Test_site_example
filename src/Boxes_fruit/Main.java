package Boxes_fruit;

public class Main {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>();
        box1.addFruits(new Apple(), 3);
        Box<Apple> box2 = new Box<>();
        box2.addFruits(new Apple(), 7);


        Box<Orange> box3 = new Box<>();
        box3.addFruits(new Orange(), 3);
        Box<Orange> box4 = new Box<>();
        box4.addFruits(new Orange(), 7);

        Storage storage = new Storage(box1, box2, box3, box4);

        storage.boxesInStorage();

        box1.addFruits(new Apple(), 4);
        box1.transferFruits(box2);
        box1.compare(box2);

        System.out.println(box1.compare(box2));

        storage.boxesInStorage();


    }
}
