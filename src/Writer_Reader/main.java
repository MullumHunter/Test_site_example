package Test_site_example.Writer_Reader;




public class main {
    public static void main(String[] args) {

        AppData appData = new AppData();
        appData.read("res/Gierls.csv");
        appData.save("res/myGierls.csv");
        appData.save("res/myGierls.txt");

//        ClassLoader classLoader = main.class.getClassLoader();
//        String path = classLoader.getResource("Gierls.csv").getPath();
//
//        System.out.println(path);
    }

}
