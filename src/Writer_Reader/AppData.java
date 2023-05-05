package Writer_Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;
    private String DELIMITER = ";";

    public void read(String filepath) {
        header = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            List<int[]> list = new ArrayList<>();
            String line;
            int lineNum = 0;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
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
                data = list.toArray(new int[0][]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void save(String filepath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {

            StringBuffer oneLine = new StringBuffer();
            for (String h : header) {
                oneLine.append(h);
                oneLine.append(DELIMITER);
            }
            writer.write(oneLine.toString());
            writer.newLine();
            oneLine.delete(0, oneLine.length());

            for (int[] row : data) {
                for (int cell : row) {
                    oneLine.append(cell);
                    oneLine.append(DELIMITER);
                }
                writer.write(oneLine.toString());
                writer.newLine();
                oneLine.delete(0, oneLine.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
