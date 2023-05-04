package home.Writer_Reader;


import static home.Writer_Reader.AppData.read;

public class main {
    public static void main(String[] args) {

//        String[] heder = {"One","Two","Three"};
//        int[][] num = {{111,222,333},{444,555,666},{777,888,999}};
//
//
//        User user = new User(heder,num);
//        user.writer();
//        user.read();

        AppData appData = read("Gierls.csv");
        appData.save("myGierls.csv");

    }

}
