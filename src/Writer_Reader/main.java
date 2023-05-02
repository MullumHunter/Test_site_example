package home.Writer_Reader;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

       String[] heder = {"One","Two","Three"};
       int[][] num = {{111,222,333},{444,555,666},{777,888,999}};


       User user = new User(heder,num);
       user.writer();
       user.read();

    }
}