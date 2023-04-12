package OOP.Competitions_turtle;

public class Obstacle {

    private final String title;
    private final int hardLevel;

    public Obstacle(String title) {
        this.title = title;
        this.hardLevel = (int) (Math.random() * 5) + 3;
    }

    public String getTitle() {
        return title;
    }

    public int getHardLevel() {
        return hardLevel;
    }

}
