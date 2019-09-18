package itschool;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100000);
        }
//        System.out.println(Arrays.toString(arr));
        int[]arrCopy =  Arrays.copyOf(arr, arr.length);
//        arrCopy[10] = -99999999;
//        arrCopy[11] = -999999999;

        //System.out.println(Arrays.compare(arr, arrCopy));
        //System.out.println(Arrays.deepEquals(arr, arrCopy));
        //System.out.println(Arrays.mismatch(arr, arrCopy));
        System.out.println("Start sort:");
        long start = System.nanoTime();
        Arrays.sort(arr);
        System.out.println(System.nanoTime() - start);

        System.out.println("Start paraller sort:");
        start = System.nanoTime();
        Arrays.parallelSort(arr);
        System.out.println(System.nanoTime() - start);
//        System.out.println(Arrays.toString(arr));



/*
        long start = System.nanoTime();
        Arrays.sort(arr);
        System.out.println(System.nanoTime() - start);
        int temp;
        start = System.nanoTime();
        for (int j = 0; j < arrCopy.length; j++) {
            for (int i = 0; i < arrCopy.length - 1 - j; i++) {
                if (arrCopy[i] > arrCopy[i + 1]) {
                    temp = arrCopy[i];
                    arrCopy[i] = arrCopy[i + 1];
                    arrCopy[i + 1] = temp;
                }
            }
        }
        System.out.println(System.nanoTime() - start);
*/

        //System.out.println("Sorted: " + Arrays.toString(arr));
        //System.out.println("Unsorted copy: " + Arrays.toString(arrCopy));

        //System.out.println(Arrays.binarySearch(arrCopy, 500));

        String names = "Dima,Maxim,Boris,Anton,Ed,Egor,Artem,Sanya";
        String []namesArray = names.split(",");
        Person[] people  = new Person[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("QQQ", 23);
            people[i].age = (int)(Math.random()*100);
            people[i].name = namesArray[(int)(Math.random()*namesArray.length)];
        }

        System.out.println(Arrays.toString(people));
        Arrays.sort(people, Person.ByNameASC());
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, Person.ByAge);
        System.out.println(Arrays.toString(people));

        System.out.println("/n--------------------------------------/n");
        Persons persons = new Persons(1);
        persons.add(new Person("John", 12), 1);
        System.out.println(Arrays.toString(persons.getList()));
        persons.resize(5);
        persons.add(new Person("John 2", 22), 2);
        persons.add(new Person("John 3", 32),3);
        System.out.println(Arrays.toString(persons.getList()));
        persons.add(new Person("New", 99));
        System.out.println("\nAfter adding:\n"+Arrays.toString(persons.getList()));
        persons.add(new Person("NewNew", 45), 2);
        System.out.println("\nAfter another adding:\n"+Arrays.toString(persons.getList()));
        System.out.println(persons.remove(2));
        System.out.println("\nAfter removing:\n"+Arrays.toString(persons.getList()));
    }
}
