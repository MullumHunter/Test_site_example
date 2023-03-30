package myTeam;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){

        boolean[][] results = new boolean[team.getTurtles().length][obstacles.length];

        for(int j = 0; j < obstacles.length; j++){
            for(int i = 0; i < team.getTurtles().length; i++){
                    double chance = (team.getTurtles()[i].getPower() + obstacles[j].getHardLevel()) / 20.0;
                    double fortune = Math.random();
                    if(fortune < chance) {
                    results[i][j] = true;
                }
            }
        }

        for (int i = 0; i < team.getTurtles().length; i++) {
            int count = 0;

            System.out.println();
            System.out.println();
            System.out.println("Успехи  " + team.getTurtles()[i].getSuitСolor() + ": (сила " + team.getTurtles()[i].getPower()+")");

            for (int j = 0; j < obstacles.length; j++) {

                String result = results[i][j] ? "+" : "-";
                System.out.println("(сложность " +obstacles[j].getHardLevel()+") " +obstacles[j].getTitle() + ": " + result );

                if(results[i][j]){
                    count++;
                    if(count >= obstacles.length){
                        team.getResult()[i] = true;
                    }
                }
            }
        }
    }
}
