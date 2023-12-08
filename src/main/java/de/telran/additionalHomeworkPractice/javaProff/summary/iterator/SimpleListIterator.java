package de.telran.javaProff.summary.iterator;

import java.util.List;
import java.util.ListIterator;

public class SimpleListIterator {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,5,6,7,8,9);

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            int el = listIterator.next();
            System.out.println(el);
        }
        System.out.println();

        while (listIterator.hasPrevious()){
            int el = listIterator.previous();
            if (el == 5)
//                listIterator.add(21); пока не поддерживается
            System.out.println(el);
        }
    }

}
