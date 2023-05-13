package Test_site_example.PATTERNS.singleton;

public class main {
    public static void main(String[] args) {

        System.out.println(Settings.getSettings());

        Program one = new Program("Hello");
        Program two = new Program("kkk");
        Program tree = new Program("Nop");

        Settings.getSettings().save(one);
        Settings.getSettings().save(two);
        Settings.getSettings().save(tree);


        String tryOne = Settings.getSettings().getSave();
        System.out.println(tryOne);


    }
}
