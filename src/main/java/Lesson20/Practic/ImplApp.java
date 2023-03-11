package Lesson20.Practic;

import java.io.IOException;
import java.util.List;

public class ImplApp {
    public static void main(String[] args) throws IOException {
        DecodeFile decodeFile = new DecodeFile("src/main/java/Lesson20/Practic/encriptFile");
        EncodeText encodeText = new EncodeText("src/main/java/Lesson20/Practic/TextFile");
        encodeText.readAndEncriptToFile("src/main/java/Lesson20/Practic/encriptFile");

        System.out.println(decodeFile.decodeFile());
    }
}
