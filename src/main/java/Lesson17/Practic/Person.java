package Lesson17.Practic;

public class Person implements Comparable<Person> {
    int id;

    Person(int a) {
        this.id = a;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.id - o.id;
        return result;
    }
}
