package Writer_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;


    public void read(String filepath) {

        List<int[]> list;

        list = new ArrayList<>();
        header = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            int lineNum = 0;

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");
                if (lineNum == 0) {
                    header = tokens;
                } else {
                    int[] row = new int[tokens.length];
                    for (int i = 0; i < tokens.length; i++) {
                        row[i] = Integer.parseInt(tokens[i]);
                    }
                    list.add(row);
                }
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        data = list.toArray(new int[0][]);
    }

    public void save(String filepath) {

        try (FileWriter writer = new FileWriter(filepath)) {

            for (String h : header) {
                writer.write(h);
                writer.write(";");
            }
            writer.write("\n");

            for (int[] row : data) {
                for (int cell : row) {
                    writer.write(Integer.toString(cell));
                    writer.write(";");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
