package myTeam;

public class Team {

    private String nameTeam;
    private Turtle[] turtles;
    private boolean[] result;

    public Team(String nameTeam, Turtle... turtles) {
        this.nameTeam = nameTeam;
        this.turtles = turtles;
        this.result = new boolean[turtles.length];
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public boolean[] getResult() {
        return result;
    }

    public void showResults() {
        System.out.println();
        System.out.println("Команда: " + nameTeam);

        for (int i = 0; i < turtles.length; i++) {
            System.out.println(turtles[i].getSuitСolor()  + ": " + (result[i] ? "успешно прошел." : "испытание не пройдено."));
        }
    }
}
