package Writer_Reader;




public class main {
    public static void main(String[] args) {

        AppData appData = new AppData();

        appData.read("res/Gierls.csv");
        appData.save("res/myGierls.csv");


    }

}
