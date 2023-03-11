package Lesson20.Theory;

import static java.lang.Class.forName;

public class ReflectionApp {
    public static void main(String[] args) throws ClassNotFoundException {
        Class s = Class.forName("Lesson20.Theory.User");
        System.out.println(s.getName());
        User.class.getName();
    }

    public static void met(int... arg) {

    }
}
