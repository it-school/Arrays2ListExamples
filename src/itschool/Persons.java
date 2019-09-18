package itschool;

import java.util.ArrayList;
import java.util.Arrays;

public class Persons {
    public Person[] getList() {
        return list;
    }

    ArrayList<Person> list2;
    private Person[] list;

    public Persons() {
        this.list = new Person[0];
        this.list2 = new ArrayList<>();
    }

    public Persons(int length) {
        this.list = new Person[length];
        this.list2 = new ArrayList<>(length);
    }

    public void resize(int newLength)
    {
        Person[] tempList = new Person[newLength];
        tempList = Arrays.copyOf(this.list, newLength);

        this.list = tempList;
    }

    public void addToList(Person person)
    {
        list2.add(person);
    }

    public void add(Person person, int position) {
        if (position > list.length-1) {
            this.resize(position);
            list[position-1] = person;
        }
        else if (position > 0 && position < list.length)
            list[position-1] = person;
    }

        public void add(Person person)
    {
        int i = list.length-1;
        for (; i >= 0 && list[i] != null; i--);

        if (i == -1) {
            resize(list.length + 1);
            list[list.length-1] = person;
        }
        else
            list[i-1] = person;
    }

    public Person remove(int position)
    {
        if (position >=0 && position < list.length)
        {
            Person person = list[position-1];
            for (int i = position-1; i < list.length-1; i++) {
                list[i] = list[i+1];
            }

            resize(list.length-1);

            return person;
        }
        return null;
    }

    public void clear()
    {
        resize(0);
    }
}
