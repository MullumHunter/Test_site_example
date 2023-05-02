package home.Writer_Reader;

import java.io.*;

public class User {
    private String[] header;
    private int[][] num;


    public User(String[] heder, int[][] num) {
        this.header = heder;
        this.num = num;
    }

    public void writer() {
        try (PrintWriter writer = new PrintWriter("./csv")) {
            for (String h : header) {
                writer.print(h);
                writer.print(";");
            }
            writer.println();

            for (int[] tokens : num) {
                for (int token : tokens) {
                    writer.print(token);
                    writer.print(";");
                }
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void read() {
        try (BufferedReader br = new BufferedReader(new FileReader("./csv"))) {
            String result;
            while ((result = br.readLine()) != null) {
                String[] tokens = result.split("\\s");
                for (String token : tokens) {
                    System.out.print(token + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
