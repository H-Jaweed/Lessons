package Lesson17.Practic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(45));
        personList.add(new Person(21));
        personList.add(new Person(33));
        personList.add(new Person(87));
        personList.add(new Person(56));
        Collections.sort(personList);

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).id);
        }
    }
}
