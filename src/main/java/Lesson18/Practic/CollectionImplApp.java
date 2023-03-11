package Lesson18.Practic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class CollectionImplApp {
    public static void main(String[] args) {
        Random r = new Random();

        HashSet hashset = new HashSet();
        TreeSet treeset = new TreeSet();
        LinkedHashSet linkedset = new LinkedHashSet();

// start time
        long starttime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            hashset.add(new dog(x));
        }
// end time
        long endtime = System.nanoTime();
        long duration = endtime - starttime;
        System.out.println("hashset: " + duration);

// start time
        starttime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            treeset.add(new dog(x));
        }
// end time
        endtime = System.nanoTime();
        duration = endtime - starttime;
        System.out.println("treeset: " + duration);

// start time
        starttime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = r.nextInt(1000 - 10) + 10;
            linkedset.add(new dog(x));
        }
// end time
        endtime = System.nanoTime();
        duration = endtime - starttime;
        System.out.println("linkedhashset: " + duration);

    }

}
class dog {
    int size;

    public dog(int s) {
        size = s;
    }

    public String tostring() {
        return size + "";
    }
}
