package Lesson20.Practic.Serializationtutorial;

import com.google.gson.Gson;

import java.io.*;
import java.util.List;

public class SerializationApp {

    public static void main(String[] args) throws ClassNotFoundException {
//        serializeJson();
//        readFromJson();

    }

    public static void serializeJson() {
        Person p1 = new Person("Cavid", 32);
        Person p2 = new Person("Fuad", 23);
        Gson gson = new Gson();

        String json = gson.toJson(List.of(p1, p2));

        try (FileWriter fileWriter = new FileWriter("src/main/java/Lesson20/Practic/Serializationtutorial/PersonDataJson.txt")) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File writed successfuly");

    }

    public static void readFromJson() {
        String str = "";
        BufferedReader bufferedReader = null;
        try {
            FileReader reader = new FileReader("src/main/java/Lesson20/Practic/Serializationtutorial/PersonDataJson.txt");
            bufferedReader = new BufferedReader(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        assert bufferedReader != null;
        Person[] person = gson.fromJson(bufferedReader, Person[].class);

        for (Person person1 : person) {

            System.out.println(person1.getAge());
        }

    }

    public static void writeObject(String path, Person person) {
        Person cavid = new Person();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(person);
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Object writed to object successfull");
    }

    public static Object readObject(String path) {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                return objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
