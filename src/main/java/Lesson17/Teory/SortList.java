package Lesson17.Teory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<myList> list = new ArrayList<>();
        list.add(new myList(12));
        list.add(new myList(36));
        list.add(new myList(21));
        list.add(new myList(24));
        list.add(new myList(97));
        list.add(new myList(32));
        list.add(new myList(29));
        list.add(new myList(19));
        list.add(new myList(6));
        list.add(new myList(9));

        List<myList> singleNumbers = new ArrayList<>();
        List<myList> doubleNumbers = new ArrayList<>();

        for (myList ls : list) {
            if (ls.num % 2 == 0) {
                singleNumbers.add(ls);
            }
            else {
                doubleNumbers.add(ls);
            }
        }

        Collections.sort(singleNumbers);

        Collections.sort(doubleNumbers);

        for (myList ls : singleNumbers) {
            System.out.print(ls.num + " ");
        }

        System.out.println();

        for (myList ls : doubleNumbers) {
            System.out.print(ls.num + " ");
        }
    }
}
