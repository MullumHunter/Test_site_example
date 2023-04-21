package oop;

public class Course {
    private final Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {

        Turtle[] teamTurtles = team.getTurtles();
        boolean[][] results = new boolean[teamTurtles.length][obstacles.length];

        for (int j = 0; j < obstacles.length; j++) {
            for (int i = 0; i < teamTurtles.length; i++) {
                double chance = (teamTurtles[i].getPower() + obstacles[j].getHardLevel()) / 20.0;
                double fortune = Math.random();
                if (fortune < chance) {
                    results[i][j] = true;
                }
            }
        }

        for (int i = 0; i < teamTurtles.length; i++) {
            int count = 0;

            System.out.println();
            System.out.println();
            System.out.println("Успехи  " + teamTurtles[i].getSuitColor() + ": (сила " + teamTurtles[i].getPower() + ")");

            for (int j = 0; j < obstacles.length; j++) {

                String result = results[i][j] ? "+" : "-";
                System.out.println("(сложность " + obstacles[j].getHardLevel() + ") " + obstacles[j].getTitle() + ": " + result);

                if (results[i][j]) {
                    count++;
                    if (count >= obstacles.length) {
                        team.getResult()[i] = true;
                    }
                }
            }
        }
    }
}
