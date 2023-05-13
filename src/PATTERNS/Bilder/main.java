package Test_site_example.PATTERNS.Bilder;

public class main {
    public static void main(String[] args) {

        House house = House.builder("Коттедж")
                .setFloors(3)
                .setRooms(6)
                .setHasPool(true)
                .build();
        System.out.println(house);

        House house2 = House.builder("Деревенский")
                .setFloors(1)
                .setRooms(2)
                .build();
        System.out.println(house2);
    }
}
