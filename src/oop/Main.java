package OOP;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(new Obstacle("running"),
                new Obstacle("jumping"),
                new Obstacle("swimming"));

        Team team = new Team("Turtles",
                new Turtle("Yellow"),
                new Turtle("Green"),
                new Turtle("White"));

        course.doIt(team);
        team.showResults();

        example();
    }

    public static void example() {
        Human human = new Human("Sasha", "Shumilin");

        System.out.println(human.toString());
        System.out.println(human.hashCode());
    }
}
