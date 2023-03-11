package Lesson21.Theory.TestSarkhan;

public class MyConsumer extends Thread {

    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
    /*    while (true) {
            int lastElement = Base.list.size() - 1;
            if (lastElement > -1) {
                String s = Base.list.remove(lastElement);
                System.out.println("s = " + s);
            }

        }*/
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Base.setA(1);
        System.out.println("Cavid base: "+Base.getA());

    }
}

