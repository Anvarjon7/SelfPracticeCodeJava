package de.telran.javaProff.summary.iterator;

import java.util.Iterator;
import java.util.List;

public class SimpleExtractDataFromCollection {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,5,6,7,8,9);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Foreach");
        for (int j : list) {
            System.out.println(j);
        }
        System.out.println("=============================");

        list.stream().forEach(o -> System.out.println(o));
        System.out.println();
        list.forEach(o-> System.out.println(o));
        System.out.println();
        list.forEach(System.out::println);

        System.out.println("IteratorEx");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
