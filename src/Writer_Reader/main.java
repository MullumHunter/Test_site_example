package Writer_Reader;


public class main {
    public static void main(String[] args) {

        AppData appData = new AppData();

        appData.read("resources/Gierls.csv");
        appData.save("resources/myGierls.csv");


    }

}
