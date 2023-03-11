package Lesson20.Practic.Reflectiontutorual;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person();
        Person2 person2 = new Person2();
        Class<? extends Person> c1 = person.getClass();

        Method m = c1.getDeclaredMethod("Method4", int.class);
        m.setAccessible(true);
        System.out.println(Modifier.toString(m.getModifiers()));
        m.invoke(person, 21);

        Method m1 = c1.getDeclaredMethod("Metod1");
        m1.invoke(null);


        Field f1 = c1.getDeclaredField("count");
        f1.setAccessible(true);
        f1.set(person, 25);
        System.out.println(f1.get(person));


        //   System.out.println(Modifier.toString(c1.getMethod("Method4").getModifiers()));
        //  c1.getMethod("Method4").invoke(person);
    }
}
