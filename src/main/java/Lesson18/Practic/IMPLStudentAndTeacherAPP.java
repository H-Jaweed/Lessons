package Lesson18.Practic;

import java.util.HashMap;
import java.util.Map;

public class IMPLStudentAndTeacherAPP {
    public static void main(String[] args) {
        Teacher cavid = new Teacher("Cavid", 33);
        Teacher fuad = new Teacher("Fuad", 35);
        Student mehmam = new Student("Mehman", 28);
        Student ashraf = new Student("Ashraf", 28);
        Student nijat = new Student("Nijar", 28);
        Student konul = new Student("Konul", 28);
        HashMap<Teacher, Student> classroom = new HashMap<>();
        classroom.put(cavid, mehmam);
        classroom.put(fuad, nijat);

        System.out.println(classroom.get(cavid).toString());



    }
}
