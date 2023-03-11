package Lesson20.Practic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EncodeText {
    private String path;

    public EncodeText(String path) {
        this.path = path;
    }

    public void readAndEncriptToFile(String destinationPath) throws IOException {
        int i = 0;
        FileReader reader = new FileReader(path);
        FileWriter fileWriter = new FileWriter(destinationPath);
        List<Integer> list = new ArrayList<>();

        while ((i = reader.read()) != -1) {
            fileWriter.write(Integer.toString(i, 16) + " ");
        }
        reader.close();
        fileWriter.close();
    }
}
