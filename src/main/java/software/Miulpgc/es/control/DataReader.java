package software.Miulpgc.es.control;

import software.Miulpgc.es.model.DataRegister;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataReader {

    private List<DataRegister> RegistersList;

    public DataReader(List<DataRegister> registersList) {
        RegistersList = registersList;
    }

    public List<DataRegister> getRegistersList() {
        return RegistersList;
    }

    public void RegisterList_completioner() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("title.ratings.tsv"));
        reader.readLine();
        while (true){
            try {
                String line = reader.readLine();
                if (line == null) break;
                String[] fields = line.split("\\s+");
                RegistersList.add(new DataRegister(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2])));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
