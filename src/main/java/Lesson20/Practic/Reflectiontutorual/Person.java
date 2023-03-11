package Lesson20.Practic.Reflectiontutorual;

public class Person {

    private String getSurname;
    public String surname;
    String region;
    public static int age;
    protected final int count=1;


    public  Person() {

    }

    public Person(String getSurname, String surname, String region) {
        this.getSurname = getSurname;
        this.surname = surname;
        this.region = region;
    }

    public Person(String getSurname, String surname) {
        this.getSurname = getSurname;
        this.surname = surname;
    }

    public static void Metod1() {
        System.out.println("This is static method");
    }

    public void Method2() {
        System.out.println("This is method2");
    }

    public void Method3(String ars) {
        System.out.println(ars);
    }

    private void Method4(int a ) {
        System.out.println("This is method4 and a is: " + a);
    }

}
