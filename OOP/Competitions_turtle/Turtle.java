package myTeam;

public class Turtle {

    private String suitСolor;
    private int power = (int) (Math.random() * 5) + 3;;

    public Turtle(String suitСolor){
        this.suitСolor = suitСolor;
        this.power = power;
    }

    public String getSuitСolor() {
        return suitСolor;
    }

    public int getPower() {
        return power;
    }

    public void setSuitСolor(String suitСolor) {
        this.suitСolor = suitСolor;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
