package Writer_Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;
    private final String DELIMITER = ";";

    public void read(String filepath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            List<int[]> parsedValues = new ArrayList<>();
            header = reader.readLine().split(DELIMITER);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                int[] row = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    row[i] = Integer.parseInt(tokens[i]);
                }
                parsedValues.add(row);
            }

            data = parsedValues.toArray(new int[][]{});
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
            writeAndClearBuffer(writer, oneLine);

            for (int[] row : data) {
                for (int cell : row) {
                    oneLine.append(cell);
                    oneLine.append(DELIMITER);
                }
                writeAndClearBuffer(writer, oneLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeAndClearBuffer(BufferedWriter writer, StringBuffer oneLine) throws IOException {
        writer.write(oneLine.toString());
        writer.newLine();
        oneLine.delete(0, oneLine.length());
    }
}
