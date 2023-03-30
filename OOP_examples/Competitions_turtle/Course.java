package myTeam;

public class Course {

    String[] nameCourse = {"jumping","running","swimming"};
    public void doIt(Team team){

        boolean[][] results = new boolean[team.getMembers().length][nameCourse.length];

        for(int j = 0; j < nameCourse.length; j++){
            for(int i = 0; i < team.getMembers().length; i++){
                if(Math.random() < 0.8){
                    results[i][j] = true;
                }
            }
        }

        for (int i = 0; i < team.getMembers().length; i++) {
            int coint = 0;
                System.out.println();
                System.out.println();
                System.out.println("Успехи  " + team.getMembers()[i] + ": ");

                for (int j = 0; j < nameCourse.length; j++) {
                    String result = results[i][j] ? "+" : "-";
                    System.out.println(nameCourse[j] + ": " + result);

                if(results[i][j]){
                    coint++;
                    if(coint>=nameCourse.length){
                        team.getResult()[i] = true;
                    }
                }
            }
        }
    }
}
