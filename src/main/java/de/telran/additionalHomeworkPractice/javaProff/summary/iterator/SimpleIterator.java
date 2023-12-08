package de.telran.javaProff.summary.iterator;

import java.util.*;

public class SimpleIterator {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>();

        myIntList.add(2);
        myIntList.add(5);
        myIntList.add(6);
        myIntList.add(7);
        myIntList.add(8);
        myIntList.add(9);
        System.out.println(myIntList);


        Iterator<Integer> iterator = myIntList.iterator();

        while (iterator.hasNext()){
            int elItr = iterator.next();
            System.out.println(elItr);
            if (elItr % 2 == 0)
                iterator.remove();
        }

        System.out.println();

        for (int el : myIntList) {
            System.out.println(el);
        }

        System.out.println();

        for (int i = 0; i < myIntList.size(); i++) {
            System.out.println(myIntList.get(i));
        }

        List<Cat> catList = Arrays.asList(new Cat("Mura",4),
                                         new Cat("Barsik",6));

        System.out.println();

        Iterator<Cat> catIterator = catList.iterator();
        while (catIterator.hasNext()){
            Cat cat = catIterator.next();
            System.out.println(cat);
            cat.setAge(cat.getAge() + 2);
        }
        System.out.println(catList);

        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);

        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
