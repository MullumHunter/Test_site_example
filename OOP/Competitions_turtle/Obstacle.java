package myTeam;

public class Obstacle {

    private  String title;
    private  int hardLevel = (int) (Math.random() * 5) + 3;

    public Obstacle(String title) {
        this.title = title;
        this.hardLevel = hardLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHardLevel() {
        return hardLevel;
    }

    public void setHardLevel(int hardLevel) {
        this.hardLevel = hardLevel;
    }
}
