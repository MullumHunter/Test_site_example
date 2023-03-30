package myTeam;

public class Team {

    private String nameTeam;
    private String[] members;
    private boolean[] result;

    Team(String nameTeam, String ... members){
        this.nameTeam = nameTeam;
        this.members = members;
        this.result = new boolean[members.length];
    }

    public String getNameTeam(){
        return nameTeam;
    }

    public String[] getMembers(){
        return members;
    }

    public boolean[] getResult(){
        return result;
    }


    public void showResults(){
        System.out.println();
        System.out.println();
        System.out.println("Команда: " + nameTeam);
        System.out.println();

        for(int i = 0; i < members.length; i++){
            System.out.println(members[i] + ": " + (result[i] ? "успешно прошел." : "испытание не пройденно."));
        }
    }
}
