package Test_site_example.PATTERNS.Bilder;

public class HouseBuilder {
    private String houseType;
    private int floors;
    private int rooms;
    private boolean hasPool;

    public HouseBuilder(String houseType) {
        this.houseType = houseType;
    }

    public HouseBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public House build() {
        return new House(houseType, floors, rooms, hasPool);
    }
}

