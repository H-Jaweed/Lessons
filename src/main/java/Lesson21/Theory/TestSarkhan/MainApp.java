package Lesson21.Theory.TestSarkhan;

public class MainApp {
    public static void main(String[] args) {
     /*   MyProduce p1 = new MyProduce();
        MyConsumer c1 = new MyConsumer("Cavid");
        MyConsumer c2 = new MyConsumer("Fuad");
        MyConsumer c3 = new MyConsumer("Kamran");
        MyConsumer c4 = new MyConsumer("Fariz");
        MyConsumer c5 = new MyConsumer("Eldar");

        p1.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();*/


        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new MyConsumer("Test"));
        }
        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
        System.out.println("Main Base a: " +Base.getA());
    }
}
