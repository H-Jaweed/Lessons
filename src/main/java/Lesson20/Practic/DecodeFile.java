package Lesson20.Practic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DecodeFile {
    String path;
    public DecodeFile(String path) {
        this.path = path;
    }

    public String decodeFile() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)));
        String[] array = content.split(" ");
        int i = 0;
        StringBuilder str = new StringBuilder();
        for (String ar : array) {
            i = Integer.valueOf(ar, 16);
            str.append((char) i);
        }
        return str.toString();
    }
}
