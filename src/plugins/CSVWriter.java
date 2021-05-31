package plugins;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVWriter {
    private BufferedWriter bw;
    private StringBuilder sb;
    private FileWriter fw;
    private File f;
    public CSVWriter(String name){
        try {
            this.bw = new BufferedWriter(new FileWriter(name));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void wirteDataToFile(ArrayList<String []> data)  {
        this.sb = new StringBuilder();
       for(String[] dataArray : data){
           for(String element : dataArray){
               this.sb.append(element);
               this.sb.append(",");
           }
       }
        try {
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

