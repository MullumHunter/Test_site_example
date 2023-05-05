package OOP;

public class Team {

    private String name;
    private Turtle[] turtles;
    private boolean[] result;

    public Team(String name, Turtle... turtles) {
        this.name = name;
        this.turtles = turtles;
        this.result = new boolean[turtles.length];
    }

    public String getName() {
        return name;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public boolean[] getResult() {
        return result;
    }

    public void showResults() {
        System.out.println();
        System.out.println("Команда: " + name);

        for (int i = 0; i < turtles.length; i++) {
            System.out.println(turtles[i].getSuitColor() + ": " + (result[i] ? "успешно прошел." : "испытание не пройдено."));
        }
    }
}
