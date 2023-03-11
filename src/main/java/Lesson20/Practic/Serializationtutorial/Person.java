package Lesson20.Practic.Serializationtutorial;

public class Person  {

    private String surName;
     private int age;
    Person2 person2 = new Person2();

    public Person() {
    }

    public Person(String surName, int age) {
        this.surName = surName;
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Surname: " + this.surName + " Age: " + this.age;
    }
}
