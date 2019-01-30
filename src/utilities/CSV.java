package utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // read data from a CSV file and return as a list
    public static List<String[]> read(String flie){
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(flie));

            while((dataRow = br.readLine()) != null) {
                String[] dataRecord = dataRow.split(",");
                data.add(dataRecord);
            }
        }catch (FileNotFoundException e){
            System.out.println("Could Not Find File");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("Could Not Read File");
            e.printStackTrace();
        }

        return data;
    }
}
