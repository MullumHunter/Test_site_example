package Test_site_example.PATTERNS.Bilder;

public class House {
    private String houseType;
    private int floors;
    private int rooms;
    private boolean hasPool;

    @Override
    public String toString() {
        return "Дом " +
                "Стиль " + houseType +
                " этажей " + floors +
                " комнаты " + rooms +
                " бассейн " + hasPool;
    }

    House(String houseType, int floors, int rooms, boolean hasPool) {
        this.houseType = houseType;
        this.floors = floors;
        this.rooms = rooms;
        this.hasPool = hasPool;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public static HouseBuilder builder(String houseType) {
        return new HouseBuilder(houseType);
    }
}

