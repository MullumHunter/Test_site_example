package Test_site_example.PATTERNS.Fabric;

public class main {
    public static void main(String[] args) {

        Creater creater = new Creater();
        Grow grow = creater.growit("People");
        grow.growing();

        Creater creater2 = new Creater();
        Grow grow2 = creater2.growit("Flowers");
        grow2.growing();
    }
}
