package myTeam;

public class Main {
    public static void main (String[]args){

        Course course = new Course();
        Team team = new Team("Turtles", "Yellow","Green","Pink","Red","Black");

        team.showResults();
        course.doIt(team);
    }
}
