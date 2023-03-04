package Lesson18.Lesson17.Teory;

public class myList implements Comparable<myList> {
    int num;

    public myList(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(myList o) {
        if (o.num % 2 == 0) {
            return this.num - o.num;
        } else return o.num - this.num;
    }
}
