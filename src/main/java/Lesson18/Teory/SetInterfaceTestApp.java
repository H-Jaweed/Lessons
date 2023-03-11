package Lesson18.Teory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceTestApp {

    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        list.add(12);
        list.add(32);
        list.add(42);
        list.add(22);
        Iterator it = list.iterator();
        it.hasNext();
    }
}
