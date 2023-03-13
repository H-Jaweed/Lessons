package Lesson21.Theory.Lesson.LessonTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileAndRun {
    public static void main(String[] args) throws IOException, InterruptedException {
        compile();
        run();
    }

    public static void compile() {
        try {
            new ProcessBuilder().command("cmd.exe", "/c", "javac C:\\IO\\App.java").start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("App.java file compiled successfully");
    }

    public static void run() throws IOException {
        Process process = new ProcessBuilder().command("cmd.exe", "/c", "java -cp C:\\IO App").start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println("\n"+line);
        }
        reader.close();
    }
}
