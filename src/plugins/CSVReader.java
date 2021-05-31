package plugins;

import java.io.*;
import java.util.ArrayList;

public class CSVReader {
    private BufferedReader br;

    public CSVReader(String name) {
        try {
            this.br = new BufferedReader(new FileReader(name));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> read() {
        ArrayList<String[]> dataList = new ArrayList<String []>();
        String row;
        try {
            while ((row = this.br.readLine()) != null) {
                dataList.add(row.split(","));
            }
            return dataList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
