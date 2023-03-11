package Lesson21.Theory.TestSarkhan;

import java.util.ArrayList;
import java.util.List;

public class Base extends Thread {
    private static int a = 0;
    public synchronized static int getA() {
        return a;
    }

    public synchronized static void setA(int a) {
        Base.a += a;
    }

}
