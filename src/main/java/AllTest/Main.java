package AllTest;

import javax.print.DocFlavor;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
      /*  int[] arr = new int[]{};
        System.out.println(arr.length);

        Parent obj = new Child();
        System.out.println("This is a" + obj.a); //10
        obj.print();//  inside child
        Child obj2 = new Child();
        System.out.println("This is a obj 2" + obj.a);//20
        obj2.print(); //child
*/
        /*PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("D");
        queue.add("E");
        queue.add("C");
        queue.add("B");
        queue.add("F");
        System.out.println(queue);*/
        FileWriter writer = new FileWriter("src/main/java/AllTest/csvFile.csv", true);
        writer.write("\nCavid;Haciyev;32");
        writer.close();
        System.out.println("YAzildi");
        FileReader reader = new FileReader("src/main/java/AllTest/csvFile.csv");



    }
}
