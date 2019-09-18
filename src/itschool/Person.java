package itschool;

import java.util.Comparator;

public class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    public static Comparator<Person> Comapare(Object p1, Object p2)
//    {
//        return ((Person)p1).name.compareTo(((Person)p2).name);
//    }

    public static Comparator<Person> ByNameASC() {return (o1, o2) -> o1.name.compareTo(o2.name); }
    public static Comparator<Person> ByAge = (o1, o2) -> (o1.age < o2.age ? -1 : (o1.age > o2.age ? 1 : 0));
}
