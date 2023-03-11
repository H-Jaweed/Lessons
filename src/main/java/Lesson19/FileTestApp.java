package Lesson19;

import java.io.*;

public class FileTestApp {
    static File sourceFile = new File("C:/IO/image.png");
    static String destinationFile = "C:/IO/imageCopy.png";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CheckFile("sdaas");

    }

    public static byte[] fileReader(File file) {
        byte[] array = null;
        try {
            FileInputStream inputStream = new FileInputStream(file);
            array = inputStream.readAllBytes();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I cant read all byte from file");
        }
        return array;
    }

    public static void writeFile(String pathname, byte[] bytecode) throws IOException {
        File file = new File(pathname);
        if (!file.isFile()) {
            file.createNewFile();
        }
        FileOutputStream fs = new FileOutputStream(pathname, false);
        fs.write(bytecode);
        System.out.println("Success...");
    }

    public static void writeTXT(String test, String path) throws IOException {
        Writer wr = new BufferedWriter(new FileWriter(path, true));
        wr.write(test);
        wr.flush();
    }

    public static void objWriter(String path) throws IOException {
        OutputStream ou = new FileOutputStream("C:/IO/Test.txt");
        ObjectOutputStream obj = new ObjectOutputStream(ou);
        obj.writeObject(new User());
        obj.flush();
    }

    public static Object objReader(String path) throws IOException, ClassNotFoundException {
        InputStream stream = new FileInputStream(path);
        ObjectInputStream obj = new ObjectInputStream(stream);
        return obj.readObject();
    }
    public static void RandomAccessFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }

    public static void CheckFile(String fileName) {
        File file = new File("C:/");
        File[] list = file.listFiles();
        for (int i = 0; i < list.length; i++) {

        }
    }
}
